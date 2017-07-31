package com.pong.moneyrate.custom;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.pong.moneyrate.utils.LogUtils;

import java.lang.reflect.Field;

/**
 * Created by User on 31/7/2560.
 */

public class CustomSwipeRefreshLayout extends SwipeRefreshLayout {
    public CustomSwipeRefreshLayout(Context context) {
        super(context);
    }

    public CustomSwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setRefreshIndicatorDrawable(@NonNull Drawable drawable) {
        try {
            Field f = SwipeRefreshLayout.class.getDeclaredField("mCircleView");
            f.setAccessible(true);
            ImageView img = (ImageView) f.get(this);
            img.setImageDrawable(drawable);
            img.setBackground(drawable);
        } catch (Exception e) {
            LogUtils.exception(getClass(), e);
        }
    }
}
