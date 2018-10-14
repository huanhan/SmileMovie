package xin.lrvik.datacenter.parser

import xin.lrvik.datacenter.pojo.FilmInfos
import xin.lrvik.datacenter.pojo.HomeInfos
import xin.lrvik.datacenter.pojo.PageInfo

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 * 解析接口类
 */
interface Parser {
    //主机名
    fun getHostName(): String

    //主机地址
    fun getHostUrl(): String

    //首页地址
    fun getHomeUrl(): String

    //首页内容
    fun getHomeCotent(html:String): HomeInfos

    fun getTypeList():Array<String>

    //分类地址
    fun getTypeUrl(type: String, page: Int): String

    //分类内容
    fun getTypeContent(html: String): PageInfo

    //详细地址
    fun getDetailUrl(url: String): String

    //详细内容
    fun getDetailContent(html: String): FilmInfos

    //搜索地址
    fun getSearchUrl(key: String,page:Int): String

    //搜索内容
    fun getSearchContent(html:String):PageInfo
}