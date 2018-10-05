package lrvik.xin.base.injection.component

import android.app.Activity
import android.content.Context
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Component
import lrvik.xin.base.injection.ActivityScope
import lrvik.xin.base.injection.module.ActivityModule
import lrvik.xin.base.injection.module.LifecycleProviderModule


@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class,LifecycleProviderModule::class))
interface ActivityComponent {
    fun activity(): Activity
    fun context(): Context
    fun providesLifecycleProvider(): LifecycleProvider<*>
}