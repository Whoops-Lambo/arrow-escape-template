package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgib implements zzipf {
    public final zzipr a;
    public final zzipr b;
    public final zzipg c;
    public final zzipe d;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        return new zzgia(zzipe.b(this.a), zzipe.b(this.b), (ExecutorService) this.c.a, zzipe.b(this.d));
    }

    public zzgib(zzipr zziprVar, zzipr zziprVar2, zzipg zzipgVar, zzipe zzipeVar) {
        this.a = zziprVar;
        this.b = zziprVar2;
        this.c = zzipgVar;
        this.d = zzipeVar;
    }
}
