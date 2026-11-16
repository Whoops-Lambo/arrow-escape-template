package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfcr implements zzipf {
    public final zzipo a;
    public final zzddt b;
    public final zzipo c;

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfcp zzb() {
        Context contextA = ((zzcox) this.a).a();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzfcp(contextA, o24Var, this.b.a(), ((zzcpn) this.c).a());
    }

    public zzfcr(zzddt zzddtVar, zzipo zzipoVar, zzipo zzipoVar2) {
        this.a = zzipoVar;
        this.b = zzddtVar;
        this.c = zzipoVar2;
    }
}
