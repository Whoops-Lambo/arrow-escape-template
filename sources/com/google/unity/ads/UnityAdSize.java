package com.google.unity.ads;

import android.app.Activity;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class UnityAdSize {
    private static final int FULL_WIDTH = -1;

    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Activity activity, int i) {
        if (i == -1) {
            i = getScreenWidth(activity);
        }
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity, i);
    }

    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Activity activity, int i) {
        if (i == -1) {
            i = getScreenWidth(activity);
        }
        return AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(activity, i);
    }

    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(Activity activity, int i) {
        if (i == -1) {
            i = getScreenWidth(activity);
        }
        return AdSize.getPortraitAnchoredAdaptiveBannerAdSize(activity, i);
    }

    private static int getScreenWidth(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    private UnityAdSize() {
    }
}
