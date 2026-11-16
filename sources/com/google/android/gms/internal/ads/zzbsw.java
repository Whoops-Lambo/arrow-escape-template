package com.google.android.gms.internal.ads;

import android.os.Parcel;
import defpackage.cc4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzbsw extends zzbfg implements zzbsx {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            ((cc4) this).zze();
        } else {
            if (i != 3) {
                return false;
            }
            String string = parcel.readString();
            zzbfh.f(parcel);
            ((cc4) this).zzf(string);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbsw() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }
}
