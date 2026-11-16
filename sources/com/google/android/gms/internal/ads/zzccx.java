package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzccx extends zzbff implements zzccz {
    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zze() throws RemoteException {
        zzdc(1, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzf() throws RemoteException {
        zzdc(2, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzg() throws RemoteException {
        zzdc(3, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzh() throws RemoteException {
        zzdc(4, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzj() throws RemoteException {
        zzdc(6, zzda());
    }

    public zzccx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void zzl() throws RemoteException {
        zzdc(8, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void b(int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        zzdc(7, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzccz
    public final void x1(zzccq zzccqVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzccqVar);
        zzdc(5, parcelZzda);
    }
}
