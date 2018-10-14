package xin.lrvik.smilemovie.service.impl

import xin.lrvik.datacenter.ParseHandler
import xin.lrvik.datacenter.pojo.HomeInfos
import xin.lrvik.smilemovie.service.RecommendService
import javax.inject.Inject

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
class RecommendServiceImpl @Inject constructor() : RecommendService {

    @Inject
    lateinit var handler: ParseHandler

    override fun recommendData(method: (HomeInfos) -> Unit) {
        handler.getHomeData{
            method(it)
        }
    }


}