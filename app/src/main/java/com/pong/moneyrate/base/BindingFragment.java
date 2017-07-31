package com.pong.moneyrate.base;

import android.view.View;

import com.pong.mvp_structure.MvpContract;
import com.pong.mvp_structure.MvpFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by User on 27/7/2560.
 */

public abstract class BindingFragment<P extends MvpContract.Presenter> extends MvpFragment<P> {

    private Unbinder unbinder;

    protected void bindingView(View view) {
        unbinder = ButterKnife.bind(this, view);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (unbinder != null) {
            unbinder.unbind();
        }
    }
}
