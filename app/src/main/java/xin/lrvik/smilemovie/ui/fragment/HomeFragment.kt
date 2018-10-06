package xin.lrvik.smilemovie.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*
import lrvik.xin.base.ui.fragment.BaseFragment
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.ui.adapter.VpHomeAdapter
import java.util.*

class HomeFragment : BaseFragment() {

    private val mFragments by lazy { Stack<Fragment>() }
    private val mTitles by lazy { Stack<String>() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        if (mFragments.size == 0) {
            mFragments.add(RecommendFragment())
            mFragments.add(MoviesFragment())
            mFragments.add(MoviesFragment())
            mFragments.add(MoviesFragment())
            mFragments.add(MoviesFragment())

            mTitles.add(getString(R.string.recommend))
            mTitles.add(getString(R.string.film))
            mTitles.add(getString(R.string.tvplay))
            mTitles.add(getString(R.string.variety))
            mTitles.add(getString(R.string.comic))

        }

        mViewPager.adapter = VpHomeAdapter(activity!!.supportFragmentManager, mFragments, mTitles)
        mTabLayout.setupWithViewPager(mViewPager)

    }

}
