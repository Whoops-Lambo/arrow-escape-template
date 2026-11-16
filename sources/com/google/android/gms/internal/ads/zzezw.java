package com.google.android.gms.internal.ads;

import defpackage.o24;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzezw implements zzipf {
    public final zzipo a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzfch(new zzfar(o24Var), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ee)).intValue(), (ScheduledExecutorService) this.a.zzb());
    }

    public zzezw(zzipe zzipeVar) {
        this.a = zzipeVar;
    }
}
