package xin.lrvik.datacenter.data.repository

import io.reactivex.Observable
import lrvik.xin.base.data.net.RetrofitFactory
import xin.lrvik.datacenter.data.api.HtmlApi

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
class HtmlRepository constructor() {
    fun getHtml(url: String): Observable<String> {
        return RetrofitFactory.instance.createString(HtmlApi::class.java).getHtml(url)
    }
}