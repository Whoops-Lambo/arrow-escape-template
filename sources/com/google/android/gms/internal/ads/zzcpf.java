package com.google.android.gms.internal.ads;

import defpackage.o24;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcpf implements zzipf {
    public final zzipe a;

    @Override // com.google.android.gms.internal.ads.zzipu
    public final Object zzb() {
        zzedj zzedjVar = (zzedj) this.a.zzb();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.w2)).booleanValue() ? Collections.singleton(new zzdmb(zzedjVar, o24Var)) : Collections.EMPTY_SET;
        zzipn.a(setSingleton);
        return setSingleton;
    }

    public zzcpf(zzipe zzipeVar) {
        this.a = zzipeVar;
    }
}
