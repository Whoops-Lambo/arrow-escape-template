package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzad extends com.google.android.gms.internal.common.zza implements zzaf {
    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzg() throws RemoteException {
        Parcel parcelZzB = zzB(7, zza());
        boolean zA = com.google.android.gms.internal.common.zzc.a(parcelZzB);
        parcelZzB.recycle();
        return zA;
    }

    public zzad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zzi() throws RemoteException {
        Parcel parcelZzB = zzB(9, zza());
        boolean zA = com.google.android.gms.internal.common.zzc.a(parcelZzB);
        parcelZzB.recycle();
        return zA;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final boolean zze(com.google.android.gms.common.zzt zztVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.c(parcelZza, zztVar);
        com.google.android.gms.internal.common.zzc.d(parcelZza, iObjectWrapper);
        Parcel parcelZzB = zzB(5, parcelZza);
        boolean zA = com.google.android.gms.internal.common.zzc.a(parcelZzB);
        parcelZzB.recycle();
        return zA;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final com.google.android.gms.common.zzr zzf(com.google.android.gms.common.zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.c(parcelZza, zzpVar);
        Parcel parcelZzB = zzB(6, parcelZza);
        com.google.android.gms.common.zzr zzrVar = (com.google.android.gms.common.zzr) com.google.android.gms.internal.common.zzc.b(parcelZzB, com.google.android.gms.common.zzr.CREATOR);
        parcelZzB.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.common.internal.zzaf
    public final com.google.android.gms.common.zzr zzh(com.google.android.gms.common.zzp zzpVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.c(parcelZza, zzpVar);
        Parcel parcelZzB = zzB(8, parcelZza);
        com.google.android.gms.common.zzr zzrVar = (com.google.android.gms.common.zzr) com.google.android.gms.internal.common.zzc.b(parcelZzB, com.google.android.gms.common.zzr.CREATOR);
        parcelZzB.recycle();
        return zzrVar;
    }
}
