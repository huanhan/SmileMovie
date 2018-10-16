package xin.lrvik.smilemovie.ui.activity

import android.os.Bundle
import android.webkit.CookieSyncManager
import android.webkit.WebSettings
import android.webkit.WebViewClient
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_player.*
import lrvik.xin.base.ui.activity.BaseActivity
import xin.lrvik.smilemovie.R
import java.util.concurrent.TimeUnit

class PlayerActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_player)

        var playerUrl = intent.getStringExtra("PLAYERURL")
        mWebView.clearMatches()
        mWebView.clearCache(true)
        mWebView.clearHistory()
        mWebView.clearFormData()
        mWebView.clearSslPreferences()
        val webSetting = mWebView.settings
        webSetting.javaScriptEnabled = true
        webSetting.cacheMode = WebSettings.LOAD_NO_CACHE
        webSetting.setAppCacheEnabled(false)
        CookieSyncManager.createInstance(this)
        CookieSyncManager.getInstance().sync()

        mWebView.webViewClient = WebViewClient();


        mWebView.loadUrl(playerUrl)

        //规定时间内内进行注入跳转
        (1..30).forEach{
            Observable.timer((it*300).toLong(), TimeUnit.MILLISECONDS).subscribe {
                mWebView.post {
                    mWebView.loadUrl(getInjectJs())
                }
            }
        }
    }

    //document.getElementsByTagName('video')[0].src
    fun getInjectJs(): String {
        return "javascript:var src=document.getElementsByTagName('iframe')[0].src;if(src!=null) {javascript:window.location.href=src}"
    }


    override fun onDestroy() {
        super.onDestroy()
        mWebView.loadData("",
                "text/html", "utf-8")
        mWebView.destroy()
    }
}
