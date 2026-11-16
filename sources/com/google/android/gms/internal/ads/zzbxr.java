package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbxr extends zzbff implements zzbxt {
    public zzbxr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void a(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzeVar);
        zzdc(3, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void l(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(1, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbxt
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString("Adapter returned null.");
        zzdc(2, parcelZzda);
    }
}
