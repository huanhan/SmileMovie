package lrvik.xin.base.rx

import io.reactivex.Observable
import io.reactivex.functions.Function
import lrvik.xin.base.data.protocol.BaseResp

class BaseFunc<T>: Function<BaseResp<T>, Observable<T>> {
    override fun apply(t: BaseResp<T>): Observable<T> {
        if (t.status != 0) {
            return Observable.error(BaseException(t.status, t.message))
        }
        return Observable.just(t.data)
    }

}