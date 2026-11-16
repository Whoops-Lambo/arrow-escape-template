package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeze implements zzipf {
    public final zzipe a;
    public final zzipe b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        zzfbo zzfboVar = new zzfbo(o24Var);
        Clock clock = (Clock) this.a.zzb();
        zzipn.a(o24Var);
        return new zzeyj(zzfboVar, ((Long) zzblh.f.c()).longValue(), clock, o24Var, (zzeaw) this.b.zzb());
    }

    public zzeze(zzipe zzipeVar, zzipe zzipeVar2) {
        this.a = zzipeVar;
        this.b = zzipeVar2;
    }
}
