package com.pong.moneyrate.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.pong.moneyrate.R;

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

    protected void attachFragment(Fragment fragment) {
        attachFragment(fragment, false);
    }

    protected void attachFragment(Fragment fragment, boolean backStack) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.container, fragment);
        if (backStack) {
            ft.addToBackStack(null);
        }
        ft.commit();
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
