package xin.lrvik.smilemovie.presenter.view

import lrvik.xin.base.presenter.view.BaseView

interface MovieSearchView :BaseView{
    fun onHotKeys(hotKeys: List<String>)
}
