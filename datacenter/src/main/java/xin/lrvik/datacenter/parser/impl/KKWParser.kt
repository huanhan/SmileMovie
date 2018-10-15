package xin.lrvik.datacenter.parser.impl

import org.jsoup.Jsoup
import xin.lrvik.datacenter.parser.Parser
import xin.lrvik.datacenter.pojo.*
import java.util.*

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
class KKWParser : Parser {


    override fun getHostName(): String {
        return "看看屋"
    }

    override fun getHostUrl(): String {
        return "https://m.kankanwu.com/"
    }

    override fun getHomeUrl(): String {
        return "https://m.kankanwu.com/"
    }

    override fun getHomeCotent(html: String): HomeInfos {
        val dom = Jsoup.parse(html)

        val films = ArrayList<Film>()
        val scrolls = ArrayList<Film>()

        //看看屋首页正文
        val list_tab_img = dom.getElementsByClass("list_tab_img")
        var listTabImg = list_tab_img.filter { it.id() == "resize_list" }
        listTabImg.forEach {
            var lis = it.getElementsByTag("li")
            lis.forEach {
                val a = it.getElementsByTag("a")
                val detailUrl = a[0].attr("href")
                var other = a[0].getElementsByClass("title")
                val otherInfo = other[0].text()
                val title = a[0].attr("title")
                var img = a[0].getElementsByTag("img");
                val imgUrl = "http:"+img.attr("src")
                var scoreInfo = a[0].getElementsByClass("score")
                val score = if (scoreInfo.size > 0) scoreInfo[0].text() else ""
                films.add(Film(detailUrl, otherInfo, title, imgUrl, score))
            }
        }

        //看看屋首页滚动
        val focusList = dom.getElementsByClass("focusList")[0]
        val lis=focusList.getElementsByTag("li")
        lis.forEach {
            val a = it.getElementsByTag("a")
            val href = a[0].attr("href")
            val img = getHostUrl()+a[0].getElementsByTag("img").attr("src")
            val em = a[0].getElementsByTag("em").text()

            scrolls.add(Film(detailUrl = href, imgUrl = img, title = em))
        }

        //解析热词
        val hotKeys = ArrayList<String>()

        val search_hotkey = dom.getElementsByClass("search_hotkey")[0]
        val eas = search_hotkey.getElementsByTag("a")
        eas.forEach {
            val text = it.text()
            hotKeys.add(text)
        }
        return HomeInfos(scrolls, films, hotKeys)
    }

    override fun getTypeList(): Array<String> {
        return arrayOf("电影", "电视剧", "综艺", "动漫")
    }

    override fun getTypeUrl(type: String, page: Int): String {

        var url = when (type) {
            getTypeList()[0] -> "${getHostUrl()}/dy/index_${page}_______1.html"
            getTypeList()[1] -> "${getHostUrl()}/dsj/index_${page}_______1.html"
            getTypeList()[2] -> "${getHostUrl()}/Animation/index_${page}_______1.html"
            getTypeList()[3] -> "${getHostUrl()}/Arts/index_${page}_______1.html"
            else -> getHomeUrl()
        }
        return url
    }

    override fun getTypeContent(html: String): PageInfo {
        val dom = Jsoup.parse(html)
        val films = ArrayList<Film>()
        val vod_list = dom.getElementById("vod_list")
        val lis = vod_list.getElementsByTag("li")
        lis.forEach {
            val a = it.getElementsByTag("a")
            var detailUrl = a[0].attr("href")
            var otherInfo = a[0].getElementsByClass("title")[0].text()
            var title = a[0].attr("title")
            var imgUrl = "http:"+a[0].getElementsByTag("img").attr("src")
            var score = a[0].getElementsByClass("score")[0].text()
            films.add(Film(detailUrl, otherInfo, title, imgUrl, score))
        }

        val dompageinfo = dom.getElementsByClass("ui-vpages")

        val strong = dompageinfo[0].getElementsByTag("strong")
        val split = strong.text().split("部")[1].split("/")
        split[0].substring(1)
        val curPage = split[0].substring(1).toInt()
        val maxPage = split[1].trim { it <= ' ' }.toInt()
        return PageInfo(films, curPage, maxPage)
    }

    override fun getDetailUrl(url: String): String {
        return getHostUrl() + url
    }

    override fun getDetailContent(html: String): FilmInfos {
        val dom = Jsoup.parse(html)

        val resize_vod = dom.getElementById("resize_vod")
        val vod_n_img = resize_vod.getElementsByClass("vod-n-img")
        val img = vod_n_img[0].getElementsByTag("img")
        val imgUrl = "http:"+img.attr("data-original")
        val title = img.attr("alt")

        val vod_n_l = resize_vod.getElementsByClass("vod-n-l")[0]
        val ps = vod_n_l.getElementsByTag("p")

        //附加信息
        val otherInfo = ps[0].text().split("：")[1]
        //主演
        val storngs = ps[1].getElementsByTag("storng")
        val starring = storngs.fold(StringBuilder()) { acc, element ->
            acc.append(element.getElementsByTag("a")[0].text()).append("  ")
        }.toString()

        //分類
        val atypes = ps[2].getElementsByTag("a")
        val type = atypes.fold(StringBuilder()) { acc, element ->
            acc.append(element.text()).append("  ")
        }.toString()

        //導演
        val adirectors = ps[3].getElementsByTag("a")
        val director = adirectors.fold(StringBuilder()) { acc, element ->
            acc.append(element.text()).append("  ")
        }.toString()

        //年份
        val releaseTime = ps[4].getElementsByTag("a").text()

        //語言
        val language = ps[5].getElementsByTag("font").text()

        //地区
        val area = ps[6].getElementsByTag("a")[0].text()

        //更新时间
        val updateTime = ps[7].text().split("：")[1]

        //简介
        val profile = vod_n_l.getElementsByTag("div")[0].text().split("：")[1]

        val play_box = dom.getElementsByClass("play-box")


        var playbox = play_box.filter {
            val tboxid = it.attr("id")
            if (tboxid.contains("xigua") || tboxid.contains("pan")) {
                return@filter false
            }
            return@filter true
        }

        val playerUrls = ArrayList<List<Series>>()

        playbox.forEach {
            val seriess = ArrayList<Series>()
            val lis = it.getElementsByTag("li")
            for (li in lis) {
                val aseries = li.getElementsByTag("a")[0]
                val name = aseries.attr("title")
                val url = aseries.attr("href")
                seriess.add(Series(url, name))
            }
            playerUrls.add(seriess)
        }

        val introduction = dom.getElementsByClass("vod_content")[0].text()

        //下载链接

        val downs_dom = dom.getElementsByClass("zy")

        val downloadUrls = ArrayList<Series>()
        if (downs_dom.size > 0) {
            for (element in downs_dom) {
                val a = element.getElementsByTag("a")[0]
                val name = a.text()
                val url = a.attr("href")
                downloadUrls.add(Series(url, name))
            }
        }
        //otherInfo,title,imgUrl,starring,type,director,res
        return FilmInfos(otherInfo, title, imgUrl, starring, type, director, releaseTime,
                language, area, updateTime, profile, introduction, playerUrls, downloadUrls)
    }

    override fun getSearchUrl(key: String, page: Int): String {
        return "${getHostUrl()}/vod-search-wd-$key-p-$page.html"
    }

    override fun getSearchContent(html: String): PageInfo {

        val films = ArrayList<Film>()
        val dom = Jsoup.parse(html)
        val resize_list = dom.getElementById("resize_list")
        val lis = resize_list.getElementsByTag("li")

        if (lis != null && lis?.size > 0) {
            for (li in lis) {
                val a = li.getElementsByTag("a")
                val detailUrl = a[0].attr("href")
                val title = a[0].attr("title")
                val imgUrl = getHostUrl()+a[0].getElementsByTag("img").attr("src")
                val otherInfo = li.getElementsByClass("title")[0].text()
                films.add(Film(detailUrl, otherInfo, title, imgUrl))
            }
        }
        val dompageinfo = dom.getElementsByClass("ui-vpages")
        val strong = dompageinfo[0].getElementsByTag("strong")
        val split = strong.text().split("部")[1].split("/")
        val curPage = split[0].substring(1).toInt()
        val maxPage = split[1].trim { it <= ' ' }.toInt()
        return PageInfo(films, curPage, maxPage)
    }


    override fun getPlayerUrl(url:String): String {
        return getHostUrl()+url
    }
}