package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@VisibleForTesting
public final class zzxn extends zzbf {
    public final zzak b;

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd d(int i, zzbd zzbdVar, boolean z) {
        Integer num = z ? 0 : null;
        Object obj = z ? f0.e : null;
        zzc zzcVar = zzc.b;
        zzbdVar.a(num, obj, 0, -9223372036854775807L, true);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe b(int i, zzbe zzbeVar, long j) {
        Object obj = zzbe.m;
        zzbeVar.a(this.b, false, true, null, -9223372036854775807L);
        zzbeVar.i = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int e(Object obj) {
        return obj == f0.e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object f(int i) {
        return f0.e;
    }

    public zzxn(zzak zzakVar) {
        this.b = zzakVar;
    }
}
