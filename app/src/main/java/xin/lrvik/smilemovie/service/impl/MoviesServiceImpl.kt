package xin.lrvik.smilemovie.service.impl

import io.reactivex.Observable
import xin.lrvik.datacenter.ParseHandler
import xin.lrvik.datacenter.pojo.FilmInfos
import xin.lrvik.datacenter.pojo.HomeInfos
import xin.lrvik.datacenter.pojo.PageInfo
import xin.lrvik.smilemovie.service.MoviesService
import javax.inject.Inject

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
class MoviesServiceImpl @Inject constructor() : MoviesService {

    override fun moviesData(type: String, page: Int): Observable<PageInfo> {
       return ParseHandler.instance.getTypeData(type, page)
    }

    override fun recommendData(): Observable<HomeInfos> {
        return ParseHandler.instance.getHomeData()
    }

    override fun getDetailData(url: String): Observable<FilmInfos> {
        return ParseHandler.instance.getDetailData(url)
    }
}