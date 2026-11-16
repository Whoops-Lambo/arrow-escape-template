package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.o24;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzegr implements zzipf {
    public final zzipo a;
    public final zzehq b;
    public final zzeju c;

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzegq zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.zzb();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        o24 o24Var2 = zzcgv.b;
        zzipn.a(o24Var2);
        Context contextA = ((zzcox) this.b.a).a();
        zzipn.a(o24Var);
        return new zzegq(scheduledExecutorService, o24Var, o24Var2, new zzehp(contextA, o24Var), zzipe.b(this.c));
    }

    public zzegr(zzipe zzipeVar, zzehq zzehqVar, zzeju zzejuVar) {
        this.a = zzipeVar;
        this.b = zzehqVar;
        this.c = zzejuVar;
    }
}
