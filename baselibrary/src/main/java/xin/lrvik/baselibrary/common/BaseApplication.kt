package lrvik.xin.base.common

import android.content.Context
import android.support.multidex.MultiDexApplication
import lrvik.xin.base.injection.component.AppComponent
import lrvik.xin.base.injection.component.DaggerAppComponent
import lrvik.xin.base.injection.module.AppModule


class BaseApplication : MultiDexApplication() {

    lateinit var appComponent: AppComponent

    companion object {
        lateinit var context:Context
    }

    override fun onCreate() {
        super.onCreate()
        initAppInjection()
        context=this
    }

    private fun initAppInjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}