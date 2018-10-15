package lrvik.xin.base.rx

import io.reactivex.Observer
import lrvik.xin.base.presenter.view.BaseView

open abstract class BaseSubscriber<T>(val view:BaseView): Observer<T> {

    override fun onError(e: Throwable) {
        view.hideLoading()
        if (e is BaseException) {
            view.onError(e.msg)
        }
    }

    override fun onComplete() {
        view.hideLoading()
    }
}