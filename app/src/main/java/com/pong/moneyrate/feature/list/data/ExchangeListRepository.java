package com.pong.moneyrate.feature.list.data;

import android.support.annotation.NonNull;

import com.pong.moneyrate.feature.list.service.ExchangeListService;

/**
 * Created by User on 27/7/2560.
 */

public interface ExchangeListRepository {
    void loadExchangeList(String date, @NonNull final ExchangeListService.OnExchangeListCallback callback);
}
