package com.pong.moneyrate.service;

/**
 * Created by User on 27/7/2560.
 */

public interface OnApiCallback<T> {
    void onApiSuccess(T response);

    void onApiFailed(String error);
}
