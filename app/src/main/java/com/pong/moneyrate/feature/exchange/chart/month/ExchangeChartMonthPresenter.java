package com.pong.moneyrate.feature.exchange.chart.month;

import com.pong.mvp_structure.MvpPresenter;

/**
 * Created by User on 4/8/2560.
 */

public class ExchangeChartMonthPresenter
        extends MvpPresenter<ExchangeChartMonthContract.View>
        implements ExchangeChartMonthContract.Presenter {

    public static ExchangeChartMonthPresenter create() {
        return new ExchangeChartMonthPresenter();
    }

    public ExchangeChartMonthPresenter() {

    }

    @Override
    public void loadExchangeRateByMonth(String startDate, String endDate, String currency) {

    }
}
