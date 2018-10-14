package xin.lrvik.smilemovie.injection.module

import dagger.Module
import dagger.Provides
import xin.lrvik.smilemovie.service.RecommendService
import xin.lrvik.smilemovie.service.impl.RecommendServiceImpl

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */

@Module
class RecommendModule {

    @Provides
    fun providesRecommendService(recommendService: RecommendServiceImpl): RecommendService {
        return recommendService
    }
}