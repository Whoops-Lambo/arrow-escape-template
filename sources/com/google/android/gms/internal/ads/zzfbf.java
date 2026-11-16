package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfbf implements zzipf {
    public final zzcwo a;
    public final zzipe b;
    public final zzipr c;

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfbd zzb() {
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzfbd(o24Var, this.a.a.a, (Context) this.b.zzb(), this.c.zzb());
    }

    public zzfbf(zzcwo zzcwoVar, zzipe zzipeVar, zzipr zziprVar) {
        this.a = zzcwoVar;
        this.b = zzipeVar;
        this.c = zziprVar;
    }
}
