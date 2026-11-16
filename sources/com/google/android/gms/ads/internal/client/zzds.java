package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbfh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzds extends zzbfg implements zzdt {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        IObjectWrapper iObjectWrapperR = IObjectWrapper.Stub.r(parcel.readStrongBinder());
        IObjectWrapper iObjectWrapperR2 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
        zzbfh.f(parcel);
        zze(string, iObjectWrapperR, iObjectWrapperR2);
        parcel2.writeNoException();
        return true;
    }

    public zzds() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }
}
