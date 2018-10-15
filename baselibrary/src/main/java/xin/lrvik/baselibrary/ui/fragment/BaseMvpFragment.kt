package lrvik.xin.base.ui.fragment

import android.os.Bundle
import lrvik.xin.base.common.BaseApplication
import lrvik.xin.base.injection.component.ActivityComponent
import lrvik.xin.base.injection.component.DaggerActivityComponent
import lrvik.xin.base.injection.module.ActivityModule
import lrvik.xin.base.injection.module.LifecycleProviderModule
import lrvik.xin.base.presenter.BasePresenter
import lrvik.xin.base.presenter.view.BaseView
import lrvik.xin.base.widget.ProgressLoading
import org.jetbrains.anko.support.v4.toast
import javax.inject.Inject

open abstract class BaseMvpFragment<T : BasePresenter<*>> : BaseFragment(), BaseView {

    @Inject
    lateinit var mPresenter: T

    lateinit var activityComponent: ActivityComponent

    private lateinit var mLoadingDialog: ProgressLoading

    override fun showLoading() {
        mLoadingDialog.showLoading()
    }

    override fun hideLoading() {
        mLoadingDialog.hideLoading()
    }

    override fun onError(text: String) {
        toast(text)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()
        injectComponent()

        mLoadingDialog = ProgressLoading.create(activity!!)
    }

    protected abstract fun injectComponent()

    private fun initActivityInjection() {
        activityComponent = DaggerActivityComponent.builder()
                .appComponent((activity!!.application as BaseApplication).appComponent)
                .activityModule(ActivityModule(activity!!))
                .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()

    }

}