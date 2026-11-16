package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbfl extends zzbff implements zzbfn {
    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzf() throws RemoteException {
        zzdc(3, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void T1() throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeIntArray(null);
        zzdc(4, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void c(int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        zzdc(7, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void j(ObjectWrapper objectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, objectWrapper);
        parcelZzda.writeString("GMA_SDK");
        zzdc(2, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void y2(byte[] bArr) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeByteArray(bArr);
        zzdc(5, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbfn
    public final void zzi(int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(0);
        zzdc(6, parcelZzda);
    }
}
