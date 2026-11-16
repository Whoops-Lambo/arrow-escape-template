package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.vt4;
import defpackage.wm4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdwg implements Callable {
    public final com.google.android.gms.ads.internal.zza a;
    public final Context b;
    public final zzeaw c;
    public final zzelr d;
    public final Executor e;
    public final zzbbo f;
    public final VersionInfoParcel g;
    public final zzftx h;
    public final zzemc i;
    public final zzfmn j;
    public final zzdct k;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzdwi zzdwiVar = new zzdwi(this);
        synchronized (zzdwiVar) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.T4);
            zzbbo zzbboVar = zzdwiVar.f;
            com.google.android.gms.ads.internal.zza zzaVar = zzdwiVar.b;
            zzemc zzemcVar = zzdwiVar.k;
            vt4 vt4VarI = zzheh.i(zzheh.d(new com.moloco.sdk.internal.services.bidtoken.s(zzdwiVar.c, zzbboVar, zzdwiVar.g, zzaVar, zzemcVar, zzdwiVar.l, zzdwiVar.d, str), zzcgv.f), new wm4(zzdwiVar, 2), zzdwiVar.e);
            zzdwiVar.n = vt4VarI;
            zzcgy.a(vt4VarI, "NativeJavascriptExecutor.initializeEngine", zzcgv.h);
        }
        return zzdwiVar;
    }

    public zzdwg(Context context, Executor executor, zzbbo zzbboVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzelr zzelrVar, zzftx zzftxVar, zzeaw zzeawVar, zzemc zzemcVar, zzfmn zzfmnVar, zzdct zzdctVar) {
        this.b = context;
        this.e = executor;
        this.f = zzbboVar;
        this.g = versionInfoParcel;
        this.a = zzaVar;
        this.d = zzelrVar;
        this.h = zzftxVar;
        this.c = zzeawVar;
        this.i = zzemcVar;
        this.j = zzfmnVar;
        this.k = zzdctVar;
    }
}
