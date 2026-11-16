package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbwg;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbv extends zzbff implements IInterface {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbwg zzbwgVar, int i, int i2) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzbfh.c(parcelZzda, zzrVar);
        parcelZzda.writeString(str);
        zzbfh.e(parcelZzda, zzbwgVar);
        parcelZzda.writeInt(ModuleDescriptor.MODULE_VERSION);
        parcelZzda.writeInt(i2);
        Parcel parcelZzdb = zzdb(2, parcelZzda);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        parcelZzdb.recycle();
        return strongBinder;
    }
}
