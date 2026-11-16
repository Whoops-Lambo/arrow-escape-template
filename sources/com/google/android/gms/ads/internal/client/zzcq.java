package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcq extends zzbff implements zzcs {
    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzb() throws RemoteException {
        zzdc(2, zzda());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzc() throws RemoteException {
        zzdc(3, zzda());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzd() throws RemoteException {
        zzdc(4, zzda());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() throws RemoteException {
        zzdc(5, zzda());
    }

    public zzcq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zza(zze zzeVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzeVar);
        zzdc(1, parcelZzda);
    }
}
