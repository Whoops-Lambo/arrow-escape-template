package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcfl extends zzbff implements zzcfn {
    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void q0(String str, Bundle bundle, String str2) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        parcelZzda.writeString(str2);
        zzbfh.c(parcelZzda, bundle);
        zzdc(3, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcfn
    public final void zza(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        zzdc(2, parcelZzda);
    }
}
