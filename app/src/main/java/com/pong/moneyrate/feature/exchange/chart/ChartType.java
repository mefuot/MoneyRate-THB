package com.pong.moneyrate.feature.exchange.chart;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by User on 4/8/2560.
 */
@IntDef(flag = true, value = {
        ChartType.MONTH,
        ChartType.QUARTER,
        ChartType.YEAR
})
@Retention(RetentionPolicy.SOURCE)
public @interface ChartType {
    int MONTH = 0;
    int QUARTER = 1;
    int YEAR = 1 << 1;
}
