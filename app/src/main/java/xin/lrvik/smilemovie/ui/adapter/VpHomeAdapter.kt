package xin.lrvik.smilemovie.ui.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.util.*

class VpHomeAdapter(supportFragmentManager: FragmentManager,
                    private val fragments:Stack<Fragment>,
                    private val titles:Stack<String>) : FragmentPagerAdapter(supportFragmentManager) {

    override fun getItem(i: Int): Fragment {
        return fragments[i]
    }

    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position%fragments.size]
    }

}
