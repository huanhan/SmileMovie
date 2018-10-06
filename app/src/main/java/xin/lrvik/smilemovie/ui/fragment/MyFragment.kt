package xin.lrvik.smilemovie.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_my.*
import lrvik.xin.base.ext.onClick
import lrvik.xin.base.ui.fragment.BaseFragment
import org.jetbrains.anko.support.v4.startActivity
import xin.lrvik.smilemovie.R

class MyFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my,null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}
