package com.pong.moneyrate.feature.exchange.chart.month;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.pong.moneyrate.R;
import com.pong.moneyrate.base.BaseFragment;
import com.pong.moneyrate.model.ExchangeDetail;
import com.pong.moneyrate.utils.LogUtils;

import java.util.List;

/**
 * Created by User on 4/8/2560.
 */

public class ExchangeChartMonthFragment
        extends BaseFragment<ExchangeChartMonthContract.Presenter>
        implements ExchangeChartMonthContract.View {
    public static final String CURRENCY_KEY = "currency";

    public static ExchangeChartMonthFragment newInstance(String currency) {
        ExchangeChartMonthFragment fm = new ExchangeChartMonthFragment();
        Bundle bundle = new Bundle();
        bundle.putString(CURRENCY_KEY, currency);
        fm.setArguments(bundle);
        return fm;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() == null) {
            LogUtils.d("no argument");
        } else {
            LogUtils.d("currency = " + getArguments().getString(CURRENCY_KEY));
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.exchange_chart_month_fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public ExchangeChartMonthContract.Presenter createPresenter() {
        return ExchangeChartMonthPresenter.create();
    }

    @Override
    public void showExchangeRateByMonth(List<ExchangeDetail> list) {

    }

    @Override
    public void showLoadExchangeRateFailed(String error) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }
}
