package com.singular.sdk.internal;

import android.util.Log;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class SingularLog {
    static boolean ENABLE_LOGGING = false;
    static int LOG_LEVEL = 6;
    private final String TAG = MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_SINGULAR;
    private final String tag;

    public int debug(String str, Object... objArr) {
        if (shouldLog(3)) {
            return Log.d(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_SINGULAR, text(String.format(str, objArr)));
        }
        return 0;
    }

    public int error(String str, Object... objArr) {
        if (shouldLog(6)) {
            return Log.e(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_SINGULAR, text(String.format(str, objArr)));
        }
        return 0;
    }

    public int info(String str, Object... objArr) {
        if (shouldLog(4)) {
            return Log.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_SINGULAR, text(String.format(str, objArr)));
        }
        return 0;
    }

    public boolean isDebugEnabled() {
        return shouldLog(3);
    }

    public static SingularLog getLogger(String str) {
        return new SingularLog(str);
    }

    public boolean shouldLog(int i) {
        return ENABLE_LOGGING && LOG_LEVEL <= i;
    }

    public String text(String str) {
        return this.tag + " [" + getThreadInfo() + "] - " + str;
    }

    private SingularLog(String str) {
        this.tag = str;
    }

    public static String getThreadInfo() {
        return Thread.currentThread().getName();
    }

    public int debug(String str) {
        if (shouldLog(3)) {
            return Log.d(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_SINGULAR, text(str));
        }
        return 0;
    }

    public int error(String str, Throwable th) {
        if (shouldLog(6)) {
            return Log.e(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_SINGULAR, text(str), th);
        }
        return 0;
    }

    public int info(String str) {
        if (shouldLog(4)) {
            return Log.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_SINGULAR, text(str));
        }
        return 0;
    }

    public int error(String str) {
        if (shouldLog(6)) {
            return Log.e(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_SINGULAR, text(str));
        }
        return 0;
    }
}
