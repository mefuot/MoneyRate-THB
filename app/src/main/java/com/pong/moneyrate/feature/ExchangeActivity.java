package com.pong.moneyrate.feature;

import com.pong.moneyrate.R;
import com.pong.moneyrate.base.BaseActivity;
import com.pong.moneyrate.feature.list.ExchangeListFragment;

/**
 * Created by User on 31/7/2560.
 */

public class ExchangeActivity extends BaseActivity {
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
}
