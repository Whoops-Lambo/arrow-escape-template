package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcbw extends zzbff implements zzcby {
    public zzcbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void P0(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzbaVar);
        zzdc(2, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void g3(ParcelFileDescriptor parcelFileDescriptor, zzcch zzcchVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, parcelFileDescriptor);
        zzbfh.c(parcelZzda, zzcchVar);
        zzdc(3, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcby
    public final void h1(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, parcelFileDescriptor);
        zzdc(1, parcelZzda);
    }
}
