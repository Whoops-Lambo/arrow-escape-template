package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzetk extends zzbyh {
    public static final /* synthetic */ int f = 0;
    public final zzbyf a;
    public final zzcha b;
    public final JSONObject c;
    public final long d;
    public boolean e;

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final synchronized void a(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzd(2, zzeVar.zzb);
    }

    public final synchronized void zzd(int i, String str) {
        try {
            if (this.e) {
                return;
            }
            try {
                JSONObject jSONObject = this.c;
                jSONObject.put("signal_error", str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.u2)).booleanValue()) {
                    jSONObject.put("latency", com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.d);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.t2)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.b.zzc(this.c);
            this.e = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyi
    public final synchronized void zze(String str) {
        if (this.e) {
            return;
        }
        if (str == null) {
            synchronized (this) {
                zzd(2, "Adapter returned null signals");
            }
            return;
        }
        try {
            JSONObject jSONObject = this.c;
            jSONObject.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.u2)).booleanValue()) {
                jSONObject.put("latency", com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.d);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.t2)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.b.zzc(this.c);
        this.e = true;
    }

    public zzetk(String str, zzbyf zzbyfVar, zzcha zzchaVar, long j) {
        JSONObject jSONObject = new JSONObject();
        this.c = jSONObject;
        this.e = false;
        this.b = zzchaVar;
        this.a = zzbyfVar;
        this.d = j;
        try {
            jSONObject.put("adapter_version", zzbyfVar.zzf().toString());
            jSONObject.put("sdk_version", zzbyfVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }
}
