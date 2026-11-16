package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbhl extends zzbff implements zzbhn {
    @Override // com.google.android.gms.internal.ads.zzbhn
    public final void M(zzbhk zzbhkVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzbhkVar);
        zzdc(1, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbhn
    public final void zzb(int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        zzdc(2, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbhn
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzeVar);
        zzdc(3, parcelZzda);
    }
}
