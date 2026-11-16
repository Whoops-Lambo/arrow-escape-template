package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import defpackage.zz3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbsk extends zzbfg implements zzbsl {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbfh.b(parcel, ParcelFileDescriptor.CREATOR);
        zzbfh.f(parcel);
        ((zz3) this).a.zzc(parcelFileDescriptor);
        return true;
    }

    public zzbsk() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }
}
