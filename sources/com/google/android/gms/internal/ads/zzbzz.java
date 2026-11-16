package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbzz extends zzbff implements zzcab {
    @Override // com.google.android.gms.internal.ads.zzcab
    public final zzbzy i(ObjectWrapper objectWrapper, zzbwg zzbwgVar) throws RemoteException {
        zzbzy zzbzwVar;
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, objectWrapper);
        zzbfh.e(parcelZzda, zzbwgVar);
        parcelZzda.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzdb = zzdb(1, parcelZzda);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbzwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            if (iInterfaceQueryLocalInterface instanceof zzbzy) {
                zzbzwVar = (zzbzy) iInterfaceQueryLocalInterface;
            } else {
                zzbzwVar = new zzbzw(strongBinder);
            }
        }
        parcelZzdb.recycle();
        return zzbzwVar;
    }
}
