package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgny implements zzipf {
    public final zzipo a;
    public final zzipo b;
    public final zzipo c;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgnv((Context) this.a.zzb(), (ExecutorService) this.b.zzb(), (zzgic) this.c.zzb());
    }

    public zzgny(zzipe zzipeVar, zzipg zzipgVar, zzipg zzipgVar2) {
        this.a = zzipgVar;
        this.b = zzipgVar2;
        this.c = zzipeVar;
    }
}
