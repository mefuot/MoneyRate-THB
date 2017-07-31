package com.pong.moneyrate.feature.list.service;

import android.support.annotation.NonNull;

import com.pong.moneyrate.feature.list.model.DailyExchangeListResponse;
import com.pong.moneyrate.service.OnApiCallback;

/**
 * Created by User on 27/7/2560.
 */

public interface ExchangeListService {
    public interface OnExchangeListCallback extends OnApiCallback<DailyExchangeListResponse> {

    }

    void loadExchangeList(String date, @NonNull final OnExchangeListCallback callback);
}
