package com.pong.moneyrate.feature.exchange.detail;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.Bundler;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.pong.moneyrate.R;
import com.pong.moneyrate.base.ToolbarFragment;
import com.pong.moneyrate.feature.exchange.chart.month.ExchangeChartMonthFragment;
import com.pong.moneyrate.model.ExchangeDetail;
import com.pong.moneyrate.utils.LogUtils;

import org.parceler.Parcels;

import butterknife.BindView;

/**
 * Created by User on 4/8/2560.
 */

public class ExchangeDetailFragment
        extends ToolbarFragment<ExchangeDetailContract.Presenter>
        implements ExchangeDetailContract.View {

    private static final String DETAIL_KEY = "ExchangeDetail";

    @BindView(R.id.img_exchange_detail_flag)
    ImageView mImgExchangeDetailFlag;
    @BindView(R.id.text_exchange_detail_info)
    TextView mTextExchangeDetailInfo;
    @BindView(R.id.text_exchange_detail_period)
    TextView mTextExchangeDetailPeriod;
    @BindView(R.id.text_exchange_detail_buying_sight)
    TextView mTextExchangeDetailBuyingSight;
    @BindView(R.id.text_exchange_detail_buying_transfer)
    TextView mTextExchangeDetailBuyingTransfer;
    @BindView(R.id.text_exchange_detail_selling)
    TextView mTextExchangeDetailSelling;
    @BindView(R.id.text_exchange_detail_mid_rate)
    TextView mTextExchangeDetailMidRate;
    @BindView(R.id.viewpager_tab_exchange_detail)
    SmartTabLayout mViewpagerTabExchangeDetail;
    @BindView(R.id.viewpager_exchange_detail)
    ViewPager mViewpagerExchangeDetail;

    private ExchangeDetail mDetail;

    public static ExchangeDetailFragment newInstance(@NonNull ExchangeDetail detail) {
        ExchangeDetailFragment fm = new ExchangeDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(DETAIL_KEY, Parcels.wrap(detail));
        fm.setArguments(bundle);
        return fm;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDetail = Parcels.unwrap(getArguments().getParcelable(DETAIL_KEY));
        if (mDetail == null) {
            NullPointerException e = new NullPointerException("Exchange Detail can't be null");
            LogUtils.exception(getClass(), e);
            throw e;
        }
    }

    @Override
    protected String getActionBarTitle() {
        return "THB -> " + mDetail.getCurrencyId();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.exchange_detail_fragment;
    }

    @Override
    public ExchangeDetailContract.Presenter createPresenter() {
        return ExchangeDetailPresenter.create();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupView();
        setupViewPager();
    }

    private void setupViewPager() {
        Bundle bundle = new Bundler().putString(ExchangeChartMonthFragment.CURRENCY_KEY,
                mDetail.getCurrencyId()).get();

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getChildFragmentManager(), FragmentPagerItems.with(getActivity())
                .add("Month", ExchangeChartMonthFragment.class, new Bundler().putString("currency", "month").get())
                .add("Quarter", ExchangeChartMonthFragment.class, new Bundler().putString("currency", "year").get())
                .add("Year", ExchangeChartMonthFragment.class, new Bundler().putString("currency", "5year").get())
                .create());
        mViewpagerExchangeDetail.setAdapter(adapter);
        mViewpagerTabExchangeDetail.setViewPager(mViewpagerExchangeDetail);
    }

    private void setupView() {
//        mImgExchangeDetailFlag
        mTextExchangeDetailPeriod.setText(mDetail.getPeriod());
        mTextExchangeDetailInfo.setText(mDetail.getCurrencyNameEng());
        mTextExchangeDetailBuyingSight.setText(mDetail.getBuyingSight());
        mTextExchangeDetailBuyingTransfer.setText(mDetail.getBuyingTransfer());
        mTextExchangeDetailSelling.setText(mDetail.getSelling());
        mTextExchangeDetailMidRate.setText(mDetail.getMidRate());
    }

    @Override
    public void showMonthExchangeRateChart() {

    }

    @Override
    public void showFiveYearExchangeRateChart() {

    }

    @Override
    public void showYearExchangeRateChart() {

    }

    private void swapChartFragment() {

    }
}
