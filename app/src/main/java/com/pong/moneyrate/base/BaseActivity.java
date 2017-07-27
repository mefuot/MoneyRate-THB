package com.pong.moneyrate.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by User on 27/7/2560.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());

        if (savedInstanceState == null) {
            setupBaseFragment();
        }
    }

    @Override
    public void onBackPressed() {
        if (!isTaskRoot()) {
            finish();
        }
    }

    @LayoutRes
    protected abstract int getLayout();

    protected abstract void setupBaseFragment();
}
