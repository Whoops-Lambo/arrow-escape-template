package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcad extends zzbff implements zzcaf {
    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzh() throws RemoteException {
        zzdc(2, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzi() throws RemoteException {
        zzdc(3, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzj() throws RemoteException {
        zzdc(4, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzk() throws RemoteException {
        zzdc(5, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzo() throws RemoteException {
        zzdc(7, zzda());
    }

    public zzcad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzd() throws RemoteException {
        zzdc(10, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zze() throws RemoteException {
        zzdc(14, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(11, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzp() throws RemoteException {
        zzdc(8, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzr() throws RemoteException {
        zzdc(9, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzG(int i, String[] strArr, int[] iArr) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        parcelZzda.writeStringArray(strArr);
        parcelZzda.writeIntArray(iArr);
        zzdc(15, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzg(Bundle bundle) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, bundle);
        zzdc(1, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzl(int i, int i2, Intent intent) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        parcelZzda.writeInt(i2);
        zzbfh.c(parcelZzda, intent);
        zzdc(12, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(13, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzn(Bundle bundle) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, bundle);
        Parcel parcelZzdb = zzdb(6, parcelZzda);
        if (parcelZzdb.readInt() != 0) {
            bundle.readFromParcel(parcelZzdb);
        }
        parcelZzdb.recycle();
    }
}
