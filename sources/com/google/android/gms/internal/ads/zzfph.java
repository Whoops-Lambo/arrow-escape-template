package com.google.android.gms.internal.ads;

import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfph implements zzipf {
    public static o24 a() {
        o24 o24Var;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.X6)).booleanValue()) {
            o24Var = zzcgv.c;
        } else {
            o24Var = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.W6)).booleanValue() ? zzcgv.a : zzcgv.f;
        }
        zzipn.a(o24Var);
        return o24Var;
    }

    @Override // com.google.android.gms.internal.ads.zzipu
    public final /* synthetic */ Object zzb() {
        return a();
    }
}
