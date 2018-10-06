package xin.lrvik.smilemovie.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
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
}
