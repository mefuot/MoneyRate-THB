package com.pong.moneyrate.feature.list;

import com.pong.moneyrate.model.ExchangeDetail;
import com.pong.mvp_structure.MvpContract;

import java.util.List;

/**
 * Created by User on 27/7/2560.
 */

public interface ExchangeListContract extends MvpContract {
    interface View extends MvpContract.View {
        void showCurrentDate(String date);

        void showLoadingList();

        void showExchangeList(List<ExchangeDetail> list);

        void showEmptyList();

        void showLoadExchangeListFailed(String error);

        void navigateToExchangeDetailPage(ExchangeDetail detail);
    }

    interface Presenter extends MvpContract.Presenter<View> {
        void loadExchangeList();

        void onExchangeDetailClicked(ExchangeDetail selected);
    }
}
