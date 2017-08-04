package com.pong.moneyrate.feature.exchange.chart;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by User on 4/8/2560.
 */
@IntDef(flag = true, value = {
        ChartType.MONTH,
        ChartType.YEAR,
        ChartType.FIVE_YEAR
})
@Retention(RetentionPolicy.SOURCE)
public @interface ChartType {
    int MONTH = 0;
    int YEAR = 1;
    int FIVE_YEAR = 1 << 1;
}
