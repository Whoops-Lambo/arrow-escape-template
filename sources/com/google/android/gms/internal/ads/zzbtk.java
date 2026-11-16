package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbtk extends zzbfg implements zzbtl {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            zzbfh.f(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbtk() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }
}
