package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zan extends com.google.android.gms.internal.base.zab implements zao {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int i3 = parcel.readInt();
        com.google.android.gms.internal.base.zac.d(parcel);
        zab(i3);
        return true;
    }

    public zan() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }
}
