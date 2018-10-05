package xin.lrvik.baselibrary.common

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import java.util.*

open class AppManger private constructor() {

    private val activityStack: Stack<Activity> = Stack()

    companion object {
        val instance: AppManger by lazy {
            AppManger()
        }
    }

    /**
     * 添加一个activity
     */
    fun addActivity(activity: Activity) {
        activityStack.add(activity)
    }

    /**
     * 关闭参数的activity
     */
    fun finishActivity(activity: Activity) {
        activity.finish()
        activityStack.remove(activity)
    }

    /**
     * 获取当前Activity
     */
    fun currentActivity(): Activity = activityStack.lastElement()

    /**
     * 关闭所有Activity
     */
    fun finishAllActivity() {
        activityStack.forEach {
            it.finish()
        }
        activityStack.clear()
    }

    /**
     * 退出App
     */
    fun exitApp(context: Context) {
        finishAllActivity()
        val systemService = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        systemService.killBackgroundProcesses(context.packageName)
        System.exit(0)
    }
}