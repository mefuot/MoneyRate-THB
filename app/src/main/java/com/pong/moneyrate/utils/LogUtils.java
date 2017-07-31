package com.pong.moneyrate.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by User on 27/7/2560.
 */

public class LogUtils {
    private static final String TAG = "MoneyRate";

    private LogUtils() {
        throw new UnsupportedOperationException(getClass().getSimpleName() + " is utility class");
    }

    /**
     * Logging message to Logcat with show the location of this method called.
     * (Only work if called from .java file)
     *
     * @param cls     *WARNING* send same class as where LogUtils.d call. for correct file location.
     * @param message message you want to log.
     */
    public static void d(Class cls, @NonNull String message) {
        LogUtils.d(message + getLogFileLocation(cls, null));
    }

    public static void d(@NonNull String message) {
        Log.d(TAG, message);
    }

    public static void e(@NonNull String message) {
        Log.e(TAG, message);
    }

    public static void exception(Exception e) {
        Log.e(TAG + ":Exception", e.getClass().getSimpleName() + " : " + e.getMessage());
    }

    public static void exception(Class cls, Exception e) {
        Log.e(TAG + ":Exception", e.getClass().getSimpleName() + getLogFileLocation(cls, e) + e.getMessage());
    }

    private static String getLogFileLocation(@NonNull Class cls, @Nullable Exception e) {
        final StackTraceElement stackTrace;
        String fileName;

        if (e != null) {
            stackTrace = e.getStackTrace()[0];
            fileName = stackTrace.getFileName();
            if (fileName == null) {
                fileName = cls.getSimpleName();
            }
        } else {
            stackTrace = new Exception().getStackTrace()[2];
            fileName = cls.getSimpleName() + ".java";
        }

        return " (" + fileName + ':' + stackTrace.getLineNumber() + ") ";
    }
}
