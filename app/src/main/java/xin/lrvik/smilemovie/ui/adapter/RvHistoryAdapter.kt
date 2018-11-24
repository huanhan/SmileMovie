package xin.lrvik.smilemovie.ui.adapter

import android.widget.ImageView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import lrvik.xin.base.ext.loadUrl
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.dto.HFilm

class RvHistoryAdapter(data: List<HFilm>) : BaseQuickAdapter<HFilm, BaseViewHolder>(R.layout.item_movie, data) {
    private lateinit var img: ImageView

    override fun convert(helper: BaseViewHolder, item: HFilm) {

        helper.setText(R.id.tv_item_type_title, item.title)
        helper.setVisible(R.id.tv_item_type_info, false)
        helper.setVisible(R.id.tv_item_type_sorce, false)

        img = helper.getView(R.id.iv_item_type_img) as ImageView
        img.loadUrl(item.img)
    }

}
