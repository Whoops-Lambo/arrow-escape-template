package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzghj implements zzipf {
    public final zzipe a;
    public final zzipe b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.a.zzb();
        return new zzghi(executor);
    }

    public zzghj(zzipe zzipeVar, zzipe zzipeVar2) {
        this.a = zzipeVar;
        this.b = zzipeVar2;
    }
}
