package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcbs extends zzbff implements zzcbu {
    @Override // com.google.android.gms.internal.ads.zzcbu
    public final void H3(String str, zzcby zzcbyVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        zzbfh.e(parcelZzda, zzcbyVar);
        zzdc(7, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcbu
    public final void Z(zzcch zzcchVar, zzcby zzcbyVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzcchVar);
        zzbfh.e(parcelZzda, zzcbyVar);
        zzdc(4, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcbu
    public final void s0(zzcch zzcchVar, zzcby zzcbyVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzcchVar);
        zzbfh.e(parcelZzda, zzcbyVar);
        zzdc(6, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcbu
    public final void y0(zzcch zzcchVar, zzcby zzcbyVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzcchVar);
        zzbfh.e(parcelZzda, zzcbyVar);
        zzdc(5, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcbu
    public final void zzi(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        zzdc(9, parcelZzda);
    }
}
