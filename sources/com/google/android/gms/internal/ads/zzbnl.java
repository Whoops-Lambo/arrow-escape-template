package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbnl extends zzbff implements zzbnn {
    public zzbnl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final IBinder D2(ObjectWrapper objectWrapper, ObjectWrapper objectWrapper2, ObjectWrapper objectWrapper3) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, objectWrapper);
        zzbfh.e(parcelZzda, objectWrapper2);
        zzbfh.e(parcelZzda, objectWrapper3);
        parcelZzda.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzdb = zzdb(1, parcelZzda);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        parcelZzdb.recycle();
        return strongBinder;
    }
}
