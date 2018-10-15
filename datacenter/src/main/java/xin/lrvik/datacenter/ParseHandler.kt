package xin.lrvik.datacenter

import io.reactivex.Observable
import xin.lrvik.datacenter.data.repository.HtmlRepository
import xin.lrvik.datacenter.ext.parser
import xin.lrvik.datacenter.parser.Parser
import xin.lrvik.datacenter.parser.impl.BBYParser
import xin.lrvik.datacenter.parser.impl.KKWParser
import xin.lrvik.datacenter.pojo.FilmInfos
import xin.lrvik.datacenter.pojo.HomeInfos
import xin.lrvik.datacenter.pojo.PageInfo
import javax.inject.Inject

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
class ParseHandler @Inject constructor() {


    var htmlRepository: HtmlRepository = HtmlRepository()


    companion object {
        val instance: ParseHandler by lazy {
            ParseHandler()
        }

        var lable: String = ""
        lateinit var parser: Parser

        //将所有数据源加载在这里
        val parsers by lazy { arrayListOf(KKWParser(), BBYParser()) }

        //更改标签切换源
        fun changeLable(lable: String) {
            this.lable = lable
            parser = if (lable.isEmpty()) parsers[0] else parsers.filter { it.getHostName() == this.lable }[0]
        }
    }

    init {
        changeLable("")
    }

    //获取视频分类
    fun getTypeList(): Array<String> {
        return parser.getTypeList()
    }

    //获取首页数据
    fun getHomeData(): Observable<HomeInfos> {
        var url = parser.getHomeUrl()
        return htmlRepository.getHtml(url).parser { parser.getHomeCotent(it) }
    }

    //获取分类数据
    fun getTypeData(type: String, page: Int): Observable<PageInfo> {
        var url = parser.getTypeUrl(type, page)
        return htmlRepository.getHtml(url).parser { parser.getTypeContent(it) }
    }

    //获取详细数据
    fun getDetailData(url: String): Observable<FilmInfos> {
        var url = parser.getDetailUrl(url)
        return htmlRepository.getHtml(url).parser { parser.getDetailContent(it) }
    }

    //获取搜索数据
    fun getSearchData(key: String, page: Int): Observable<PageInfo> {
        var url = parser.getSearchUrl(key, page)
        return htmlRepository.getHtml(url).parser { parser.getSearchContent(it) }
    }


}

