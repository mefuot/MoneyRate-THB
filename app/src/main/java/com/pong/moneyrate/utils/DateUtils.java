package com.pong.moneyrate.utils;

import android.support.annotation.NonNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 27/7/2560.
 */

public class DateUtils {
    private DateUtils() {
        throw new UnsupportedOperationException(getClass().getSimpleName() + " is utility class");
    }

    public static String getFormattedDate(String format, @NonNull Date date) {
        if (format == null || format.isEmpty()) {
            format = "yyyyMMddHHmmss";
        }
        try {
            SimpleDateFormat fmt = new SimpleDateFormat(format, java.util.Locale.getDefault());
            return fmt.format(date);
        } catch (IllegalArgumentException e) {
            LogUtils.exception(e);
        }

        return "";
    }

    public static String reFormattedDateFromString(String inputFormat,
                                                   String outputFormat,
                                                   @NonNull String inputDate) {
        if (inputFormat == null || inputFormat.isEmpty()) {
            inputFormat = "yyyyMMddHHmmss";
        }
        if (outputFormat == null || outputFormat.isEmpty()) {
            outputFormat = "dd/MM/yyyy HH:mm";
        }
        Date parsedDate;
        String outputDate = "";

        try {
            SimpleDateFormat baseInput = new SimpleDateFormat(inputFormat, java.util.Locale.getDefault());
            SimpleDateFormat baseOutput = new SimpleDateFormat(outputFormat, java.util.Locale.getDefault());

            parsedDate = baseInput.parse(inputDate);
            outputDate = baseOutput.format(parsedDate);
        } catch (ParseException | IllegalArgumentException e) {
            LogUtils.exception(e);
        }
        return outputDate;

    }
}
