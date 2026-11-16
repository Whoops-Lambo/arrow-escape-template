package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbrt extends zzbfg implements zzbru {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        zzbfh.f(parcel);
        ((zzbrr) this).zza(string);
        parcel2.writeNoException();
        return true;
    }

    public zzbrt() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }
}
