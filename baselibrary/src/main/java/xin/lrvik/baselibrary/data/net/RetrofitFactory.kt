package lrvik.xin.base.data.net

import lrvik.xin.base.common.BaseConstant
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class RetrofitFactory private constructor() {
    companion object {
        val instance: RetrofitFactory by lazy {
            RetrofitFactory()
        }
    }

    private val retrofit: Retrofit
    private val interceptor:Interceptor

    init {
        //增加过滤器，给每个请求增加请求头
        interceptor= Interceptor {
            chain ->
            val request = chain.request()
                    .newBuilder()
                    //.addHeader("Content-Type", "application/json")
                    //.addHeader("charset", "utf-8")
                    //.addHeader("token",AppPrefsUtils.getString(BaseConstant.KEY_SP_TOKEN))
                    .build()
            chain.proceed(request)
        }

        //创建retrofit，设置client，增加转换工厂，以及RX适配器
        retrofit = Retrofit.Builder()
                .baseUrl(BaseConstant.SERVICE_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(initClient())
                .build()
    }

    //初始化连接工具，设置日志拦截器，自定义拦截器（增加请求头），连接，读取超时
    private fun initClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(initLogInterceptor())
                .addInterceptor(interceptor)
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build()
    }

    //初始化日志拦截器，设置日志等级
    private fun initLogInterceptor(): Interceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    //获取获取请求服务
    fun <T> create(service: Class<T>): T = retrofit.create(service)

}