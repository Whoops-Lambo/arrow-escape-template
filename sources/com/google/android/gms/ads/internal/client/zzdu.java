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
/* JADX INFO: loaded from: classes5.dex */
public final class zzdu extends zzbff implements IInterface {
    public zzdu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdt zze(IObjectWrapper iObjectWrapper, zzbwg zzbwgVar, int i) throws RemoteException {
        zzdt zzdrVar;
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzbfh.e(parcelZzda, zzbwgVar);
        parcelZzda.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzdb = zzdb(1, parcelZzda);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (iInterfaceQueryLocalInterface instanceof zzdt) {
                zzdrVar = (zzdt) iInterfaceQueryLocalInterface;
            } else {
                zzdrVar = new zzdr(strongBinder);
            }
        }
        parcelZzdb.recycle();
        return zzdrVar;
    }
}
