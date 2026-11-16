package com.google.android.gms.internal.ads;

import defpackage.o24;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzder implements zzipf {
    public final zzdeq a;
    public final zzipr b;
    public final zzipo c;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        zzdel zzdelVar = new zzdel(this.a.a.zzb());
        Set setZzb = this.b.zzb();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzdep(zzdelVar, setZzb, o24Var, (ScheduledExecutorService) this.c.zzb());
    }

    public zzder(zzdeq zzdeqVar, zzipr zziprVar, zzipe zzipeVar) {
        this.a = zzdeqVar;
        this.b = zziprVar;
        this.c = zzipeVar;
    }
}
