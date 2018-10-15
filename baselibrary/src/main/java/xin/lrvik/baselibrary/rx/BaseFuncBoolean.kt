package lrvik.xin.base.rx

import io.reactivex.Observable
import io.reactivex.functions.Function
import lrvik.xin.base.data.protocol.BaseResp

class BaseFuncBoolean<T> : Function<BaseResp<T>, Observable<Boolean>> {
    override fun apply(t: BaseResp<T>): Observable<Boolean> {
        if (t.status != 0) {
            return Observable.error(BaseException(t.status, t.message))
        }
        return Observable.just(true)
    }

}