package xin.lrvik.smilemovie.ui.activity

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_player_src.*
import lrvik.xin.base.ui.activity.BaseActivity
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import xin.lrvik.datacenter.ParseHandler
import xin.lrvik.datacenter.pojo.FilmInfos
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.dto.SectionSeries
import xin.lrvik.smilemovie.ui.adapter.RVSeriesAdapter
import java.util.*

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/15.
 *播放源activity，这里获取具体播放地址，进行播放
 */

class PlayerSrcActivity : BaseActivity() {

    private var sectionSeries: ArrayList<SectionSeries> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_src)
        initView()
    }

    private fun initView() {

        var filmInfos = intent.getSerializableExtra("FILMINFOS") as FilmInfos

        setSupportActionBar(mToolbar)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        filmInfos?.let {
            actionBar?.title = it.title

            var i = 1

            if (sectionSeries.size > 0) {
                sectionSeries.clear()
            }
            var sectionSeriesTemp: SectionSeries

            //播放链接
            for (series in filmInfos.playerUrls) {
                sectionSeriesTemp = SectionSeries(true, "线路$i")
                sectionSeries.add(sectionSeriesTemp)
                i++
                for (sery in series) {
                    sectionSeriesTemp = SectionSeries(sery)
                    sectionSeries.add(sectionSeriesTemp)
                }
            }

            //磁力链接
            val downloadUrls = filmInfos.downloadUrls
            if (downloadUrls != null && downloadUrls!!.isNotEmpty()) {
                sectionSeriesTemp = SectionSeries(true, "迅雷下载")
                sectionSeries.add(sectionSeriesTemp)
                for (series in downloadUrls!!) {
                    sectionSeriesTemp = SectionSeries(series)
                    sectionSeries.add(sectionSeriesTemp)
                }
            }


            val linearLayoutManager = LinearLayoutManager(this)
            linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
            mRvSeries.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)

            val rvSeriesAdapter = RVSeriesAdapter(R.layout.item_series_content, R.layout.item_series_title, sectionSeries)

            rvSeriesAdapter.setOnItemClickListener { adapter, view, position ->
                val sectionSeries = sectionSeries[position]
                if (!sectionSeries.isHeader) {

                    val url = sectionSeries.getmSeries()!!.url
                    if (url.contains("thunder")) {

                        //唤起迅雷
                        try {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                            intent.addCategory("android.intent.category.DEFAULT")
                            startActivity(intent)
                        } catch (e: Exception) {
                            val cm = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                            val mClipData = ClipData.newPlainText("Label", url)
                            cm.primaryClip = mClipData
                            toast("未安装迅雷,已将下载链接复制到剪切板，请手动粘贴至迅雷进行下载!")
                        }

                    } else {
//                        mCurName = sectionSeries.getmSeries().getName()
                        playerUrl(sectionSeries.getmSeries()!!.url)
                    }

                }
            }

            mRvSeries.adapter = rvSeriesAdapter

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun playerUrl(url: String) {
        startActivity<PlayerActivity>("PLAYERURL" to ParseHandler.instance.getPlayerUrl(url))
    }

}
