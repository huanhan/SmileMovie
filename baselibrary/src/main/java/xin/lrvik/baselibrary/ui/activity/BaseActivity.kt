package lrvik.xin.base.ui.activity

import android.os.Bundle
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity
import xin.lrvik.baselibrary.common.AppManger

open class BaseActivity : RxAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppManger.instance.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        AppManger.instance.finishActivity(this)
    }
}