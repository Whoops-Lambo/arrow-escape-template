package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcdh extends zzbff implements zzcdj {
    @Override // com.google.android.gms.internal.ads.zzcdj
    public final String zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(1, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final int zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zzda());
        int i = parcelZzdb.readInt();
        parcelZzdb.recycle();
        return i;
    }

    public zzcdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }
}
