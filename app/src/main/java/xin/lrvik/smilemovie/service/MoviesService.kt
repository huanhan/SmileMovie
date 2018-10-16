package xin.lrvik.smilemovie.service

import io.reactivex.Observable
import xin.lrvik.datacenter.pojo.FilmInfos
import xin.lrvik.datacenter.pojo.HomeInfos
import xin.lrvik.datacenter.pojo.PageInfo

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
interface MoviesService {
    fun moviesData(type: String, page: Int): Observable<PageInfo>
    fun recommendData(): Observable<HomeInfos>
    fun getDetailData(url: String): Observable<FilmInfos>
    fun getSearchData(key: String, page: Int): Observable<PageInfo>
}