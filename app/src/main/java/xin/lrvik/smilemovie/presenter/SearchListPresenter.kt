package xin.lrvik.smilemovie.presenter

import lrvik.xin.base.ext.execute
import lrvik.xin.base.presenter.BasePresenter
import xin.lrvik.smilemovie.presenter.view.SearchListView
import xin.lrvik.smilemovie.service.MoviesService
import javax.inject.Inject

class SearchListPresenter @Inject constructor() : BasePresenter<SearchListView>() {

    @Inject
    lateinit var service: MoviesService

    fun getSearchList(query: String, page: Int) {
        service.getSearchData(query, page).execute(lifecycleProvider, mView, false) {
            mView.onSearchList(it)
        }
    }
}
