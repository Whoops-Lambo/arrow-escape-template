package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzevs implements zzfdv {
    public final Clock a;
    public final zzfmj b;
    public final long c;

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final int zzb() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzfdv
    public final ListenableFuture zza() {
        return zzheh.a(new zzevt(this.b, this.a.currentTimeMillis(), this.c));
    }

    public zzevs(Clock clock, zzfmj zzfmjVar, long j) {
        this.a = clock;
        this.b = zzfmjVar;
        this.c = j;
    }
}
