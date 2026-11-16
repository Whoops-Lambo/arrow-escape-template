package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.bp4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgsz extends zzbff implements zzgtb {
    @Override // com.google.android.gms.internal.ads.zzgtb
    public final void F(String str, Bundle bundle, bp4 bp4Var) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        zzbfh.c(parcelZzda, bundle);
        zzbfh.e(parcelZzda, bp4Var);
        zzdd(1, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final void Y(Bundle bundle, bp4 bp4Var) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, bundle);
        zzbfh.e(parcelZzda, bp4Var);
        zzdd(3, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzgtb
    public final void t0(Bundle bundle, bp4 bp4Var) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, bundle);
        zzbfh.e(parcelZzda, bp4Var);
        zzdd(2, parcelZzda);
    }
}
