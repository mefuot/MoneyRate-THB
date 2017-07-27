package com.pong.moneyrate.feature.list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.pong.moneyrate.R;
import com.pong.moneyrate.base.BaseFragment;
import com.pong.moneyrate.model.ExchangeDetail;

import java.util.List;

import butterknife.BindView;

/**
 * Created by User on 27/7/2560.
 */

public class ExchangeListFragment
        extends BaseFragment<ExchangeListContract.Presenter>
        implements ExchangeListContract.View {

    @BindView(R.id.text_exchange_list_date)
    TextView mTextExchangeListDate;
    @BindView(R.id.recycle_exchange_list)
    RecyclerView mRecycleExchangeList;

    public static ExchangeListFragment newInstance() {
        return new ExchangeListFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.exchange_list_fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public ExchangeListContract.Presenter createPresenter() {
        return ExchangeListPresenter.create();
    }

    @Override
    public void showCurrentDate(String date) {
        mTextExchangeListDate.setText(date);
    }

    @Override
    public void showLoadingList() {

    }

    @Override
    public void showExchangeList(List<ExchangeDetail> list) {

    }

    @Override
    public void showEmptyList() {

    }

    @Override
    public void showLoadExchangeListFailed(String error) {

    }

    @Override
    public void navigateToExchangeDetailPage(ExchangeDetail detail) {

    }
}
