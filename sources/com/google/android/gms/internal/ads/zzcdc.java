package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcdc extends zzbff implements zzcde {
    @Override // com.google.android.gms.internal.ads.zzcde
    public final void J3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(8, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void L1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(11, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void T0(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        parcelZzda.writeInt(i);
        zzdc(9, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void X2(IObjectWrapper iObjectWrapper, zzcdf zzcdfVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzbfh.c(parcelZzda, zzcdfVar);
        zzdc(7, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void j2(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(13, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void k3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(3, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void l(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(1, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void m(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(4, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void u3(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(5, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(6, parcelZzda);
    }
}
