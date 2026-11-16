package com.google.android.gms.internal.playcore_hsdp;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class zza implements IInterface {
    public final IBinder a;
    public final String b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final void z1(int i, Parcel parcel) {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public zza(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    public final Parcel r() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }
}
