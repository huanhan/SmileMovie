package lrvik.xin.base.rx

import lrvik.xin.base.presenter.view.BaseView
import rx.Subscriber

open abstract class BaseSubscriber<T>(val view:BaseView): Subscriber<T>() {

    override fun onCompleted() {
        view.hideLoading()
    }

    override fun onError(e: Throwable?) {
        view.hideLoading()
        if (e is BaseException) {
            view.onError(e.msg)
        }
    }
}