package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbxo extends zzbff implements zzbxq {
    @Override // com.google.android.gms.internal.ads.zzbxq
    public final void zze() throws RemoteException {
        zzdc(2, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final void a(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzeVar);
        zzdc(4, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString("Adapter returned null.");
        zzdc(3, parcelZzda);
    }
}
