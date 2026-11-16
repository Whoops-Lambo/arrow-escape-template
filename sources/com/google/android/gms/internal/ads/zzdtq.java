package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdtq implements zzipf {
    public final zzdwt a;
    public final zzipo b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        return new zzdmb(new zzdws(this.a.a.a()), (Executor) this.b.zzb());
    }

    public zzdtq(zzdwt zzdwtVar, zzipe zzipeVar) {
        this.a = zzdwtVar;
        this.b = zzipeVar;
    }
}
