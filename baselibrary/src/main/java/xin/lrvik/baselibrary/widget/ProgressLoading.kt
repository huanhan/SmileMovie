package lrvik.xin.base.widget

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.view.Gravity
import android.widget.ImageView
import org.jetbrains.anko.find
import xin.lrvik.baselibrary.R


class ProgressLoading private constructor(context: Context?, themeResId: Int) : Dialog(context, themeResId) {
    companion object {
        private lateinit var mDialog: ProgressLoading
        private var animDrawable: AnimationDrawable? = null

        fun create(context: Context): ProgressLoading {
            mDialog = ProgressLoading(context, R.style.LightDialog)
            mDialog.setContentView(R.layout.progress_dialog)
            mDialog.setCancelable(true)
            mDialog.setCanceledOnTouchOutside(false)
            mDialog.window.attributes.gravity = Gravity.CENTER
            val lp = mDialog.window.attributes
            lp.dimAmount = 0.2f
            mDialog.window.attributes = lp

            val loadingView = mDialog.find<ImageView>(R.id.iv_loading)
            animDrawable = loadingView.background as AnimationDrawable
            return mDialog
        }
    }

    fun showLoading() {
        super.show()
        animDrawable?.start()
    }

    fun hideLoading() {
        super.dismiss()
        animDrawable?.stop()
    }
}