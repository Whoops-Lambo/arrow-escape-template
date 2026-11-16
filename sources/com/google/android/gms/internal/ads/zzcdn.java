package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcdn extends zzbff implements zzcdp {
    @Override // com.google.android.gms.internal.ads.zzcdp
    public final void zze() throws RemoteException {
        zzdc(1, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzcdp
    public final void zzf() throws RemoteException {
        zzdc(2, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzcdp
    public final void zzj() throws RemoteException {
        zzdc(6, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzcdp
    public final void zzk() throws RemoteException {
        zzdc(7, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzcdp
    public final void F2(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzeVar);
        zzdc(5, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcdp
    public final void f3(zzcdj zzcdjVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzcdjVar);
        zzdc(3, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcdp
    public final void zzh(int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        zzdc(4, parcelZzda);
    }
}
