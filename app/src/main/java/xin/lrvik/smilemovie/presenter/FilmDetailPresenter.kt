package xin.lrvik.smilemovie.presenter

import lrvik.xin.base.presenter.BasePresenter
import xin.lrvik.smilemovie.presenter.view.FilmDetailView
import xin.lrvik.smilemovie.service.FilmDetailService
import javax.inject.Inject

class FilmDetailPresenter @Inject constructor() : BasePresenter<FilmDetailView>() {

    @Inject
    lateinit var filmDetailService: FilmDetailService

    fun getDetailData(url: String) {
        mView.showLoading()

        filmDetailService.getDetailData(url) {
            mView.getDetailData(it)
            mView.hideLoading()
        }

    }
}
