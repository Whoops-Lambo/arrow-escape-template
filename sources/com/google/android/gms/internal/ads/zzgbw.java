package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzgbw extends zzbfg implements zzgbx {
    public zzgbw() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                IObjectWrapper.Stub.r(parcel.readStrongBinder());
                parcel.readString();
                zzbfh.f(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzbfh.f(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzbfh.f(parcel);
                break;
            case 6:
                parcel.readInt();
                zzbfh.f(parcel);
                break;
            case 7:
                parcel.readInt();
                zzbfh.f(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.r(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzbfh.f(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
