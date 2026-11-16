package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcdk extends zzbff implements zzcdm {
    public zzcdk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final Bundle zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(9, zzda());
        Bundle bundle = (Bundle) zzbfh.b(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final zzcdj zzk() throws RemoteException {
        zzcdj zzcdhVar;
        Parcel parcelZzdb = zzdb(11, zzda());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzcdhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcdhVar = iInterfaceQueryLocalInterface instanceof zzcdj ? (zzcdj) iInterfaceQueryLocalInterface : new zzcdh(strongBinder);
        }
        parcelZzdb.recycle();
        return zzcdhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final com.google.android.gms.ads.internal.client.zzdx zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(12, zzda());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZza = com.google.android.gms.ads.internal.client.zzdw.zza(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzdxVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final String zzm() throws RemoteException {
        Parcel parcelZzdb = zzdb(16, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final long zzp() throws RemoteException {
        Parcel parcelZzdb = zzdb(17, zzda());
        long j = parcelZzdb.readLong();
        parcelZzdb.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zza(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(5, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdt zzcdtVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzmVar);
        zzbfh.e(parcelZzda, zzcdtVar);
        zzdc(1, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcdt zzcdtVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzmVar);
        zzbfh.e(parcelZzda, zzcdtVar);
        zzdc(14, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzd(zzcdp zzcdpVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzcdpVar);
        zzdc(2, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zze(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzdnVar);
        zzdc(8, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzg(zzcea zzceaVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzceaVar);
        zzdc(7, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzn(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzdqVar);
        zzdc(13, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzo(boolean z) throws RemoteException {
        Parcel parcelZzda = zzda();
        ClassLoader classLoader = zzbfh.a;
        parcelZzda.writeInt(z ? 1 : 0);
        zzdc(15, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcdm
    public final void zzq(long j) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeLong(j);
        zzdc(18, parcelZzda);
    }
}
