package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdyk {
    public final HashMap a = new HashMap();

    public final synchronized void a(String str, zzfnh zzfnhVar) {
        zzbyu zzbyuVarZzH;
        if (this.a.containsKey(str)) {
            return;
        }
        zzbyu zzbyuVarW = null;
        if (zzfnhVar == null) {
            zzbyuVarZzH = null;
        } else {
            try {
                zzbyuVarZzH = zzfnhVar.a.zzH();
            } catch (Throwable th) {
                try {
                    throw new zzfmq(th);
                } catch (zzfmq unused) {
                }
            }
        }
        if (zzfnhVar != null) {
            try {
                zzbyuVarW = zzfnhVar.a.w();
            } catch (Throwable th2) {
                try {
                    throw new zzfmq(th2);
                } catch (zzfmq unused2) {
                }
            }
        }
        boolean z = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Za)).booleanValue()) {
            if (zzfnhVar == null) {
                z = false;
            } else {
                try {
                    zzfnhVar.a();
                } catch (zzfmq unused3) {
                    z = false;
                }
            }
        }
        this.a.put(str, new zzdyj(str, zzbyuVarZzH, zzbyuVarW, z));
    }

    public final synchronized zzdyj b(String str) {
        return (zzdyj) this.a.get(str);
    }
}
