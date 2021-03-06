package com.pong.moneyrate.feature.exchange.detail;

import com.pong.moneyrate.feature.exchange.chart.ChartType;
import com.pong.mvp_structure.MvpContract;

/**
 * Created by User on 31/7/2560.
 */

public interface ExchangeDetailContract extends MvpContract {
    interface View extends MvpContract.View {
        void showMonthExchangeRateChart();

        void showYearExchangeRateChart();

        void showFiveYearExchangeRateChart();
    }

    interface Presenter extends MvpContract.Presenter<View> {
        void selectedChart(@ChartType int charType);
    }
}
