package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcfo extends zzbff implements zzcfq {
    public zzcfo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zze(IObjectWrapper iObjectWrapper, zzcfu zzcfuVar, zzcfn zzcfnVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzbfh.c(parcelZzda, zzcfuVar);
        zzbfh.e(parcelZzda, zzcfnVar);
        zzdc(1, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(8, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcfq
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzbfh.e(parcelZzda, iObjectWrapper2);
        parcelZzda.writeString(str);
        zzbfh.e(parcelZzda, iObjectWrapper3);
        return rl3.h(zzdb(11, parcelZzda));
    }
}
