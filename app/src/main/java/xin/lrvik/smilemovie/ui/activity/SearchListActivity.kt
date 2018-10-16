package xin.lrvik.smilemovie.ui.activity

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.MenuItem
import com.chad.library.adapter.base.BaseQuickAdapter
import kotlinx.android.synthetic.main.activity_search_list.*
import lrvik.xin.base.common.BaseApplication.Companion.context
import lrvik.xin.base.ui.activity.BaseMvpActivity
import org.jetbrains.anko.startActivity
import xin.lrvik.datacenter.pojo.Film
import xin.lrvik.datacenter.pojo.PageInfo
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.injection.component.DaggerFilmComponent
import xin.lrvik.smilemovie.presenter.SearchListPresenter
import xin.lrvik.smilemovie.presenter.view.SearchListView
import xin.lrvik.smilemovie.ui.adapter.RvMoviesAdapter

class SearchListActivity : BaseMvpActivity<SearchListPresenter>(), SearchListView {

    private var partInfos: ArrayList<Film> = ArrayList()
    lateinit var rvMoviesAdapter: RvMoviesAdapter
    var curPage: Int = 1
    lateinit var query: String

    override fun onSearchList(data: PageInfo) {
        if (curPage <= data.maxPage) {
            if (mSwipeRefresh.isRefreshing) {
                mSwipeRefresh.isRefreshing = false
                rvMoviesAdapter.setNewData(data.films)
                rvMoviesAdapter.notifyDataSetChanged()
            } else {//上拉加载数据
                if (data.curPage == data.maxPage) {//到底了
                    rvMoviesAdapter.loadMoreEnd()
                } else {//还可以上拉
                    rvMoviesAdapter.loadMoreComplete()
                }
                rvMoviesAdapter.addData(data.films)
            }

            curPage = data.curPage
        } else {
            rvMoviesAdapter.loadMoreEnd()
        }
    }

    override fun injectComponent() {
        DaggerFilmComponent.builder().activityComponent(activityComponent).build().inject(this)
        mPresenter.mView = this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_list)
        initView()
    }

    private fun initView() {
        query = intent.getStringExtra("QUERY")
        setSupportActionBar(mToolbar)
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.title = "搜索结果:$query"
        }

        mSwipeRefresh.setOnRefreshListener {
            curPage = 1
            mPresenter.getSearchList(query, curPage)
        }
        mRvMovie.layoutManager = GridLayoutManager(context, 3)
        rvMoviesAdapter = RvMoviesAdapter(partInfos)
        rvMoviesAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN)
        mRvMovie.adapter = rvMoviesAdapter

        rvMoviesAdapter.setOnLoadMoreListener({
            mPresenter.getSearchList(query, ++curPage)
        }, mRvMovie)

        rvMoviesAdapter.setOnItemClickListener { adapter, view, position ->
            var film = adapter.data[position] as Film
            startActivity<FilmDetailActivity>("FILMURL" to film.detailUrl)
        }
        mSwipeRefresh.isRefreshing = true

        mPresenter.getSearchList(query, curPage)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
