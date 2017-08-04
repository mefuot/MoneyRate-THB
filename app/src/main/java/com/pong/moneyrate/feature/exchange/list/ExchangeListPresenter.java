package com.pong.moneyrate.feature.exchange.list;

import android.support.annotation.NonNull;

import com.pong.moneyrate.Injection;
import com.pong.moneyrate.feature.exchange.list.data.ExchangeListRepository;
import com.pong.moneyrate.feature.exchange.list.model.DailyExchangeListResponse;
import com.pong.moneyrate.feature.exchange.list.service.ExchangeListService;
import com.pong.moneyrate.model.ExchangeDetail;
import com.pong.moneyrate.utils.DateUtils;
import com.pong.mvp_structure.MvpPresenter;

import java.util.Date;
import java.util.List;

/**
 * Created by User on 27/7/2560.
 */

public class ExchangeListPresenter
        extends MvpPresenter<ExchangeListContract.View>
        implements ExchangeListContract.Presenter, ExchangeListService.OnExchangeListCallback {

    private final ExchangeListRepository mExchangeListRepository;

    public static ExchangeListPresenter create() {
        return new ExchangeListPresenter(Injection.provideExchangeListRepository());
    }

    public ExchangeListPresenter(@NonNull final ExchangeListRepository exchangeListRepository) {
        this.mExchangeListRepository = exchangeListRepository;
    }

    @Override
    public void onViewCreated() {
        super.onViewCreated();
        getView().setCurrentDate(DateUtils.getFormattedDate("yyyy-MM-dd", new Date()));

        loadExchangeList();
    }

    @Override
    public void loadExchangeList() {
        getView().showLoadingList();
        mExchangeListRepository.loadExchangeList(
                DateUtils.getFormattedDate("yyyy-MM-dd", new Date()), this);
    }

    @Override
    public void onExchangeDetailClicked(ExchangeDetail selected) {
        getView().navigateToExchangeDetailPage(selected);
    }

    @Override
    public void onApiSuccess(DailyExchangeListResponse response) {
        List<ExchangeDetail> list = response.getResult().getData().getData_detail();
        if (list == null || list.isEmpty()) {
            getView().showEmptyList();
        } else {
            getView().showExchangeList(list);
        }

        getView().setExchangeInfo(response.getResult().getData().getData_header().getReport_name_eng()
                + "\n" + response.getResult().getData().getData_header().getReport_uoq_name_eng());
    }

    @Override
    public void onApiFailed(String error) {
        getView().showLoadExchangeListFailed(error);
    }
}
