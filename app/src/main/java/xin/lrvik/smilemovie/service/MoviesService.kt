package xin.lrvik.smilemovie.service

import xin.lrvik.datacenter.pojo.PageInfo

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
interface MoviesService {
    fun moviesData(type: String, page: Int,method: (PageInfo) -> Unit)
}