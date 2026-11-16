package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzbsz extends zzbfg implements zzbta {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbst.CREATOR);
        zzbfh.f(parcel);
        zza(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }

    public zzbsz() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbta zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof zzbta ? (zzbta) iInterfaceQueryLocalInterface : new zzbsy(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }
}
