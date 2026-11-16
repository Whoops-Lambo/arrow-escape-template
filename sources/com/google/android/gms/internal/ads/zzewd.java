package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.o24;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzewd implements zzipf {
    public final zzipe a;
    public final zzipo b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        ListenableFuture listenableFuture = (ListenableFuture) this.a.zzb();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzewb(listenableFuture, o24Var, (ScheduledExecutorService) this.b.zzb());
    }

    public zzewd(zzipe zzipeVar, zzipo zzipoVar) {
        this.a = zzipeVar;
        this.b = zzipoVar;
    }
}
