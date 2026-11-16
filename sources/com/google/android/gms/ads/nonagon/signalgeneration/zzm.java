package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzcox;
import com.google.android.gms.internal.ads.zzebb;
import com.google.android.gms.internal.ads.zzipf;
import com.google.android.gms.internal.ads.zzipn;
import com.google.android.gms.internal.ads.zzipo;
import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzm implements zzipf {
    private final zzipo zza;
    private final zzipo zzb;

    public static zzm zza(zzipo zzipoVar, zzipo zzipoVar2, zzipo zzipoVar3) {
        return new zzm(zzipoVar, zzipoVar2, zzipoVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        Context contextA = ((zzcox) this.zza).a();
        zzebb zzebbVar = (zzebb) this.zzb.zzb();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        return new zzj(contextA, zzebbVar, o24Var);
    }

    private zzm(zzipo zzipoVar, zzipo zzipoVar2, zzipo zzipoVar3) {
        this.zza = zzipoVar;
        this.zzb = zzipoVar2;
    }
}
