package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzday implements com.google.android.gms.ads.internal.client.zza {
    public final zzdbc a;
    public final zzfmj b;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzfmj zzfmjVar = this.b;
        zzdbc zzdbcVar = this.a;
        String str = zzfmjVar.g;
        synchronized (zzdbcVar.a) {
            try {
                ConcurrentHashMap concurrentHashMap = zzdbcVar.b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzday(zzdbc zzdbcVar, zzfmj zzfmjVar) {
        this.a = zzdbcVar;
        this.b = zzfmjVar;
    }
}
