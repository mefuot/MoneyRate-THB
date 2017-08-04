package com.pong.moneyrate.feature.exchange;

import com.pong.moneyrate.R;
import com.pong.moneyrate.base.BaseActivity;
import com.pong.moneyrate.feature.exchange.detail.ExchangeDetailFragment;
import com.pong.moneyrate.feature.exchange.list.ExchangeListFragment;
import com.pong.moneyrate.model.ExchangeDetail;

/**
 * Created by User on 31/7/2560.
 */

public class ExchangeActivity extends BaseActivity implements ExchangeListFragment.OnExchangeListFragmentListener {
    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void setupBaseFragment() {
        ExchangeListFragment fragment = (ExchangeListFragment)
                getSupportFragmentManager().findFragmentById(R.id.container);

        if (fragment == null) {
            fragment = ExchangeListFragment.newInstance();
        }

        attachFragment(fragment);
    }

    @Override
    public void navigateToExchangeDetailPage(ExchangeDetail model) {
        addFragment(ExchangeDetailFragment.newInstance(model));
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }
}
