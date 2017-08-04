package com.pong.moneyrate.feature.exchange.list.data;

import android.support.annotation.NonNull;

import com.pong.moneyrate.feature.exchange.list.service.ExchangeListService;

/**
 * Created by User on 27/7/2560.
 */

public class ExchangeListRepositories implements ExchangeListRepository {

    private final ExchangeListService mService;

    private static ExchangeListRepositories repository = null;

    private ExchangeListRepositories(@NonNull ExchangeListService service) {
        mService = service;
    }

    public static synchronized ExchangeListRepository getRepository(@NonNull ExchangeListService service) {
        if (repository == null) {
            repository = new ExchangeListRepositories(service);
        }
        return repository;
    }

    @Override
    public void loadExchangeList(String date, @NonNull ExchangeListService.OnExchangeListCallback callback) {
        mService.loadExchangeList(date, callback);
    }
}
