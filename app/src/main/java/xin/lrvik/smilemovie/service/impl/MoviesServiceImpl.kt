package xin.lrvik.smilemovie.service.impl

import xin.lrvik.datacenter.ParseHandler
import xin.lrvik.datacenter.pojo.PageInfo
import xin.lrvik.smilemovie.service.MoviesService
import javax.inject.Inject

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
class MoviesServiceImpl @Inject constructor():MoviesService {

    override fun moviesData(type: String, page: Int,method: (PageInfo) -> Unit) {
        ParseHandler.instance.getTypeData(type, page, method)
    }
}