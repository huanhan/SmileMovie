package xin.lrvik.smilemovie.ui.adapter;

import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import xin.lrvik.smilemovie.R;
import xin.lrvik.smilemovie.dto.SectionSeries;

/**
 * Author by 豢涵, Email huanhanfu@126.com, Date on 2018/10/16.
 *
 */
public class RVSeriesAdapter extends BaseSectionQuickAdapter<SectionSeries,BaseViewHolder> {

    public RVSeriesAdapter(int layoutResId, int sectionHeadResId, List<SectionSeries> data) {
        super(layoutResId, sectionHeadResId, data);
    }

    @Override
    protected void convertHead(BaseViewHolder helper, SectionSeries item) {
        helper.setText(R.id.tv_item_series_title, item.header);
    }

    @Override
    protected void convert(BaseViewHolder helper, SectionSeries item) {
        helper.setText(R.id.tv_item_series_conetent,item.getmSeries().getName());
    }
}
