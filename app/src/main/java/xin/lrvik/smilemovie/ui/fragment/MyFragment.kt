package xin.lrvik.smilemovie.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bigkoo.alertview.AlertView
import kotlinx.android.synthetic.main.fragment_my.*
import lrvik.xin.base.ui.fragment.BaseFragment
import xin.lrvik.smilemovie.R
import android.content.Intent
import android.net.Uri


class MyFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mLlEmail.setOnClickListener {
            val uri = Uri.parse("mailto:huanhanfu@126.com")
            val it = Intent(Intent.ACTION_SENDTO, uri)
            startActivity(it)
        }

        mLlGithub.setOnClickListener {
            val uri = Uri.parse(context!!.resources.getString(R.string.github))
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        mLlFollow.setOnClickListener {
            AlertView("提示", "暂无公众号", null, listOf("确定").toTypedArray(), null, activity,
                    AlertView.Style.Alert, null).show()
        }

        mLlMainZe.setOnClickListener {
            AlertView("免责声明", context!!.resources.getString(R.string.mianze), null, listOf("确定").toTypedArray(), null, activity,
                    AlertView.Style.Alert, null).show()
        }
    }
}
