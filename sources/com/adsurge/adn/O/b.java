package com.adsurge.adn.O;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.adsurge.adn.X.AbstractC1628a;
import com.adsurge.adn.X.i;
import com.adsurge.adn.X.k;
import com.adsurge.adn.X.r;
import com.ironsource.C4664b4;
import com.ironsource.R6;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class b {
    public int a;
    public int b;
    public float c;
    public int d;
    public String e;
    public final String f = Build.MODEL;
    public final Context g;
    public int h;
    public volatile String i;
    public DisplayMetrics j;

    public final int i() {
        try {
            int identifier = this.g.getResources().getIdentifier("min_screen_width_bucket", "integer", this.g.getPackageName());
            if (identifier == 0) {
                return 0;
            }
            return this.g.getResources().getInteger(identifier);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public Float a() {
        if (com.adsurge.adn.K.b.a("scale")) {
            return null;
        }
        return Float.valueOf(this.c);
    }

    public Integer b() {
        if (com.adsurge.adn.K.b.a("dpi")) {
            return null;
        }
        return Integer.valueOf(this.d);
    }

    public DisplayMetrics c() {
        return this.j;
    }

    public final String d() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.adsurge.adn.J.a.d().a().getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getNetworkOperator() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public com.adsurge.adn.E0.c e() {
        if (com.adsurge.adn.K.b.a("connection_type")) {
            return null;
        }
        return r.b();
    }

    public String f() {
        if (com.adsurge.adn.K.b.a(R6.R0)) {
            return null;
        }
        if (this.i == null) {
            synchronized (b.class) {
                try {
                    if (this.i == null) {
                        this.i = d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.i;
    }

    public String g() {
        if (com.adsurge.adn.K.b.a(C4664b4.i.n)) {
            return null;
        }
        if (this.g.getResources().getConfiguration().orientation == 2) {
            this.e = CmcdData.STREAM_TYPE_LIVE;
        } else {
            this.e = "p";
        }
        return this.e;
    }

    public void h() {
        DisplayMetrics displayMetricsA = a(this.g);
        this.j = displayMetricsA;
        this.c = displayMetricsA.density;
        this.d = displayMetricsA.densityDpi;
        this.a = b(displayMetricsA);
        this.b = a(this.j);
        this.h = i();
        AbstractC1628a.a(this.g);
        k.a(this.g);
        i.a(this.g);
    }

    public b(Context context) {
        this.g = context.getApplicationContext();
    }

    public boolean j() {
        return CmcdData.STREAM_TYPE_LIVE.equals(g());
    }

    public boolean k() {
        return "p".equals(g());
    }

    public final int a(DisplayMetrics displayMetrics) {
        return a(displayMetrics.density, displayMetrics.heightPixels);
    }

    public final int b(DisplayMetrics displayMetrics) {
        return a(displayMetrics.density, displayMetrics.widthPixels);
    }

    public final DisplayMetrics a(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public final int a(float f, int i) {
        return (this.g.getApplicationInfo().flags & 8192) != 0 ? (int) (i / f) : i;
    }
}
