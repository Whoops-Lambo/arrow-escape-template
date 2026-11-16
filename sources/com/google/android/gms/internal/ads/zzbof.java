package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbof extends zzbff implements zzboh {
    @Override // com.google.android.gms.internal.ads.zzboh
    public final void H2(zzbnx zzbnxVar, String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzbnxVar);
        parcelZzda.writeString(str);
        zzdc(1, parcelZzda);
    }
}
