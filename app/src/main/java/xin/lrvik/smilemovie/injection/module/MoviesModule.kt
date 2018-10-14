package xin.lrvik.smilemovie.injection.module

import dagger.Module
import dagger.Provides
import xin.lrvik.smilemovie.service.MoviesService
import xin.lrvik.smilemovie.service.impl.MoviesServiceImpl

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */

@Module
class MoviesModule {

    @Provides
    fun providesMoviesService(moviesModule: MoviesServiceImpl): MoviesService {
        return moviesModule
    }
}