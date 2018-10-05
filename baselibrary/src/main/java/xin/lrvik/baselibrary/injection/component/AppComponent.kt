package lrvik.xin.base.injection.component

import android.content.Context
import dagger.Component
import lrvik.xin.base.injection.module.AppModule
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun context(): Context
}