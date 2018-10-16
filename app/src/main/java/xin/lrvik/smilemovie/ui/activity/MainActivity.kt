package xin.lrvik.smilemovie.ui.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.KeyEvent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.ui.fragment.HomeFragment
import xin.lrvik.smilemovie.ui.fragment.ListenerFragment
import xin.lrvik.smilemovie.ui.fragment.MyFragment
import java.util.*

class MainActivity : AppCompatActivity() {

    private val mStack by lazy { Stack<Fragment>() }
    private val mHomeFragment by lazy { HomeFragment() }
    private val mListenerFragment by lazy { ListenerFragment() }
    private val mMyFragment by lazy { MyFragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragment()
        initView()
    }

    private fun initFragment() {
        val manager = supportFragmentManager.beginTransaction()
        manager.add(R.id.mContaier, mHomeFragment)
        manager.add(R.id.mContaier, mListenerFragment)
        manager.add(R.id.mContaier, mMyFragment)
        manager.commit()

        mStack.add(mHomeFragment)
        mStack.add(mListenerFragment)
        mStack.add(mMyFragment)

        changeFragment(0)
    }

    private fun initView() {

        mBottomNavBar.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home ->changeFragment(0)
                R.id.navigation_listener -> changeFragment(1)
                R.id.navigation_my ->changeFragment(2)
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

    private fun changeFragment(position: Int) {
        val manager = supportFragmentManager.beginTransaction()
        for (fragment in mStack) {
            manager.hide(fragment)
        }
        manager.show(mStack[position])
        manager.commit()
    }


    private var isExit: Boolean? = false

    /**
     * 菜单、返回键响应
     */
    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitBy2Click() // 调用双击退出函数
        }
        return false
    }

    /**
     * 双击退出函数
     */
    private fun exitBy2Click() {
        var tExit: Timer? = null
        if (isExit == false) {
            isExit = true // 准备退出
            Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show()
            tExit = Timer()
            tExit.schedule(object : TimerTask() {
                override fun run() {
                    isExit = false // 取消退出
                }
            }, 2000) // 如果2秒钟内没有按下返回键，则启动定时器取消掉刚才执行的任务

        } else {
            finish()
            System.exit(0)
        }
    }
}
