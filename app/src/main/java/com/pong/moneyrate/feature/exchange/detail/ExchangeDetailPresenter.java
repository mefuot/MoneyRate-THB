package com.pong.moneyrate.feature.exchange.detail;

import com.pong.moneyrate.feature.exchange.chart.ChartType;
import com.pong.mvp_structure.MvpPresenter;

/**
 * Created by User on 4/8/2560.
 */

public class ExchangeDetailPresenter
        extends MvpPresenter<ExchangeDetailContract.View>
        implements ExchangeDetailContract.Presenter {

    public static ExchangeDetailPresenter create() {
        return new ExchangeDetailPresenter();
    }

    public ExchangeDetailPresenter() {

    }

    @Override
    public void selectedChart(@ChartType int charType) {
        switch (charType) {
            case ChartType.MONTH:
                getView().showMonthExchangeRateChart();
                break;
            case ChartType.YEAR:
                getView().showYearExchangeRateChart();
                break;
            case ChartType.FIVE_YEAR:
                getView().showFiveYearExchangeRateChart();
                break;
        }
    }
}
