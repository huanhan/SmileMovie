package xin.lrvik.smilemovie.ui.activity

import android.os.Bundle
import android.view.MenuItem
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.kotlin.base.utils.AppPrefsUtils
import kotlinx.android.synthetic.main.activity_film_detail.*
import lrvik.xin.base.ext.loadUrl
import lrvik.xin.base.ui.activity.BaseMvpActivity
import org.jetbrains.anko.startActivity
import xin.lrvik.datacenter.pojo.FilmInfos
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.dto.HFilm
import xin.lrvik.smilemovie.injection.component.DaggerFilmComponent
import xin.lrvik.smilemovie.presenter.FilmDetailPresenter
import xin.lrvik.smilemovie.presenter.view.FilmDetailView

class FilmDetailActivity : BaseMvpActivity<FilmDetailPresenter>(), FilmDetailView {
    var filmUrl = ""
    override fun getDetailData(data: FilmInfos) {
        mTvPlayerContentText.text = data.introduction
        mCToolbar.title = data.title
        mTvTime.text = "时间：" + data.releaseTime
        mTvPerformer.text = data.starring
        mTvDirector.text = "导演：" + data.director
        mTvFilmType.text = "类型：" + data.type
        mIvMovieImg.loadUrl(data.imgUrl)

        mFabPlayer.setOnClickListener {

            //保存到历史记录
            var src = AppPrefsUtils.getString("src")
            var history = AppPrefsUtils.getString("history$src")
            var hFilms: ArrayList<HFilm>

            if (history.isNotEmpty()) {
                hFilms = Gson().fromJson<ArrayList<HFilm>>(history, object : TypeToken<ArrayList<HFilm>>() {}.type)
            } else {
                hFilms = ArrayList()
            }
            var hFilm = HFilm(data.imgUrl, data.title, filmUrl)
            if (!hFilms.contains(hFilm)) {
                hFilms.add(hFilm)
            }
            AppPrefsUtils.putString("history$src", Gson().toJson(hFilms))

            startActivity<PlayerSrcActivity>("FILMINFOS" to data)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_detail)
        initView()
        initData()
    }

    private fun initData() {
        filmUrl = intent.extras.getString("FILMURL")
        mPresenter.getDetailData(filmUrl)
    }

    private fun initView() {
        setSupportActionBar(mTbPlayer)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
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

    override fun injectComponent() {
        DaggerFilmComponent.builder().activityComponent(activityComponent).build().inject(this)
        mPresenter.mView = this
    }
}
