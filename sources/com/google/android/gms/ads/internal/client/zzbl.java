package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbl extends zzbff implements zzbn {
    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzh() throws RemoteException {
        throw null;
    }

    public zzbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zze(zzm zzmVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzmVar);
        zzdc(1, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzi(zzm zzmVar, int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzmVar);
        parcelZzda.writeInt(i);
        zzdc(5, parcelZzda);
    }
}
