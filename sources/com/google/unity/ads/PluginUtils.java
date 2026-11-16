package com.google.unity.ads;

import android.app.Activity;
import android.content.res.Resources;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class PluginUtils {
    public static final String LOGTAG = "AdsUnity";
    public static final int POSITION_BOTTOM = 1;
    public static final int POSITION_BOTTOM_LEFT = 4;
    public static final int POSITION_BOTTOM_RIGHT = 5;
    public static final int POSITION_CENTER = 6;
    public static final int POSITION_CUSTOM = -1;
    public static final int POSITION_TOP = 0;
    public static final int POSITION_TOP_LEFT = 2;
    public static final int POSITION_TOP_RIGHT = 3;

    public static float getDeviceDensity(Activity activity) {
        if (activity != null) {
            return activity.getResources().getDisplayMetrics().density;
        }
        e32.i("Activity is null.");
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static String getErrorReason(int i) {
        if (i == 0) {
            return UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
        }
        if (i == 1) {
            return "Invalid request";
        }
        if (i == 2) {
            return "Network error";
        }
        if (i == 3) {
            return "No fill";
        }
        pv1.u(i, "Unexpected error code: ", LOGTAG);
        return "";
    }

    public static float convertDpToPixel(float f) {
        return f * Resources.getSystem().getDisplayMetrics().density;
    }

    public static float convertPixelsToDp(float f) {
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f / f2;
        }
        e32.i("Pixels to DP conversion failed. Display metrics density is zero.");
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static int getLayoutGravityForPositionCode(int i) {
        switch (i) {
            case -1:
            case 2:
                return 51;
            case 0:
                return 49;
            case 1:
                return 81;
            case 3:
                return 53;
            case 4:
                return 83;
            case 5:
                return 85;
            case 6:
                return 17;
            default:
                defpackage.d.r("Attempted to position ad with invalid ad position.");
                return 0;
        }
    }
}
