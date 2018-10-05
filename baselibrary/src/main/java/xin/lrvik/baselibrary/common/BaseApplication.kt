package lrvik.xin.base.common

import android.app.Application
import android.content.Context
import lrvik.xin.base.injection.component.AppComponent
import lrvik.xin.base.injection.component.DaggerAppComponent
import lrvik.xin.base.injection.module.AppModule


class BaseApplication : Application() {

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