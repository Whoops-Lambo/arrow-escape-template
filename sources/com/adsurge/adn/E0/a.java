package com.adsurge.adn.E0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class a {
    public final String a;
    public final Context b;
    public final String c;
    public final String d;
    public String e;
    public String f;
    public long g;
    public final long h = SystemClock.elapsedRealtime();

    public String a() {
        return this.a;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.c;
    }

    public final void e() {
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.d, 0);
            this.e = packageInfo.versionName;
            this.g = packageInfo.firstInstallTime;
            this.f = packageInfo.applicationInfo.loadLabel(this.b.getPackageManager()).toString();
        } catch (Exception unused) {
        }
    }

    public a(String str, Context context, String str2) {
        this.a = str;
        this.b = context;
        this.c = str2;
        this.d = context.getPackageName();
        e();
    }
}
