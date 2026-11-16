package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdcf implements zzdhi, zzdmv {
    public final Context a;
    public final zzfmj b;
    public final VersionInfoParcel c;
    public final com.google.android.gms.ads.internal.util.zzg d;
    public final zzedh e;
    public final zzfrw f;
    public final zzeec g;

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void z(zzfmb zzfmbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmv
    public final void zze(String str) {
    }

    public final void a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.i5)).booleanValue()) {
            String str = this.b.g;
            zzcgc zzcgcVarZzi = this.d.zzi();
            com.google.android.gms.ads.internal.zzt.zzl().zzb(this.a, this.c, str, zzcgcVarZzi, this.f, this.g.f());
        }
        this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.zzdmv
    public final void zzd(zzbc zzbcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.j5)).booleanValue()) {
            a();
        }
    }

    public zzdcf(Context context, zzfmj zzfmjVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzj zzjVar, zzedh zzedhVar, zzfrw zzfrwVar, zzeec zzeecVar) {
        this.a = context;
        this.b = zzfmjVar;
        this.c = versionInfoParcel;
        this.d = zzjVar;
        this.e = zzedhVar;
        this.f = zzfrwVar;
        this.g = zzeecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void R(zzcch zzcchVar) {
        a();
    }
}
