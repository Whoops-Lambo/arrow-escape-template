package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbtj extends zzbff implements zzbtl {
    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zze() throws RemoteException {
        zzdc(1, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final void zzf(int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        zzdc(2, parcelZzda);
    }
}
