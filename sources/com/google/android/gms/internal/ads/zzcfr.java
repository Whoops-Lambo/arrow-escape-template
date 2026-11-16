package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcfr extends zzbff implements zzcft {
    @Override // com.google.android.gms.internal.ads.zzcft
    public final zzcfq i(ObjectWrapper objectWrapper, zzbwg zzbwgVar) throws RemoteException {
        zzcfq zzcfoVar;
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, objectWrapper);
        zzbfh.e(parcelZzda, zzbwgVar);
        parcelZzda.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzdb = zzdb(2, parcelZzda);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzcfoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (iInterfaceQueryLocalInterface instanceof zzcfq) {
                zzcfoVar = (zzcfq) iInterfaceQueryLocalInterface;
            } else {
                zzcfoVar = new zzcfo(strongBinder);
            }
        }
        parcelZzdb.recycle();
        return zzcfoVar;
    }
}
