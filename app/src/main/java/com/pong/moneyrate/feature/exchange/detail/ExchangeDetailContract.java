package com.pong.moneyrate.feature.exchange.detail;

import com.pong.mvp_structure.MvpContract;

/**
 * Created by User on 31/7/2560.
 */

public interface ExchangeDetailContract extends MvpContract {
    interface View extends MvpContract.View {
        void showMonthExchangeRateChart();

        void showQuarterExchangeRateChart();

        void showYearExchangeRateChart();
    }

    interface Presenter extends MvpContract.Presenter<View> {

    }
}
