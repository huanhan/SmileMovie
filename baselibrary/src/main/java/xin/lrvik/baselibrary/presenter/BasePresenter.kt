package lrvik.xin.base.presenter

import android.content.Context
import com.kotlin.base.utils.NetWorkUtils
import com.trello.rxlifecycle2.LifecycleProvider
import lrvik.xin.base.presenter.view.BaseView
import javax.inject.Inject


open class BasePresenter<T : BaseView> {
    lateinit var mView: T

    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>

    @Inject
    lateinit var context: Context

    fun checkNetWork(): Boolean {
        return if (NetWorkUtils.isNetWorkAvailable(context)) {
            true
        } else {
            mView.onError("网络不可用")
            false
        }

    }
}