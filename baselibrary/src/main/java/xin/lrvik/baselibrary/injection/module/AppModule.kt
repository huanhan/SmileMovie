package lrvik.xin.base.injection.module

import android.content.Context
import dagger.Module
import dagger.Provides
import lrvik.xin.base.common.BaseApplication
import javax.inject.Singleton

@Module
class AppModule (private val context: BaseApplication){

    @Provides
    @Singleton
    fun providesContext(): Context {
        return context
    }
}