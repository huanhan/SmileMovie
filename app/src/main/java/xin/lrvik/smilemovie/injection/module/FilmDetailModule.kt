package xin.lrvik.smilemovie.injection.module

import dagger.Module
import dagger.Provides
import xin.lrvik.smilemovie.service.FilmDetailService
import xin.lrvik.smilemovie.service.impl.FilmDetailServiceImpl

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */

@Module
class FilmDetailModule {

    @Provides
    fun providesFilmDetailService(filmDetailService: FilmDetailServiceImpl): FilmDetailService {
        return filmDetailService
    }
}