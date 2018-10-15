package xin.lrvik.smilemovie.ui.activity

import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_film_detail.*
import lrvik.xin.base.ext.loadUrl
import lrvik.xin.base.ui.activity.BaseMvpActivity
import xin.lrvik.datacenter.pojo.FilmInfos
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.injection.component.DaggerFilmComponent
import xin.lrvik.smilemovie.presenter.FilmDetailPresenter
import xin.lrvik.smilemovie.presenter.view.FilmDetailView

class FilmDetailActivity : BaseMvpActivity<FilmDetailPresenter>(), FilmDetailView {

    override fun getDetailData(data: FilmInfos) {
        mTvPlayerContentText.text = data.introduction
        mCToolbar.title = data.title
        mTvTime.text = "时间：" + data.releaseTime
        mTvPerformer.text = data.starring
        mTvDirector.text = "导演：" + data.director
        mTvFilmType.text = "类型：" + data.type
        mIvMovieImg.loadUrl(data.imgUrl)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_detail)
        initView()
        initData()
    }

    private fun initData() {
        var filmUrl = intent.extras.getString("FILMURL")
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
