package com.pong.moneyrate.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pong.mvp_structure.MvpContract;

/**
 * Created by User on 27/7/2560.
 */

public abstract class BaseFragment<P extends MvpContract.Presenter> extends BindingFragment<P> {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), null);
        bindingView(view);
        return view;
    }

    @LayoutRes
    protected abstract int getLayoutId();
}
