package lrvik.xin.base.ui.activity

import android.os.Bundle
import lrvik.xin.base.common.BaseApplication
import lrvik.xin.base.injection.component.ActivityComponent
import lrvik.xin.base.injection.component.DaggerActivityComponent
import lrvik.xin.base.injection.module.ActivityModule
import lrvik.xin.base.injection.module.LifecycleProviderModule
import lrvik.xin.base.presenter.BasePresenter
import lrvik.xin.base.presenter.view.BaseView
import lrvik.xin.base.widget.ProgressLoading
import org.jetbrains.anko.toast
import javax.inject.Inject

open abstract class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

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

        mLoadingDialog = ProgressLoading.create(this)
    }

    protected abstract fun injectComponent()

    private fun initActivityInjection() {
        activityComponent = DaggerActivityComponent.builder()
                .appComponent((application as BaseApplication).appComponent)
                .activityModule(ActivityModule(this))
                .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()

    }

}