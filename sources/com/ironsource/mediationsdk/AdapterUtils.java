package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class AdapterUtils {
    public static final int MIN_TABLET_DP_SIZE = 600;

    public static boolean isLargeScreen(Context context) {
        if (context != null) {
            return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils isLargeScreen - context is null", 3);
        return false;
    }

    public static int dpToPixels(Context context, int i) {
        if (context != null) {
            return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils dpToPixels - context is null, returning dpSize", 3);
        return i;
    }

    public static String getScreenSizeParams(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        float fMin = Math.min(displayMetrics.widthPixels / f2, f / f2);
        float f3 = displayMetrics.xdpi;
        float f4 = displayMetrics.ydpi;
        float f5 = displayMetrics.widthPixels / f3;
        float f6 = displayMetrics.heightPixels / f4;
        double dSqrt = Math.sqrt((f6 * f6) + (f5 * f5));
        int i = context.getResources().getConfiguration().smallestScreenWidthDp;
        StringBuilder sb = new StringBuilder("smallestWidth = ");
        sb.append(fMin);
        sb.append(" diagonalInches = ");
        sb.append(dSqrt);
        return pv1.l(i, " smallScreenDpApi =  ", sb);
    }
}
