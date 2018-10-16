package xin.lrvik.smilemovie.ui.fragment

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import com.chad.library.adapter.base.BaseQuickAdapter
import com.youth.banner.Banner
import com.youth.banner.BannerConfig
import com.youth.banner.Transformer
import com.youth.banner.loader.ImageLoader
import kotlinx.android.synthetic.main.fragment_movies.*
import lrvik.xin.base.ext.loadUrl
import lrvik.xin.base.ui.fragment.BaseMvpFragment
import org.jetbrains.anko.support.v4.dip
import org.jetbrains.anko.support.v4.startActivity
import xin.lrvik.datacenter.pojo.Film
import xin.lrvik.datacenter.pojo.HomeInfos
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.injection.component.DaggerFilmComponent
import xin.lrvik.smilemovie.presenter.RecommendPresenter
import xin.lrvik.smilemovie.presenter.view.RecommendView
import xin.lrvik.smilemovie.ui.activity.FilmDetailActivity
import xin.lrvik.smilemovie.ui.adapter.RvMoviesAdapter

class RecommendFragment : BaseMvpFragment<RecommendPresenter>(), RecommendView {

    private var partInfos: ArrayList<Film> = ArrayList()

    lateinit var rvMoviesAdapter: RvMoviesAdapter
    lateinit var banner: Banner

    override fun onRecommendResult(data: HomeInfos) {
        if (mSwipeRefresh.isRefreshing) {
            mSwipeRefresh.isRefreshing = false
        }
        rvMoviesAdapter.setNewData(data.films)
        rvMoviesAdapter.notifyDataSetChanged()

        var bannerImgs: ArrayList<String> = ArrayList()
        data.scrollInfos.forEach {
            bannerImgs.add(it.imgUrl)
        }
        banner.update(bannerImgs)

        banner.setOnBannerListener {
            startActivity<FilmDetailActivity>("FILMURL" to data.scrollInfos[it].detailUrl)
        }

        //设置图片集合
        banner.start()
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_recommend, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        mSwipeRefresh.setOnRefreshListener { mPresenter.homeData() }

        mRvMovie.layoutManager = GridLayoutManager(context, 3)
        rvMoviesAdapter = RvMoviesAdapter(partInfos)
        rvMoviesAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        banner = Banner(context)
        banner.setBannerStyle(BannerConfig.NUM_INDICATOR)

        var bannerImgs: ArrayList<String> = ArrayList()
        var bannerTitles: ArrayList<String> = ArrayList()
        banner.setImages(bannerImgs)
        banner.setBannerTitles(bannerTitles)

        //设置图片加载器
        banner.setImageLoader(object : ImageLoader() {
            override fun displayImage(context: Context?, path: Any?, imageView: ImageView) {
                imageView.loadUrl(path as String)
            }
        })
        banner.isAutoPlay(true)
        //设置轮播时间
        banner.setDelayTime(1500)
        banner.setBannerAnimation(Transformer.Accordion)
        banner.setIndicatorGravity(BannerConfig.CENTER)
        //动态设置banner宽高
        var params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, dip(150))
        banner.layoutParams = params

        rvMoviesAdapter.addHeaderView(banner)
        mRvMovie.adapter = rvMoviesAdapter

        rvMoviesAdapter.setOnItemClickListener { adapter, view, position ->
            var film = adapter.data[position] as Film
            startActivity<FilmDetailActivity>("FILMURL" to film.detailUrl)
        }

        mSwipeRefresh.isRefreshing = true
        mPresenter.homeData()
    }

    override fun injectComponent() {
        DaggerFilmComponent.builder().activityComponent(activityComponent).build().inject(this)
        mPresenter.mView = this
    }

    override fun onStart() {
        super.onStart()
        //开始轮播
        banner.startAutoPlay()
    }

    override fun onStop() {
        super.onStop()
        //结束轮播
        banner.stopAutoPlay()
    }

}
