package xin.lrvik.smilemovie.ui.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import com.youth.banner.Banner
import com.youth.banner.BannerConfig
import com.youth.banner.Transformer
import com.youth.banner.loader.ImageLoader
import kotlinx.android.synthetic.main.fragment_movies.*
import lrvik.xin.base.ext.loadUrl
import org.jetbrains.anko.support.v4.dip

import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.common.HOME_BANNER_FOUR
import xin.lrvik.smilemovie.common.HOME_BANNER_ONE
import xin.lrvik.smilemovie.common.HOME_BANNER_THREE
import xin.lrvik.smilemovie.common.HOME_BANNER_TWO
import xin.lrvik.smilemovie.data.repository.PartInfo
import xin.lrvik.smilemovie.ui.adapter.RvMoviesAdapter

class RecommendFragment : Fragment() {

    private lateinit var partInfos: ArrayList<PartInfo>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_recommend, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        initData()
        mRvMovie.layoutManager = GridLayoutManager(context, 3)
        val rvMoviesAdapter = RvMoviesAdapter(partInfos)
        val banner = Banner(context)

        //设置图片加载器
        banner.setImageLoader(object : ImageLoader() {
            override fun displayImage(context: Context?, path: Any?, imageView: ImageView) {
                imageView.loadUrl(path as String)
            }
        })

        //动态设置banner宽高
        var params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, dip(150))
        banner.layoutParams = params

        //设置图片集合
        banner.setImages(listOf(HOME_BANNER_ONE, HOME_BANNER_TWO, HOME_BANNER_THREE, HOME_BANNER_FOUR))
        banner.setBannerAnimation(Transformer.Accordion)
        banner.setDelayTime(2000)
        banner.setIndicatorGravity(BannerConfig.RIGHT)
        banner.start()

        rvMoviesAdapter.addHeaderView(banner)
        mRvMovie.adapter = rvMoviesAdapter
    }

    private fun initData() {
        partInfos=ArrayList()
        for (i in 1..10) {
            partInfos.add(PartInfo("www.baidu.com",
                    "测试信息",
                    "标题",
                    "http://wx1.sinaimg.cn/mw690/006We1hygy1fvv2uoxfo5j304405raa8.jpg",
                    "9"))
        }

    }
}
