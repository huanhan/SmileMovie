package xin.lrvik.smilemovie.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_movies.*

import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.data.repository.PartInfo
import xin.lrvik.smilemovie.ui.adapter.RvMoviesAdapter

class MoviesFragment : Fragment() {

    private lateinit var partInfos :ArrayList<PartInfo>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_movies, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initData()
        mRvMovie.layoutManager = GridLayoutManager(context, 3)
        mRvMovie.adapter = RvMoviesAdapter(partInfos)

    }

    private fun initData() {
        partInfos=ArrayList()
        for(i in 1..10){
            partInfos.add(PartInfo("www.baidu.com",
                    "测试信息",
                    "标题",
                    "http://wx1.sinaimg.cn/mw690/006We1hygy1fvv2uoxfo5j304405raa8.jpg",
                    "9"))
        }

    }
}
