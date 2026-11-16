package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbhp extends zzbff implements zzbhr {
    @Override // com.google.android.gms.internal.ads.zzbhr
    public final void zzb() throws RemoteException {
        zzdc(1, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbhr
    public final void zzc() throws RemoteException {
        zzdc(2, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbhr
    public final void zze() throws RemoteException {
        zzdc(4, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbhr
    public final void zzf() throws RemoteException {
        zzdc(5, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbhr
    public final void Y1(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzeVar);
        zzdc(3, parcelZzda);
    }
}
