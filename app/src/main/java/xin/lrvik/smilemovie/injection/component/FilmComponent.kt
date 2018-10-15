package xin.lrvik.smilemovie.injection.component

import dagger.Component
import lrvik.xin.base.injection.PerComponentScope
import lrvik.xin.base.injection.component.ActivityComponent
import xin.lrvik.smilemovie.injection.module.MoviesModule
import xin.lrvik.smilemovie.ui.activity.FilmDetailActivity
import xin.lrvik.smilemovie.ui.fragment.MoviesFragment
import xin.lrvik.smilemovie.ui.fragment.RecommendFragment

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class),
        modules = arrayOf(MoviesModule::class))
interface FilmComponent {
    fun inject(fragment: MoviesFragment)
    fun inject(fragment: RecommendFragment)
    fun inject(filmDetailActivity: FilmDetailActivity)
}