package xin.lrvik.smilemovie.presenter.view

import lrvik.xin.base.presenter.view.BaseView
import xin.lrvik.datacenter.pojo.HomeInfos

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
interface RecommendView:BaseView {

    fun onRecommendResult(data: HomeInfos)
}