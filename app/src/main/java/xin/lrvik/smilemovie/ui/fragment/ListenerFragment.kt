package xin.lrvik.smilemovie.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import lrvik.xin.base.ui.fragment.BaseFragment
import xin.lrvik.smilemovie.R

class ListenerFragment : BaseFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_listener,null)
    }
}
