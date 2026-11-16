package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdba implements zzdjx, zzdfq {
    public final Clock a;
    public final zzdbc b;
    public final zzfmj c;
    public final String d;

    @Override // com.google.android.gms.internal.ads.zzdjx
    public final void zza() {
        this.b.c.put(this.d, Long.valueOf(this.a.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzg() {
        long jElapsedRealtime = this.a.elapsedRealtime();
        String str = this.c.g;
        zzdbc zzdbcVar = this.b;
        ConcurrentHashMap concurrentHashMap = zzdbcVar.c;
        String str2 = this.d;
        Long l = (Long) concurrentHashMap.get(str2);
        if (l == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        zzdbcVar.d.put(str, Long.valueOf(jElapsedRealtime - l.longValue()));
    }

    public zzdba(Clock clock, zzdbc zzdbcVar, zzfmj zzfmjVar, String str) {
        this.a = clock;
        this.b = zzdbcVar;
        this.c = zzfmjVar;
        this.d = str;
    }
}
