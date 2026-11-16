package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzegr;
import com.google.android.gms.internal.ads.zzipf;
import com.google.android.gms.internal.ads.zzipn;
import com.google.android.gms.internal.ads.zzipo;
import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbb implements zzipf {
    private final zzipo zza;

    public static zzbb zzc(zzipo zzipoVar, zzipo zzipoVar2) {
        return new zzbb(zzipoVar, zzipoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzba zzb() {
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzba(o24Var, ((zzegr) this.zza).zzb());
    }

    private zzbb(zzipo zzipoVar, zzipo zzipoVar2) {
        this.zza = zzipoVar2;
    }
}
