package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeyx implements zzipf {
    public final zzexr a;
    public final zzipe b;
    public final zzipe c;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        zzexp zzexpVarZzb = this.a.zzb();
        Clock clock = (Clock) this.b.zzb();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzeyj(zzexpVarZzb, 2147483647L, clock, o24Var, (zzeaw) this.c.zzb());
    }

    public zzeyx(zzexr zzexrVar, zzipe zzipeVar, zzipe zzipeVar2) {
        this.a = zzexrVar;
        this.b = zzipeVar;
        this.c = zzipeVar2;
    }
}
