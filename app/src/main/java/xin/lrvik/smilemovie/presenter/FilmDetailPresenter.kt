package xin.lrvik.smilemovie.presenter

import lrvik.xin.base.ext.execute
import lrvik.xin.base.presenter.BasePresenter
import xin.lrvik.smilemovie.presenter.view.FilmDetailView
import xin.lrvik.smilemovie.service.MoviesService
import javax.inject.Inject

class FilmDetailPresenter @Inject constructor() : BasePresenter<FilmDetailView>() {

    @Inject
    lateinit var moviesService: MoviesService

    fun getDetailData(url: String) {
        mView.showLoading()

        moviesService.getDetailData(url).execute(lifecycleProvider) {
            mView.getDetailData(it)
            mView.hideLoading()
        }

    }
}
