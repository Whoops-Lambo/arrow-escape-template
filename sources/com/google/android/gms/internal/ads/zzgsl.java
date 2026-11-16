package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgsl implements zzgrr {
    public long a = -1;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public final long i = SystemClock.uptimeMillis();

    public static boolean d(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            return str.contains(AdSurgeAdFormat.Constants.INTERSTITIAL_LABEL) || str.contains(AdSurgeAdFormat.Constants.APP_OPEN_LABEL) || str.contains("REWARDED");
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final synchronized void a(HashMap map) {
        this.h = this.g;
        this.g = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final synchronized void b(HashMap map) {
        this.b = this.a;
        this.a = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgrr
    public final synchronized void c(HashMap map, Context context, View view) {
        WindowManager windowManager;
        try {
            this.d = this.c;
            this.c = SystemClock.uptimeMillis();
            long j = this.e;
            if (j != -1) {
                this.f = j;
            }
            DisplayMetrics displayMetrics = null;
            if ((Build.VERSION.SDK_INT < 33 || context.isUiContext()) && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                displayMetrics = new DisplayMetrics();
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (NoSuchMethodError unused) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
            if (displayMetrics != null) {
                int i = displayMetrics.widthPixels * displayMetrics.heightPixels;
                if (view != null && view.getVisibility() == 0 && view.getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (!view.isShown() || view.getGlobalVisibleRect(new Rect()))) {
                    int iMin = Math.min(view.getWidth(), displayMetrics.widthPixels) * Math.min(view.getHeight(), displayMetrics.heightPixels);
                    if (iMin + iMin >= i || (iMin == 0 && d(view))) {
                        this.e = this.c;
                    }
                }
                e(map);
            }
            this.e = -1L;
            e(map);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e(HashMap map) {
        map.put("tcq", Long.valueOf(this.a));
        map.put("tpq", Long.valueOf(this.b));
        map.put("tcc", Long.valueOf(this.g));
        map.put("tpc", Long.valueOf(this.h));
        map.put("tpv", Long.valueOf(this.d));
        map.put("tcv", Long.valueOf(this.c));
        map.put("tchv", Long.valueOf(this.e));
        map.put("tphv", Long.valueOf(this.f));
        map.put("tst", Long.valueOf(this.i));
    }
}
