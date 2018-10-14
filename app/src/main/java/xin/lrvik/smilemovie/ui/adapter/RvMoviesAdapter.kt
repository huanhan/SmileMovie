package xin.lrvik.smilemovie.ui.adapter

import android.widget.ImageView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import lrvik.xin.base.ext.loadUrl
import xin.lrvik.datacenter.pojo.Film
import xin.lrvik.smilemovie.R

class RvMoviesAdapter( data: List<Film>) : BaseQuickAdapter<Film, BaseViewHolder>(R.layout.item_movie,data) {
    private lateinit var img: ImageView

    override fun convert(helper: BaseViewHolder, item: Film) {

        helper.setText(R.id.tv_item_type_title, item.title)
        helper.setText(R.id.tv_item_type_info, item.otherInfo)

        if (item.score == "") {
            helper.setVisible(R.id.tv_item_type_sorce, false)
        } else {
            helper.setVisible(R.id.tv_item_type_sorce, true)
            helper.setText(R.id.tv_item_type_sorce, item.score)
        }
        img = helper.getView(R.id.iv_item_type_img) as ImageView
        img.loadUrl(item.imgUrl)
    }

}
