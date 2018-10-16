package xin.lrvik.smilemovie.ui.adapter

import android.graphics.Color

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.dto.RunnerSrc


/**
 * Created by qy on 2017/8/29 12:26
 */

class RVSelectSrcAdapter(data: List<RunnerSrc>) : BaseQuickAdapter<RunnerSrc, BaseViewHolder>(R.layout.item_select_src, data) {

    override fun convert(helper: BaseViewHolder, item: RunnerSrc) {
        helper.setText(R.id.tv_select, item.title)
        if (item.isSelect) {
            helper.setTextColor(R.id.tv_select, Color.parseColor("#ff0000"))
        } else {
            helper.setTextColor(R.id.tv_select, Color.parseColor("#AAAAAA"))
        }
    }
}
