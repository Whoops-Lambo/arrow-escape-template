package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbfi extends zzbff implements zzbfk {
    @Override // com.google.android.gms.internal.ads.zzbfk
    public final Bundle f(Bundle bundle) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, bundle);
        Parcel parcelZzdb = zzdb(1, parcelZzda);
        Bundle bundle2 = (Bundle) zzbfh.b(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle2;
    }
}
