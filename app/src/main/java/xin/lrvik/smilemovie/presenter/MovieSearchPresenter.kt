package xin.lrvik.smilemovie.presenter

import lrvik.xin.base.ext.execute
import lrvik.xin.base.presenter.BasePresenter
import xin.lrvik.smilemovie.presenter.view.MovieSearchView
import xin.lrvik.smilemovie.service.MoviesService
import javax.inject.Inject

class MovieSearchPresenter @Inject constructor() : BasePresenter<MovieSearchView>() {

    @Inject
    lateinit var service: MoviesService

    fun getHotKeys() {
        mView.showLoading()

        service.recommendData().execute(lifecycleProvider,mView) {
            mView.onHotKeys(it.hotKeys)
        }

    }

}


