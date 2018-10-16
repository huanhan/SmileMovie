package xin.lrvik.smilemovie.ui.dialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.FragmentManager
import android.support.v7.widget.LinearLayoutManager
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager

import com.kotlin.base.utils.AppPrefsUtils
import kotlinx.android.synthetic.main.dialog_fragment_select_src.*
import lrvik.xin.base.ext.onClick
import org.jetbrains.anko.support.v4.startActivity

import java.util.ArrayList

import xin.lrvik.datacenter.ParseHandler
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.dto.RunnerSrc
import xin.lrvik.smilemovie.ui.activity.MainActivity
import xin.lrvik.smilemovie.ui.adapter.RVSelectSrcAdapter


/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/16.
 * 换源弹窗
 */

class SelectSrcDialogFragment : DialogFragment() {

    private lateinit var rvSelectSrcAdapter: RVSelectSrcAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.BottomDialog)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)
        val window = dialog.window
        window?.let {
            window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            val lp = window.attributes
            lp.gravity = Gravity.BOTTOM // 紧贴底部
            lp.width = WindowManager.LayoutParams.MATCH_PARENT // 宽度持平
            window.attributes = lp
        }
        return inflater.inflate(R.layout.dialog_fragment_select_src, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initView()
    }

    private fun initView() {
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        mRvSelectItem.layoutManager = linearLayoutManager

        var runnerSrcs = ArrayList<RunnerSrc>()
        rvSelectSrcAdapter = RVSelectSrcAdapter(runnerSrcs)
        mRvSelectItem.adapter = rvSelectSrcAdapter

        //获取当前选中的源
        val src = AppPrefsUtils.getString("src")

        //获取所有源
        val parsers = ParseHandler.parsers

        parsers.forEach {
            runnerSrcs.add(RunnerSrc(it.getHostName(), false))
        }

        //选中源被点击
        rvSelectSrcAdapter.setOnItemClickListener { adapter, view, position ->
            var runnerSrc = adapter.data[position] as RunnerSrc
            if (runnerSrc.title == src) {
                return@setOnItemClickListener
            }
            AppPrefsUtils.putString("src", runnerSrc.title)
            activity!!.finish()
            startActivity<MainActivity>()
        }

        //取消按钮被点击
        mBtCancle.onClick {
            dialog.dismiss()
        }

        if (src.isEmpty()) {
            runnerSrcs[0].isSelect = true
            AppPrefsUtils.putString("src", runnerSrcs[0].title)
        } else {
            for (i in parsers.indices) {
                runnerSrcs[i].isSelect = src == parsers[i].getHostName()
            }
        }

        rvSelectSrcAdapter.notifyDataSetChanged()
    }


    override fun onResume() {
        super.onResume()
        dialog.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }


    companion object {
        fun showDialog(fm: FragmentManager) {
            val dialog = SelectSrcDialogFragment()
            dialog.show(fm, "SelectDialog")
        }
    }


}
