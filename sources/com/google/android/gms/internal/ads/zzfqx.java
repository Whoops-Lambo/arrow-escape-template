package com.google.android.gms.internal.ads;

import defpackage.ei4;
import defpackage.o24;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfqx implements zzipf {
    public final zzipo a;
    public final zzfqy b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzfqv(o24Var, (ScheduledExecutorService) this.a.zzb(), new ei4(this.b.a.zzb()));
    }

    public zzfqx(zzipe zzipeVar, zzfqy zzfqyVar) {
        this.a = zzipeVar;
        this.b = zzfqyVar;
    }
}
