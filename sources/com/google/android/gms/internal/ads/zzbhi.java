package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbhi extends zzbff implements zzbhk {
    @Override // com.google.android.gms.internal.ads.zzbhk
    public final com.google.android.gms.ads.internal.client.zzdx zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zzda());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZza = com.google.android.gms.ads.internal.client.zzdw.zza(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzdxVarZza;
    }

    public zzbhi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final String zzj() throws RemoteException {
        Parcel parcelZzdb = zzdb(8, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final long zzk() throws RemoteException {
        Parcel parcelZzdb = zzdb(9, zzda());
        long j = parcelZzdb.readLong();
        parcelZzdb.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void q2(IObjectWrapper iObjectWrapper, zzbhr zzbhrVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzbfh.e(parcelZzda, zzbhrVar);
        zzdc(4, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void r0(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzdqVar);
        zzdc(7, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void zzh(boolean z) throws RemoteException {
        Parcel parcelZzda = zzda();
        ClassLoader classLoader = zzbfh.a;
        parcelZzda.writeInt(z ? 1 : 0);
        zzdc(6, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbhk
    public final void zzl(long j) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeLong(j);
        zzdc(10, parcelZzda);
    }
}
