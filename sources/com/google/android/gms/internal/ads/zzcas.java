package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcas extends zzbff implements zzcau {
    @Override // com.google.android.gms.internal.ads.zzcau
    public final void k(List list) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeTypedList(list);
        zzdc(1, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        zzdc(2, parcelZzda);
    }
}
