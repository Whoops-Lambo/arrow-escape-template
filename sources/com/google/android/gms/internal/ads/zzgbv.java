package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzgbv extends zzbff implements zzgbx {
    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zze() throws RemoteException {
        zzdc(3, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void L2() throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeIntArray(null);
        zzdc(4, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void i2(ObjectWrapper objectWrapper, String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, objectWrapper);
        parcelZzda.writeString(str);
        parcelZzda.writeString(null);
        zzdc(8, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void m2(byte[] bArr) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeByteArray(bArr);
        zzdc(5, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzh(int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        zzdc(6, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzgbx
    public final void zzi(int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        zzdc(7, parcelZzda);
    }
}
