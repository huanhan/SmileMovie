package lrvik.xin.base.ext

import android.view.View
import android.widget.ImageView
import com.kotlin.base.utils.GlideUtils
import com.trello.rxlifecycle2.LifecycleProvider
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import lrvik.xin.base.presenter.view.BaseView
import lrvik.xin.base.rx.BaseException


/**
 * isShowLoading是否显示Loading
 */
fun <T> Observable<T>.execute(lifecycleProvider: LifecycleProvider<*>,
                              mView: BaseView, isShowLoading: Boolean=true,
                              function: (data: T) -> Unit) {
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .compose(lifecycleProvider.bindToLifecycle<T>())
            .subscribe(object : Observer<T> {
                override fun onSubscribe(d: Disposable) {
                }

                override fun onComplete() {
                    if (isShowLoading) {
                        mView.hideLoading()
                    }
                }

                override fun onNext(t: T) {
                    function(t)
                    if (isShowLoading) {
                        mView.hideLoading()
                    }
                }

                override fun onError(e: Throwable) {
                    if (isShowLoading) {
                        mView.hideLoading()
                    }
                    if (e is BaseException) {
                        mView.onError(e.msg)
                    }
                }
            })
}


fun View.onClick(method: (View) -> Unit) {
    this.setOnClickListener {
        method(it)
    }
}

fun View.onClick(listener: View.OnClickListener): View {
    setOnClickListener(listener)
    return this
}


/*
    ImageView加载网络图片
 */
fun ImageView.loadUrl(url: String) {
    GlideUtils.loadUrlImage(context, url, this)
}
