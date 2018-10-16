package xin.lrvik.smilemovie.presenter.view

import lrvik.xin.base.presenter.view.BaseView
import xin.lrvik.datacenter.pojo.PageInfo

interface SearchListView :BaseView{
    fun onSearchList(data: PageInfo)
}
