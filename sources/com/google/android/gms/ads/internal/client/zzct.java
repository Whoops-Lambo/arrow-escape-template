package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbwf;
import com.google.android.gms.internal.ads.zzbwg;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzct extends zzbff implements zzcv {
    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzbwg getAdapterCreator() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zzda());
        zzbwg zzbwgVarO3 = zzbwf.O3(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbwgVarO3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzez getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzdb = zzdb(1, zzda());
        zzez zzezVar = (zzez) zzbfh.b(parcelZzdb, zzez.CREATOR);
        parcelZzdb.recycle();
        return zzezVar;
    }

    public zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }
}
