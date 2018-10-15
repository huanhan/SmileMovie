package xin.lrvik.smilemovie.service.impl

import xin.lrvik.datacenter.ParseHandler
import xin.lrvik.datacenter.pojo.FilmInfos
import xin.lrvik.smilemovie.service.FilmDetailService
import javax.inject.Inject

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/15.
 *
 */
class FilmDetailServiceImpl @Inject constructor():FilmDetailService{

    override fun getDetailData(url: String, method: (FilmInfos) -> Unit) {
        ParseHandler.instance.getDetailData(url,method)
    }
}