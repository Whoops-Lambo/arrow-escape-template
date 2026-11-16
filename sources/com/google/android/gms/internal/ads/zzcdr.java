package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcdr extends zzbff implements zzcdt {
    @Override // com.google.android.gms.internal.ads.zzcdt
    public final void zze() throws RemoteException {
        zzdc(1, zzda());
    }

    public zzcdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcdt
    public final void a(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzeVar);
        zzdc(3, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcdt
    public final void zzf(int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        zzdc(2, parcelZzda);
    }
}
