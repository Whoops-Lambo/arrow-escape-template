package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbry extends zzbff implements zzbsa {
    @Override // com.google.android.gms.internal.ads.zzbsa
    public final zzbrx S2(ObjectWrapper objectWrapper, zzbwg zzbwgVar, zzbrr zzbrrVar) throws RemoteException {
        zzbrx zzbrvVar;
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, objectWrapper);
        zzbfh.e(parcelZzda, zzbwgVar);
        parcelZzda.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzbfh.e(parcelZzda, zzbrrVar);
        Parcel parcelZzdb = zzdb(1, parcelZzda);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbrvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            if (iInterfaceQueryLocalInterface instanceof zzbrx) {
                zzbrvVar = (zzbrx) iInterfaceQueryLocalInterface;
            } else {
                zzbrvVar = new zzbrv(strongBinder);
            }
        }
        parcelZzdb.recycle();
        return zzbrvVar;
    }
}
