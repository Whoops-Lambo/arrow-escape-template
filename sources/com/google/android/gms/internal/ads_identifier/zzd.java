package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzd extends zza implements zzf {
    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelR = r(1, parcelObtain);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() {
        boolean z;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelR = r(6, parcelObtain);
        int i = zzc.a;
        if (parcelR.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        parcelR.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i = zzc.a;
        boolean z = true;
        parcelObtain.writeInt(1);
        Parcel parcelR = r(2, parcelObtain);
        if (parcelR.readInt() == 0) {
            z = false;
        }
        parcelR.recycle();
        return z;
    }
}
