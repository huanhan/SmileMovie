package xin.lrvik.smilemovie.presenter

import lrvik.xin.base.presenter.BasePresenter
import xin.lrvik.smilemovie.presenter.view.RecommendView
import xin.lrvik.smilemovie.service.RecommendService
import javax.inject.Inject

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
class RecommendPresenter @Inject constructor() : BasePresenter<RecommendView>() {

    @Inject
    lateinit var recommendService: RecommendService

    fun homeData() {
        if (!checkNetWork()) {
            return
        }

        mView.showLoading()

        recommendService.recommendData { mView.onRecommendResult(it) }

    }

}