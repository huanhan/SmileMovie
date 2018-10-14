package xin.lrvik.smilemovie.ui.fragment

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_movies.*
import lrvik.xin.base.ui.fragment.BaseMvpFragment
import xin.lrvik.datacenter.pojo.Film
import xin.lrvik.datacenter.pojo.PageInfo
import xin.lrvik.smilemovie.R
import xin.lrvik.smilemovie.injection.component.DaggerMoviesComponent
import xin.lrvik.smilemovie.presenter.MoviesPresenter
import xin.lrvik.smilemovie.presenter.view.MoviesView
import xin.lrvik.smilemovie.ui.adapter.RvMoviesAdapter

class MoviesFragment : BaseMvpFragment<MoviesPresenter>(), MoviesView {

    lateinit var type: String

    private var partInfos: ArrayList<Film> = ArrayList()

    override fun injectComponent() {
        DaggerMoviesComponent.builder().activityComponent(activityComponent).build().inject(this)
        mPresenter.mView = this
    }

    override fun onMoviesResult(data: PageInfo) {
        //toast(data.toString())
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        this.type = arguments!!.getString(TYPE)
        return inflater.inflate(R.layout.fragment_movies, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mRvMovie.layoutManager = GridLayoutManager(context, 3)
        mRvMovie.adapter = RvMoviesAdapter(partInfos)
        mPresenter.moviesData(type,1)
    }


    companion object {
        val TYPE = "TYPE"

        fun newInstance(type: String): MoviesFragment {
            var f = MoviesFragment()
            var b = Bundle()
            b.putString(TYPE, type)
            f.setArguments(b)
            return f
        }

    }


}
