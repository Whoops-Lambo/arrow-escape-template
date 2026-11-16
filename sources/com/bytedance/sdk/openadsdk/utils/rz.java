package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz {
    public static int kgy = -1;

    public static int kgy(Context context, int i, int i2) {
        int iRound;
        int iKgy = kgy(context, i2);
        if (iKgy == -1) {
            return kgy;
        }
        int iMin = Math.min(90, Math.round(iKgy * 0.15f));
        if (i > 655) {
            iRound = Math.round((i / 728.0f) * 90.0f);
        } else if (i > 632) {
            iRound = 81;
        } else if (i > 526) {
            iRound = Math.round((i / 468.0f) * 60.0f);
        } else if (i > 432) {
            iRound = 68;
        } else {
            iRound = Math.round((i / 320.0f) * 50.0f);
        }
        return Math.max(Math.min(iRound, iMin), 50);
    }

    public static int kgy(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context != null) {
            try {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && (configuration = resources.getConfiguration()) != null) {
                    int i2 = configuration.orientation;
                    if (i == 0) {
                        i = i2;
                    }
                    if (i == i2) {
                        return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                    }
                    return Math.round(displayMetrics.widthPixels / displayMetrics.density);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "euoshRe1f8KiS9lTiQOTIUHrGIEKsHo=", "XOs5pgCubMKOYtJUixm0HFTKPQ==", 58);
                return kgy;
            }
        }
        return kgy;
    }
}
