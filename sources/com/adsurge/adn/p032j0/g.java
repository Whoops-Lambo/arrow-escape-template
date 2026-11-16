package com.adsurge.adn.p032j0;

import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.WindowManager;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class g {
    public static Configuration a;
    public static Pair b;
    public static float c;

    public static int b(double d) {
        if (d == 0.0d) {
            return 0;
        }
        float f = c;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 1.0f;
        }
        return d > 0.0d ? (int) ((d / ((double) f)) + 0.5d) : -((int) (((-d) / ((double) f)) + 0.5d));
    }

    public static boolean d() {
        return a.orientation == 1;
    }

    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        Configuration configuration = applicationContext.getResources().getConfiguration();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a = configuration;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        if (a.orientation == 1) {
            b = new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        } else {
            b = new Pair(Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.widthPixels));
        }
        c = displayMetrics.density;
        e.a(2230120, SystemClock.elapsedRealtime() - jElapsedRealtime, 1, null);
    }

    public static int c() {
        Object obj;
        if (d()) {
            obj = b.first;
        } else {
            obj = b.second;
        }
        return ((Integer) obj).intValue();
    }

    public static int b() {
        return ((Integer) (d() ? b.second : b.first)).intValue();
    }

    public static float a() {
        return c;
    }

    public static int a(double d) {
        if (d == 0.0d) {
            return 0;
        }
        float f = c;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 1.0f;
        }
        return d > 0.0d ? (int) ((d * ((double) f)) + 0.5d) : -((int) (((-d) * ((double) f)) + 0.5d));
    }
}
