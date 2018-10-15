package lrvik.xin.base.ext

import android.view.View
import android.widget.ImageView
import com.kotlin.base.utils.GlideUtils
import com.trello.rxlifecycle2.LifecycleProvider
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import lrvik.xin.base.data.protocol.BaseResp
import lrvik.xin.base.rx.BaseFunc
import lrvik.xin.base.rx.BaseFuncBoolean
import lrvik.xin.base.rx.BaseSubscriber


fun <T> Observable<T>.execute(subscribe:BaseSubscriber<T>, lifecycleProvider: LifecycleProvider<*>){
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .compose(lifecycleProvider.bindToLifecycle<T>())
            .subscribe(subscribe)
}


fun <T> Observable<T>.execute(lifecycleProvider: LifecycleProvider<*>,method: (data:T) -> Unit){
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .compose(lifecycleProvider.bindToLifecycle<T>())
            .subscribe{method(it)}
}

fun <T> Observable<BaseResp<T>>.convert(): Observable<T> {
    return this.flatMap(BaseFunc())

}

fun <T> Observable<BaseResp<T>>.convertBoolean(): Observable<Boolean> {
    return this.flatMap(BaseFuncBoolean())
}


fun View.onClick(method:(View)->Unit){
    this.setOnClickListener{
        method(it)
    }
}

fun View.onClick(listener:View.OnClickListener):View{
    setOnClickListener(listener)
    return this
}


/*
    ImageView加载网络图片
 */
fun ImageView.loadUrl(url: String) {
    GlideUtils.loadUrlImage(context, url, this)
}
