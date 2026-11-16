package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcuq implements zzdec {
    public final zzflq a;
    public final zzcgm b;

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void A(zzccq zzccqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void L() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void N() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdec
    public final void O() {
        if (this.a.r0) {
            zzcgm zzcgmVar = this.b;
            synchronized (zzcgmVar.a) {
                zzcgj zzcgjVar = zzcgmVar.d;
                synchronized (zzcgjVar.f) {
                    zzcgjVar.l++;
                }
            }
        }
    }

    public zzcuq(zzflq zzflqVar, zzcgm zzcgmVar) {
        this.a = zzflqVar;
        this.b = zzcgmVar;
    }
}
