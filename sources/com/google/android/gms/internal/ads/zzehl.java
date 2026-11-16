package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzehl extends zzcbx {
    public final /* synthetic */ zzehn a;

    public zzehl(zzehn zzehnVar) {
        this.a = zzehnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void P0(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.a.a.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void g3(ParcelFileDescriptor parcelFileDescriptor, zzcch zzcchVar) {
        this.a.a.zzc(new zzeid(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcchVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void h1(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzehn zzehnVar = this.a;
        zzehnVar.a.zzc(new zzeid(autoCloseInputStream, zzehnVar.e));
    }
}
