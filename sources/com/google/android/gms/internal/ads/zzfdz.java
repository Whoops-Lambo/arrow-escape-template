package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfdz implements zzipf {
    public final zzipo a;
    public final zzipr b;
    public final zzipe c;

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfdy zzb() {
        Context contextA = ((zzcox) this.a).a();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzfdy(contextA, o24Var, this.b.zzb(), (zzfrt) this.c.zzb());
    }

    public zzfdz(zzipo zzipoVar, zzipr zziprVar, zzipe zzipeVar) {
        this.a = zzipoVar;
        this.b = zziprVar;
        this.c = zzipeVar;
    }
}
