package com.google.android.gms.internal.identity_credentials;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class zza implements IInterface {
    public final IBinder a;
    public final String b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public zza(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    public final void r(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
