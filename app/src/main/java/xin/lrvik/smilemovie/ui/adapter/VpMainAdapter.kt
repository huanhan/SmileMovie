package xin.lrvik.smilemovie.ui.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import xin.lrvik.smilemovie.ui.fragment.HomeFragment
import xin.lrvik.smilemovie.ui.fragment.ListenerFragment
import xin.lrvik.smilemovie.ui.fragment.MyFragment
import java.util.*

class VpMainAdapter(supportFragmentManager: FragmentManager) : FragmentPagerAdapter(supportFragmentManager) {

    private val mStack by lazy { Stack<Fragment>() }

    init {
        mStack.add(HomeFragment())
        mStack.add(ListenerFragment())
        mStack.add(MyFragment())
    }

    override fun getItem(i: Int): Fragment {
        return mStack[i]
    }

    override fun getCount(): Int {
        return mStack.size
    }

}
