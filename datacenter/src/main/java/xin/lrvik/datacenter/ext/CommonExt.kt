package xin.lrvik.datacenter.ext

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/14.
 *
 */


fun <T, K> Observable<T>.parser(function: (it: T) -> K): Observable<K> {
    return this.map {
        function(it)
    }
}

fun <T> Observable<T>.callback(function: (it: T) -> Unit) {
    this.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { function(it) }
}