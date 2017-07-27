package com.pong.moneyrate.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pong.moneyrate.R;
import com.pong.mvp_structure.MvpContract;

/**
 * Created by User on 27/7/2560.
 */

public abstract class ToolbarFragment<P extends MvpContract.Presenter> extends BindingFragment<P> {

    private ImageButton mBackButton;
    private TextView mTitle;
    private Toolbar mToolBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.toolbar_fragment, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        setupToolbar(view);
        setupFragmentLayout(view);
        super.onViewCreated(view, savedInstanceState);
    }

    private void setupToolbar(View view) {
        mToolBar = (Toolbar) view.findViewById(R.id.toolbar);
        mTitle = (TextView) view.findViewById(R.id.toolbar_title);
        mBackButton = (ImageButton) view.findViewById(R.id.toolbar_navigation_back);

        setActionBarTitle(getActionBarTitle());
        setBarNavigatorShow(true);
        setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });
    }

    private void setupFragmentLayout(View view) {
        LayoutInflater inflater = LayoutInflater.from(getActivity());
        View inflatedLayout = inflater.inflate(getLayoutId(), null, false);
        inflatedLayout.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        FrameLayout contentLayout = (FrameLayout) view.findViewById(R.id.container);
        contentLayout.addView(inflatedLayout);
        bindingView(inflatedLayout);
    }

    public void setActionBarTitle(String text) {
        mTitle.setText(text);
    }

    public void setBarNavigatorShow(boolean isShow) {
        if (isShow) {
            mBackButton.setVisibility(View.VISIBLE);
        } else {
            mBackButton.setVisibility(View.GONE);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener listener) {
        mBackButton.setOnClickListener(listener);
    }

    public void hideToolbar() {
        mToolBar.setVisibility(View.GONE);
    }

    protected abstract String getActionBarTitle();

    @LayoutRes
    protected abstract int getLayoutId();
}
