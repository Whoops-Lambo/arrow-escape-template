package com.adsurge.adn.O;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import com.adsurge.adn.X.x;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public final String a;
    public final Context b;
    public final String c;
    public final String d;
    public String e;
    public String f;
    public int g;
    public final long h = SystemClock.elapsedRealtime();
    public final int i;
    public final boolean j;
    public final String k;

    public String a() {
        return this.d;
    }

    public String b() {
        if (com.adsurge.adn.K.b.a("app_name")) {
            return null;
        }
        return this.f;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.a;
    }

    public Integer e() {
        if (com.adsurge.adn.K.b.a("app_open_cnt")) {
            return null;
        }
        return Integer.valueOf(this.i);
    }

    public Long f() {
        if (com.adsurge.adn.K.b.a("app_running_time")) {
            return null;
        }
        return Long.valueOf(SystemClock.elapsedRealtime() - this.h);
    }

    public String g() {
        return this.k;
    }

    public Integer h() {
        if (com.adsurge.adn.K.b.a("target_sdk_version")) {
            return null;
        }
        return Integer.valueOf(this.g);
    }

    public boolean i() {
        return this.j;
    }

    public final void j() {
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.d, 0);
            this.e = packageInfo.versionName;
            this.f = packageInfo.applicationInfo.loadLabel(this.b.getPackageManager()).toString();
            this.g = packageInfo.applicationInfo.targetSdkVersion;
        } catch (Exception unused) {
        }
    }

    public a(String str, Context context, String str2, boolean z) {
        this.a = str;
        this.b = context;
        this.c = str2;
        this.d = context.getPackageName();
        int iA = x.a("appInitialCount", 0) + 1;
        this.i = iA;
        this.j = z;
        this.k = UUID.randomUUID().toString();
        x.b("appInitialCount", iA);
        j();
    }
}
