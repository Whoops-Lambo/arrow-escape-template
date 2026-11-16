package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzcbx extends zzbfg implements zzcby {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbfh.b(parcel, ParcelFileDescriptor.CREATOR);
            zzbfh.f(parcel);
            h1(parcelFileDescriptor);
        } else if (i == 2) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzbfh.b(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            zzbfh.f(parcel);
            P0(zzbaVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzbfh.b(parcel, ParcelFileDescriptor.CREATOR);
            zzcch zzcchVar = (zzcch) zzbfh.b(parcel, zzcch.CREATOR);
            zzbfh.f(parcel);
            g3(parcelFileDescriptor2, zzcchVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzcbx() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }
}
