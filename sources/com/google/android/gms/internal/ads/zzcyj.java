package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcyj implements zzipf {
    public final zzcxo a;
    public final zzipo b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        return new zzcyi(this.a.a.d, (Executor) this.b.zzb());
    }

    public zzcyj(zzcxo zzcxoVar, zzipe zzipeVar) {
        this.a = zzcxoVar;
        this.b = zzipeVar;
    }
}
