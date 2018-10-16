package xin.lrvik.smilemovie.ui.fragment

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chad.library.adapter.base.BaseQuickAdapter
import kotlinx.android.synthetic.main.fragment_movies.*
import lrvik.xin.base.ui.fragment.BaseMvpFragment
import org.jetbrains.anko.support.v4.startActivity
import xin.lrvik.datacenter.pojo.Film
import xin.lrvik.datacenter.pojo.PageInfo
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.injection.component.DaggerFilmComponent
import xin.lrvik.smilemovie.presenter.MoviesPresenter
import xin.lrvik.smilemovie.presenter.view.MoviesView
import xin.lrvik.smilemovie.ui.activity.FilmDetailActivity
import xin.lrvik.smilemovie.ui.adapter.RvMoviesAdapter

class MoviesFragment : BaseMvpFragment<MoviesPresenter>(), MoviesView {

    lateinit var type: String

    private var partInfos: ArrayList<Film> = ArrayList()

    lateinit var rvMoviesAdapter: RvMoviesAdapter

    var curPage: Int = 1

    override fun injectComponent() {
        DaggerFilmComponent.builder().activityComponent(activityComponent).build().inject(this)
        mPresenter.mView = this
    }

    override fun onMoviesResult(data: PageInfo) {
        //会有2种情况，1，初始化来的数据，2，上拉加载来的数据

        //下拉刷新
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

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        this.type = arguments!!.getString(TYPE)
        return inflater.inflate(R.layout.fragment_movies, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mSwipeRefresh.setOnRefreshListener {
            curPage = 1
            mPresenter.moviesData(type, curPage)
        }
        mRvMovie.layoutManager = GridLayoutManager(context, 3)
        rvMoviesAdapter = RvMoviesAdapter(partInfos)
        rvMoviesAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN)
        mRvMovie.adapter = rvMoviesAdapter

        rvMoviesAdapter.setOnLoadMoreListener({
            mPresenter.moviesData(type, ++curPage)
        }, mRvMovie)

        rvMoviesAdapter.setOnItemClickListener { adapter, view, position ->
            var film = adapter.data[position] as Film
            startActivity<FilmDetailActivity>("FILMURL" to film.detailUrl)
        }
        mSwipeRefresh.isRefreshing = true
        mPresenter.moviesData(type, curPage)
    }


    companion object {
        val TYPE = "TYPE"

        fun newInstance(type: String): MoviesFragment {
            var f = MoviesFragment()
            var b = Bundle()
            b.putString(TYPE, type)
            f.setArguments(b)
            return f
        }

    }


}
