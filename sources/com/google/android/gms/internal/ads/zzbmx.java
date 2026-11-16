package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbmx extends zzbff implements zzbmz {
    @Override // com.google.android.gms.internal.ads.zzbmz
    public final String zza() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final ArrayList zzb() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zzda());
        ArrayList arrayList = parcelZzdb.readArrayList(zzbfh.a);
        parcelZzdb.recycle();
        return arrayList;
    }

    public zzbmx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }
}
