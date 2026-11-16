package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbzw extends zzbff implements zzbzy {
    @Override // com.google.android.gms.internal.ads.zzbzy
    public final void zzg() throws RemoteException {
        zzdc(3, zzda());
    }

    public zzbzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbzy
    public final void C1(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzbfh.c(parcelZzda, zzaVar);
        zzdc(6, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbzy
    public final void m(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(4, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbzy
    public final void n(Intent intent) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, intent);
        zzdc(1, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbzy
    public final void w0(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeStringArray(strArr);
        parcelZzda.writeIntArray(iArr);
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(5, parcelZzda);
    }
}
