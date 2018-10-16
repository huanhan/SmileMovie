package xin.lrvik.smilemovie.ui.activity

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.miguelcatalan.materialsearchview.MaterialSearchView
import com.zhy.view.flowlayout.FlowLayout
import com.zhy.view.flowlayout.TagAdapter
import kotlinx.android.synthetic.main.activity_movie_search.*
import lrvik.xin.base.ui.activity.BaseMvpActivity
import org.jetbrains.anko.dip
import org.jetbrains.anko.margin
import org.jetbrains.anko.toast
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.injection.component.DaggerFilmComponent
import xin.lrvik.smilemovie.presenter.MovieSearchPresenter
import xin.lrvik.smilemovie.presenter.view.MovieSearchView

class MovieSearchActivity : BaseMvpActivity<MovieSearchPresenter>(), MovieSearchView {


    internal var colors = intArrayOf(Color.parseColor("#90C5ED"), Color.parseColor("#92CED6"), Color.parseColor("#F69153"), Color.parseColor("#BFAED0"), Color.parseColor("#E58F8E"), Color.parseColor("#66CCB7"), Color.parseColor("#F4BB7E"), Color.parseColor("#90C5ED"), Color.parseColor("#F79153"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_search)
        initView()
    }


    private fun initView() {

        //设置搜索按钮
        mSearchView.setHint("你想看的这里都有♪(´ε｀)")
        mSearchView.setVoiceSearch(false)
        //mSearchView.setCursorDrawable(R.drawable.custom_cursor)
        mSearchView.setEllipsize(true)
        mSearchView.setSuggestions(resources.getStringArray(R.array.query_suggestions))
        mSearchView.setOnQueryTextListener(object : MaterialSearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                //todo 跳转到搜索展示界面
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                return false
            }
        })
        mSearchView.setSubmitOnClick(true)
        mSearchView.setOnSearchViewListener(object : MaterialSearchView.SearchViewListener {
            override fun onSearchViewShown() {
            }

            override fun onSearchViewClosed() {
                finish()
            }
        })

        mPresenter.getHotKeys()
    }

    override fun onHotKeys(hotKeys: List<String>) {
        mFlowlayout.adapter = object : TagAdapter<String>(hotKeys) {
            override fun getView(parent: FlowLayout, position: Int, s: String): View {
                //动态创建热词布局
                var tv=TextView(this@MovieSearchActivity)
                var params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
                params.margin=dip(8)
                tv.layoutParams = params
                tv.setPadding(dip(12),dip(8),dip(12),dip(8))
                tv.setBackgroundColor(colors[position % colors.size])
                tv.text = s
                return tv
            }
        }

        mFlowlayout.setOnTagClickListener { view, position, parent ->
            toast(hotKeys[position])
            true
        }
    }

    override fun injectComponent() {
        DaggerFilmComponent.builder().activityComponent(activityComponent).build().inject(this)
        mPresenter.mView=this
    }

    override fun onResume() {
        super.onResume()
        mSearchView.showSearch(false)
    }
}
