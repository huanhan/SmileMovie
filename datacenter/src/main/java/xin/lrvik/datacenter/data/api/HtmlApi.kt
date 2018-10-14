package xin.lrvik.datacenter.data.api

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */
interface HtmlApi {
    @GET//切勿使用@GET()  或@GET("") @GET(".") @GET("/")  注意导包
    fun getHtml(@Url url:String ): Observable<String>
}