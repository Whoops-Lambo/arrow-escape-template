package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;
import defpackage.ku4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzefq implements zzdhi, zzdmv, zzdfq, zzdew {
    public final Context a;
    public final zzeaw b;

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void z(zzfmb zzfmbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdmv
    public final void zze(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void Q() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.U5)).booleanValue()) {
            a(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void R(zzcch zzcchVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.R5)).booleanValue()) {
            a(this.a);
        }
    }

    public final void a(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.P5)).booleanValue()) {
            zzcgv.a.execute(new ku4(20, this, context));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmv
    public final void zzd(zzbc zzbcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.S5)).booleanValue()) {
            a(this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.T5)).booleanValue()) {
            a(this.a);
        }
    }

    public zzefq(Context context, zzeaw zzeawVar) {
        this.a = context;
        this.b = zzeawVar;
    }
}
