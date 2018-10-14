package xin.lrvik.datacenter.pojo

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 * 首页数据类，scrollInfos为滑动信息，films为影片列表，hotKeys为搜索热词
 */

data class HomeInfos(var scrollInfos: List<Film>,
                     var films: List<Film>,
                     var hotKeys: List<String>)
