package xin.lrvik.smilemovie.ui.fragment

import android.content.Context
import android.os.Bundle
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
import lrvik.xin.base.ui.fragment.BaseMvpFragment
import org.jetbrains.anko.support.v4.dip
import xin.lrvik.datacenter.pojo.Film
import xin.lrvik.datacenter.pojo.HomeInfos
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.injection.component.DaggerRecommendComponent
import xin.lrvik.smilemovie.presenter.RecommendPresenter
import xin.lrvik.smilemovie.presenter.view.RecommendView
import xin.lrvik.smilemovie.ui.adapter.RvMoviesAdapter

class RecommendFragment : BaseMvpFragment<RecommendPresenter>(), RecommendView {

    private var partInfos: ArrayList<Film> = ArrayList()

    lateinit var rvMoviesAdapter: RvMoviesAdapter
    lateinit var banner: Banner

    override fun onRecommendResult(data: HomeInfos) {
        //toast(data.toString())
        rvMoviesAdapter.data.addAll(data.films)

        var bannerImg: ArrayList<String> = ArrayList()
        data.scrollInfos.forEach {
            bannerImg.add(it.imgUrl)
        }
        banner.setImages(bannerImg)
        //设置图片集合
        banner.setBannerAnimation(Transformer.Accordion)
        banner.setDelayTime(2000)
        banner.setIndicatorGravity(BannerConfig.RIGHT)
        banner.start()
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_recommend, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mPresenter.homeData()

        mRvMovie.layoutManager = GridLayoutManager(context, 3)
        rvMoviesAdapter = RvMoviesAdapter(partInfos)

        banner = Banner(context)

        //设置图片加载器
        banner.setImageLoader(object : ImageLoader() {
            override fun displayImage(context: Context?, path: Any?, imageView: ImageView) {
                imageView.loadUrl(path as String)
            }
        })

        //动态设置banner宽高
        var params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, dip(150))
        banner.layoutParams = params



        rvMoviesAdapter.addHeaderView(banner)
        mRvMovie.adapter = rvMoviesAdapter
    }

    override fun injectComponent() {
        DaggerRecommendComponent.builder().activityComponent(activityComponent).build().inject(this)
        mPresenter.mView = this
    }

}
