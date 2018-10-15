package xin.lrvik.smilemovie.ui.activity

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.webkit.CookieSyncManager
import android.webkit.WebSettings
import android.webkit.WebViewClient
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_player.*
import lrvik.xin.base.ui.activity.BaseActivity
import xin.lrvik.smilemovie.R
import java.util.concurrent.TimeUnit

class PlayerActivity : BaseActivity() {

    @RequiresApi(Build.VERSION_CODES.KITKAT)
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

        Observable.timer(1000, TimeUnit.MILLISECONDS).subscribe {
            mWebView.post {
                mWebView.loadUrl("javascript:window.location.href=document.getElementsByTagName('iframe')[0].src")
            }
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        mWebView.loadData("",
                "text/html", "utf-8")
        mWebView.destroy()
    }
}
