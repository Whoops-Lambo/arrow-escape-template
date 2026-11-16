package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import defpackage.uy3;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbji {
    public final int a;
    public final String b;
    public final Object c;
    public final Object d;

    public abstract Object a(Bundle bundle);

    public abstract void b(SharedPreferences.Editor editor, Object obj);

    public abstract Object c(JSONObject jSONObject);

    public abstract Object d(SharedPreferences sharedPreferences);

    public static uy3 g(int i, int i2, String str) {
        return new uy3(1, 1, Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    public static uy3 h(long j, long j2, String str) {
        return new uy3(1, 2, Long.valueOf(j), Long.valueOf(j2), str);
    }

    public static uy3 i(String str, float f, float f2) {
        return new uy3(1, 3, Float.valueOf(f), Float.valueOf(f2), str);
    }

    public static void j() {
        com.google.android.gms.ads.internal.client.zzba.zzb().b.add(new uy3(1, 4, null, null, "gads:sdk_core_constants:experiment_id"));
    }

    public static void k() {
        com.google.android.gms.ads.internal.client.zzba.zzb().c.add(new uy3(1, 4, null, null, "gads:sdk_core_constants_service:experiment_id"));
    }

    public zzbji(Object obj, String str, int i, Object obj2) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        com.google.android.gms.ads.internal.client.zzba.zzb().a.add(this);
    }

    public final Object e() {
        if (com.google.android.gms.ads.internal.client.zzba.zzc().i) {
            return this.d;
        }
        return this.c;
    }

    public final Object f() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().a(this);
    }
}
