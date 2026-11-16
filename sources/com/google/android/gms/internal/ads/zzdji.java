package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzdji implements zzdhi {
    public int a = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.a2)).intValue();
    public int b = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ve)).intValue();

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void R(zzcch zzcchVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final synchronized void z(zzfmb zzfmbVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.b2)).booleanValue()) {
            try {
                zzflt zzfltVar = zzfmbVar.b.b;
                this.a = zzfltVar.c;
                this.b = zzfltVar.d;
            } catch (NullPointerException unused) {
            }
        }
    }

    @VisibleForTesting
    public zzdji() {
    }
}
