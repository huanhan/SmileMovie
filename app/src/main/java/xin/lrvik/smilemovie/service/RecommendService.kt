package xin.lrvik.smilemovie.service

import xin.lrvik.datacenter.pojo.HomeInfos

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
interface RecommendService {
    fun recommendData(method: (HomeInfos) -> Unit)
}