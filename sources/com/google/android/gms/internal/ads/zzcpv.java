package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.l71;
import defpackage.o24;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcpv implements zzipf {
    public final zzcox a;
    public final zzipe b;

    @Override // com.google.android.gms.internal.ads.zzipu
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzccd zzb() {
        Context contextA = this.a.a();
        zzfrw zzfrwVar = (zzfrw) this.b.zzb();
        o24 o24Var = zzcgv.a;
        zzipn.a(o24Var);
        com.google.android.gms.ads.internal.zzt.zzr().a(contextA, VersionInfoParcel.forPackage(), zzfrwVar).getClass();
        zzbvm zzbvmVarA = com.google.android.gms.ads.internal.zzt.zzr().a(contextA, VersionInfoParcel.forPackage(), zzfrwVar);
        l71 l71Var = zzbvj.a;
        return new zzccd(contextA, zzbvmVarA.a("google.afma.sdkConstants.getSdkConstants", l71Var, l71Var), VersionInfoParcel.forPackage(), o24Var);
    }

    public zzcpv(zzcox zzcoxVar, zzipe zzipeVar) {
        this.a = zzcoxVar;
        this.b = zzipeVar;
    }
}
