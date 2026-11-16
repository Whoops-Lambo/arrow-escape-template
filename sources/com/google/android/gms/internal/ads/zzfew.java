package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.o24;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfew implements zzipf {
    public final zzipo a;
    public final zzipo b;
    public final zzfgc c;
    public final zzfgd d;
    public final zzfge e;

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfeu zzb() {
        zzcfz zzcfzVar = new zzcfz();
        Context contextA = ((zzcox) this.a).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.zzb();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzfeu(zzcfzVar, contextA, scheduledExecutorService, o24Var, this.c.a.b, this.d.a.a.l, this.e.a.a.k);
    }

    public zzfew(zzcox zzcoxVar, zzipe zzipeVar, zzfgc zzfgcVar, zzfgd zzfgdVar, zzfge zzfgeVar) {
        this.a = zzcoxVar;
        this.b = zzipeVar;
        this.c = zzfgcVar;
        this.d = zzfgdVar;
        this.e = zzfgeVar;
    }
}
