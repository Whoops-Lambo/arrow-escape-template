package com.google.android.gms.internal.ads;

import defpackage.uy3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzciq {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final long n;

    public static final int b(JSONObject jSONObject, String str, zzbji zzbjiVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjiVar)).intValue();
    }

    public zzciq(String str) {
        long jLongValue;
        long jLongValue2;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.a = a(jSONObject, "aggressive_media_codec_release", zzbjr.C0);
        this.b = b(jSONObject, "byte_buffer_precache_limit", zzbjr.n);
        this.c = b(jSONObject, "exo_cache_buffer_size", zzbjr.A);
        this.d = b(jSONObject, "exo_connect_timeout_millis", zzbjr.j);
        uy3 uy3Var = zzbjr.i;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.e = b(jSONObject, "exo_read_timeout_millis", zzbjr.k);
        this.f = b(jSONObject, "load_check_interval_bytes", zzbjr.l);
        this.g = b(jSONObject, "player_precache_limit", zzbjr.m);
        this.h = b(jSONObject, "socket_receive_buffer_size", zzbjr.o);
        this.i = a(jSONObject, "use_cache_data_source", zzbjr.y5);
        b(jSONObject, "min_retry_count", zzbjr.p);
        this.j = a(jSONObject, "treat_load_exception_as_non_fatal", zzbjr.r);
        this.k = a(jSONObject, "enable_multiple_video_playback", zzbjr.K2);
        this.l = a(jSONObject, "use_range_http_data_source", zzbjr.M2);
        uy3 uy3Var2 = zzbjr.N2;
        if (jSONObject != null) {
            try {
                jLongValue = jSONObject.getLong("range_http_data_source_high_water_mark");
            } catch (JSONException unused3) {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var2)).longValue();
            }
        } else {
            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var2)).longValue();
        }
        this.m = jLongValue;
        uy3 uy3Var3 = zzbjr.O2;
        if (jSONObject != null) {
            try {
                jLongValue2 = jSONObject.getLong("range_http_data_source_low_water_mark");
            } catch (JSONException unused4) {
                jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var3)).longValue();
            }
        } else {
            jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var3)).longValue();
        }
        this.n = jLongValue2;
    }

    public static final boolean a(JSONObject jSONObject, String str, zzbji zzbjiVar) {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjiVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }
}
