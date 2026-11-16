package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbni extends zzbff implements zzbnk {
    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzd() throws RemoteException {
        zzdc(4, zzda());
    }

    public zzbni(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(1, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final IObjectWrapper zzb(String str) {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        return rl3.h(zzdb(2, parcelZzda));
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzc(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(3, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzdC(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(6, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzdD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(9, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzdE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(7, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzdF(zzbnd zzbndVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzbndVar);
        zzdc(8, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        parcelZzda.writeInt(i);
        zzdc(5, parcelZzda);
    }
}
