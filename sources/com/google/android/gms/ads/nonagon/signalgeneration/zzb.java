package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcox;
import com.google.android.gms.internal.ads.zzcpn;
import com.google.android.gms.internal.ads.zzipf;
import com.google.android.gms.internal.ads.zzipo;
import defpackage.uy3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzb implements zzipf {
    private final zzipo zza;
    private final zzipo zzb;

    public static zzb zza(zzipo zzipoVar, zzipo zzipoVar2, zzipo zzipoVar3, zzipo zzipoVar4) {
        return new zzb(zzipoVar, zzipoVar2, zzipoVar3, zzipoVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        Context contextA = ((zzcox) this.zza).a();
        zzbjb zzbjbVar = new zzbjb();
        uy3 uy3Var = zzbjr.a;
        return new zza(contextA, zzbjbVar, com.google.android.gms.ads.internal.client.zzba.zzb().a(), ((zzcpn) this.zzb).a());
    }

    private zzb(zzipo zzipoVar, zzipo zzipoVar2, zzipo zzipoVar3, zzipo zzipoVar4) {
        this.zza = zzipoVar;
        this.zzb = zzipoVar4;
    }
}
