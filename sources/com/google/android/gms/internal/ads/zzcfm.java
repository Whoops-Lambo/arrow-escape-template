package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.p14;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzcfm extends zzbfg implements zzcfn {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            zzbfh.f(parcel);
        } else if (i == 2) {
            String string = parcel.readString();
            zzbfh.f(parcel);
            ((p14) this).zza(string);
        } else {
            if (i != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) zzbfh.b(parcel, Bundle.CREATOR);
            zzbfh.f(parcel);
            ((p14) this).q0(string2, bundle, string3);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzcfm() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }
}
