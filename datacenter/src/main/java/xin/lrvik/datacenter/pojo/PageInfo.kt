package xin.lrvik.datacenter.pojo

/**
 * Created by qy on 2017/7/5 13:32
 */

data class PageInfo(
        var films: List<Film>,
        var curPage: Int = 0,
        var maxPage: Int = 0
)
