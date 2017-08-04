package com.pong.moneyrate.feature.exchange.chart.month;

import com.pong.moneyrate.model.ExchangeDetail;
import com.pong.mvp_structure.MvpContract;

import java.util.List;

/**
 * Created by User on 4/8/2560.
 */

public interface ExchangeChartMonthContract {
    interface View extends MvpContract.ViewWithLoading {
        void showExchangeRateByMonth(List<ExchangeDetail> list);

        void showLoadExchangeRateFailed(String error);
    }

    interface Presenter extends MvpContract.Presenter<View> {
        void loadExchangeRateByMonth(String startDate, String endDate, String currency);
    }
}
