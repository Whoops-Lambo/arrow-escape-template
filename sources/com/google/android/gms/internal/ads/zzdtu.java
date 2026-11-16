package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdtu implements zzipf {
    public final zzipo a;
    public final zzipo b;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        com.google.android.gms.ads.internal.util.zzbl zzblVar = (com.google.android.gms.ads.internal.util.zzbl) this.a.zzb();
        Clock clock = (Clock) this.b.zzb();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzdtt(zzblVar, clock, o24Var);
    }

    public zzdtu(zzipo zzipoVar, zzipo zzipoVar2) {
        this.a = zzipoVar;
        this.b = zzipoVar2;
    }
}
