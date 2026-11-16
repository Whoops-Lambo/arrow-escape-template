package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbsv extends zzbff implements zzbsx {
    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zze() throws RemoteException {
        zzdc(2, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        zzdc(3, parcelZzda);
    }
}
