package xin.lrvik.smilemovie.dto

import com.chad.library.adapter.base.entity.SectionEntity
import xin.lrvik.datacenter.pojo.Series

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/16.
 *
 */
class SectionSeries : SectionEntity<Series> {

    private var mSeries: Series? = null

    constructor(mSeries: Series) : super(mSeries) {
        this.mSeries = mSeries
    }

    fun getmSeries(): Series? {
        return mSeries
    }

    fun setmSeries(mSeries: Series) {
        this.mSeries = mSeries
    }

    constructor(isHeader: Boolean, header: String) : super(isHeader, header) {}
}