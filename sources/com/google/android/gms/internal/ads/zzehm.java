package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzehm extends zzcbx {
    public final zzcha a;
    public final zzcch b;

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void P0(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.a.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void g3(ParcelFileDescriptor parcelFileDescriptor, zzcch zzcchVar) {
        this.a.zzc(new zzeid(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcchVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void h1(ParcelFileDescriptor parcelFileDescriptor) {
        this.a.zzc(new zzeid(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.b));
    }

    public zzehm(zzcha zzchaVar, zzcch zzcchVar) {
        this.a = zzchaVar;
        this.b = zzcchVar;
    }
}
