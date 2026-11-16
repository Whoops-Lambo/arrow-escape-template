package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfap implements zzipf {
    public final zzipo a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        Context contextA = ((zzcox) this.a).a();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzfao(contextA, o24Var);
    }

    public zzfap(zzcox zzcoxVar) {
        this.a = zzcoxVar;
    }
}
