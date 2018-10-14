package xin.lrvik.datacenter.pojo

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 * 电影的数据类，
 * detailUrl：详细播放地址，
 * otherInfo：其他信息，
 * title：标题，
 * imgUrl：图片地址,
 * score：评分
 */
data class Film(val detailUrl: String="",
                val otherInfo: String="",
                val title: String="",
                val imgUrl: String="",
                val score: String="")