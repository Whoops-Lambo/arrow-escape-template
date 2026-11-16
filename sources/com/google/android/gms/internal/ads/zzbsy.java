package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbsy extends zzbff implements zzbta {
    @Override // com.google.android.gms.internal.ads.zzbta
    public final void zza(List list) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeTypedList(list);
        zzdc(1, parcelZzda);
    }
}
