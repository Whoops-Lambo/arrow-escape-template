package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbyh extends zzbfg implements zzbyi {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String string = parcel.readString();
            zzbfh.f(parcel);
            ((zzetk) this).zze(string);
        } else if (i == 2) {
            String string2 = parcel.readString();
            zzbfh.f(parcel);
            zzetk zzetkVar = (zzetk) this;
            synchronized (zzetkVar) {
                zzetkVar.zzd(2, string2);
            }
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbfh.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbfh.f(parcel);
            ((zzetk) this).a(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbyh() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }
}
