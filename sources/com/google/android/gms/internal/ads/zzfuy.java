package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import defpackage.vi4;
import java.util.EnumMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfuy {
    public final zzeaw a;

    public final void a(int i, long j, vi4 vi4Var, String str) {
        zzeav zzeavVarA = this.a.a();
        zzeavVarA.b("action", "start_preload");
        zzeavVarA.b("sp_ts", Long.toString(j));
        zzeavVarA.b("ad_format", vi4Var.a());
        zzeavVarA.b("ad_unit_id", vi4Var.a);
        zzeavVarA.b("pid", vi4Var.c);
        zzeavVarA.b("max_ads", Integer.toString(i));
        zzeavVarA.b("pv", str);
        zzeavVarA.c();
    }

    public final void b(EnumMap enumMap, long j) {
        zzeav zzeavVarA = this.a.a();
        zzeavVarA.b("action", "start_preload");
        zzeavVarA.b("sp_ts", Long.toString(j));
        zzeavVarA.b("pv", "1");
        for (AdFormat adFormat : enumMap.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzeavVarA.b(strValueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(adFormat)).intValue()));
        }
        zzeavVarA.c();
    }

    public final void c(int i, int i2, long j, Long l, String str, vi4 vi4Var, String str2) {
        zzeav zzeavVarA = this.a.a();
        zzeavVarA.b("plaac_ts", Long.toString(j));
        zzeavVarA.b("max_ads", Integer.toString(i));
        zzeavVarA.b("cache_size", Integer.toString(i2));
        zzeavVarA.b("action", "is_ad_available");
        if (vi4Var != null) {
            zzeavVarA.b("ad_unit_id", vi4Var.a);
            zzeavVarA.b("pid", vi4Var.c);
            zzeavVarA.b("ad_format", vi4Var.a());
        }
        if (l != null) {
            zzeavVarA.b("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            zzeavVarA.b("gqi", str);
        }
        zzeavVarA.b("pv", str2);
        zzeavVarA.c();
    }

    public final void d(long j, int i, int i2, String str, vi4 vi4Var, String str2) {
        zzeav zzeavVarA = this.a.a();
        zzeavVarA.b("ppla_ts", Long.toString(j));
        zzeavVarA.b("ad_format", vi4Var.a());
        zzeavVarA.b("ad_unit_id", vi4Var.a);
        zzeavVarA.b("pid", vi4Var.c);
        zzeavVarA.b("max_ads", Integer.toString(i));
        zzeavVarA.b("cache_size", Integer.toString(i2));
        zzeavVarA.b("action", "poll_ad");
        if (str != null) {
            zzeavVarA.b("gqi", str);
        }
        zzeavVarA.b("pv", str2);
        zzeavVarA.c();
    }

    public final void e(long j, long j2, long j3, long j4, long j5) {
        zzeav zzeavVarA = this.a.a();
        zzeavVarA.b("action", "iic");
        zzeavVarA.b("pat", Long.toString(j));
        zzeavVarA.b("bot", Long.toString(j2));
        zzeavVarA.b(com.safedk.android.analytics.brandsafety.m.m, Long.toString(j3));
        zzeavVarA.b("mbot", Long.toString(j4));
        zzeavVarA.b("mim", Long.toString(j5));
        zzeavVarA.c();
    }

    public final void f(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3) {
        zzeav zzeavVarA = this.a.a();
        zzeavVarA.b("action", str);
        zzeavVarA.b("pat", Long.toString(j));
        zzeavVarA.b("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zzeavVarA.b("max_ads", Integer.toString(i));
        zzeavVarA.b("cache_size", Integer.toString(i2));
        zzeavVarA.b("pas", Integer.toString(i3));
        zzeavVarA.b("pv", "2");
        zzeavVarA.b("ad_unit_id", str3);
        zzeavVarA.b("pid", str2);
        zzeavVarA.c();
    }

    public final void g(String str, String str2, long j, int i, int i2, String str3, vi4 vi4Var, String str4) {
        zzeav zzeavVarA = this.a.a();
        zzeavVarA.b(str2, Long.toString(j));
        if (vi4Var != null) {
            zzeavVarA.b("ad_unit_id", vi4Var.a);
            zzeavVarA.b("ad_format", vi4Var.a());
            zzeavVarA.b("pid", vi4Var.c);
        }
        zzeavVarA.b("action", str);
        if (str3 != null) {
            zzeavVarA.b("gqi", str3);
        }
        if (i >= 0) {
            zzeavVarA.b("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            zzeavVarA.b("cache_size", Integer.toString(i2));
        }
        zzeavVarA.b("pv", str4);
        zzeavVarA.c();
    }

    public final void h(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzeav zzeavVarA = this.a.a();
        zzeavVarA.b("action", str);
        zzeavVarA.b("pat", Long.toString(j));
        zzeavVarA.b("pid", str2);
        zzeavVarA.b("ad_unit_id", str3);
        zzeavVarA.b("max_ads", Integer.toString(i));
        zzeavVarA.b("cache_size", Integer.toString(i2));
        zzeavVarA.b("tpcnt", Integer.toString(i4));
        zzeavVarA.b("mpl", Integer.toString(i5));
        if (adFormat != null) {
            zzeavVarA.b("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i3 > 0) {
            zzeavVarA.b("nptr", Integer.toString(i3));
        }
        zzeavVarA.c();
    }

    public zzfuy(zzeaw zzeawVar) {
        this.a = zzeawVar;
    }
}
