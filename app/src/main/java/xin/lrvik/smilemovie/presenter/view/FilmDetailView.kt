package xin.lrvik.smilemovie.presenter.view

import lrvik.xin.base.presenter.view.BaseView
import xin.lrvik.datacenter.pojo.FilmInfos

interface FilmDetailView : BaseView {
    fun getDetailData(data: FilmInfos)
}
