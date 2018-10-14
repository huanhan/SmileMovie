package xin.lrvik.smilemovie.presenter

import lrvik.xin.base.presenter.BasePresenter
import xin.lrvik.smilemovie.presenter.view.MoviesView
import xin.lrvik.smilemovie.service.MoviesService
import javax.inject.Inject

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
class MoviesPresenter @Inject constructor() : BasePresenter<MoviesView>() {

    @Inject
    lateinit var moviesService: MoviesService

    fun moviesData(type: String, page: Int) {
        if (!checkNetWork()) {
            return
        }

        mView.showLoading()

        moviesService.moviesData(type, page) {
            mView.onMoviesResult(it)
        }

    }
}