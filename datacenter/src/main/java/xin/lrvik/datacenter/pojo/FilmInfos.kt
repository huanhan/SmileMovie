package xin.lrvik.datacenter.pojo


/**
 * 影片的详细信息
 * Created by qy on 2017/3/22 19:58
 */

data class FilmInfos(var otherInfo: String,
                     var title: String,
                     var imgUrl: String,
                     var starring: String,
                     var type: String,
                     var director: String,
                     var releaseTime: String,
                     var language: String,
                     var area: String,
                     var updateTime: String,
                     var profile: String,
                     var introduction: String,
                     var playerUrls: List<List<Series>>,
                     var downloadUrls: List<Series>)

