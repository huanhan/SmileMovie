package xin.lrvik.smilemovie.ui.activity

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.MenuItem
import com.chad.library.adapter.base.BaseQuickAdapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.kotlin.base.utils.AppPrefsUtils
import kotlinx.android.synthetic.main.activity_search_list.*
import lrvik.xin.base.common.BaseApplication
import lrvik.xin.base.ui.activity.BaseActivity
import org.jetbrains.anko.startActivity
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.dto.HFilm
import xin.lrvik.smilemovie.ui.adapter.RvHistoryAdapter

class HistoryActivity : BaseActivity() {

    var hFilms: ArrayList<HFilm> = ArrayList()
    lateinit var rvHistoryAdapter: RvHistoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        initView()
    }

    private fun initView() {
        setSupportActionBar(mToolbar)
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.title = "历史记录"
        }

        mRvMovie.layoutManager = GridLayoutManager(BaseApplication.context, 3)
        rvHistoryAdapter = RvHistoryAdapter(hFilms)
        rvHistoryAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN)
        rvHistoryAdapter.setEmptyView(R.layout.view_empty, mRvMovie)
        mRvMovie.adapter = rvHistoryAdapter

        var src = AppPrefsUtils.getString("src")
        var history = AppPrefsUtils.getString("history$src")

        if (history.isNotEmpty()) {
            hFilms = Gson().fromJson<ArrayList<HFilm>>(history, object : TypeToken<ArrayList<HFilm>>() {}.type)
            hFilms.reverse()//倒序
            rvHistoryAdapter.setNewData(hFilms)
            rvHistoryAdapter.notifyDataSetChanged()
        }

        rvHistoryAdapter.setOnItemClickListener { adapter, view, position ->
            var film = adapter.data[position] as HFilm
            startActivity<FilmDetailActivity>("FILMURL" to film.url)
        }
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
