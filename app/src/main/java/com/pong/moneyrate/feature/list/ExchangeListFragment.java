package com.pong.moneyrate.feature.list;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.excelbkk.pong.multilayout.MultiLayout;
import com.pong.moneyrate.R;
import com.pong.moneyrate.base.BaseFragment;
import com.pong.moneyrate.custom.CustomSwipeRefreshLayout;
import com.pong.moneyrate.feature.list.adapter.ExchangeAdapter;
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
    @BindView(R.id.text_exchange_list_info)
    TextView mTextExchangeListInfo;
    @BindView(R.id.recycle_exchange_list)
    RecyclerView mRecycleExchangeList;
    @BindView(R.id.swipe_layout_exchange_list)
    CustomSwipeRefreshLayout mSwipeLayoutExchangeList;
    @BindView(R.id.multi_layout_exchange_list)
    MultiLayout mMultiLayoutExchangeList;

    private ExchangeAdapter mAdapter;

    public static ExchangeListFragment newInstance() {
        return new ExchangeListFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new ExchangeAdapter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.exchange_list_fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecycleExchangeList.setAdapter(mAdapter);
        mAdapter.setOnItemSelectedListener(new ExchangeAdapter.OnItemSelectedListener() {
            @Override
            public void onSelected(int position) {
                getPresenter().onExchangeDetailClicked(mAdapter.getItem(position));
            }
        });

        mSwipeLayoutExchangeList.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mSwipeLayoutExchangeList.setRefreshing(false);
                getPresenter().loadExchangeList();
            }
        });
    }

    @Override
    public ExchangeListContract.Presenter createPresenter() {
        return ExchangeListPresenter.create();
    }

    @Override
    public void setCurrentDate(String date) {
        mTextExchangeListDate.setText(date);
    }

    @Override
    public void setExchangeInfo(String info) {
        mTextExchangeListInfo.setText(info);
    }

    @Override
    public void showLoadingList() {
        mMultiLayoutExchangeList.showLoading();
    }

    @Override
    public void showExchangeList(List<ExchangeDetail> list) {
        mMultiLayoutExchangeList.removeAllViews();
        mAdapter.setData(list);
    }

    @Override
    public void showEmptyList() {
        mMultiLayoutExchangeList.showEmpty();
    }

    @Override
    public void showLoadExchangeListFailed(String error) {
        mMultiLayoutExchangeList.setFailMessage(error);
        mMultiLayoutExchangeList.showFail();
    }

    @Override
    public void navigateToExchangeDetailPage(ExchangeDetail detail) {
        Toast.makeText(getActivity(), detail.getCurrencyNameEng(), Toast.LENGTH_SHORT).show();
    }
}
