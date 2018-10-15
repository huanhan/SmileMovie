package xin.lrvik.smilemovie.service

import xin.lrvik.datacenter.pojo.FilmInfos

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/15.
 *
 */
interface FilmDetailService {
    fun getDetailData(url: String, method: (FilmInfos) -> Unit)
}