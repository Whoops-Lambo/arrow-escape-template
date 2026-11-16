package com.google.android.gms.internal.ads;

import android.os.Parcel;
import defpackage.we4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbyb extends zzbfg implements zzbyc {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            ((we4) this).zze();
        } else if (i == 3) {
            String string = parcel.readString();
            zzbfh.f(parcel);
            ((we4) this).zzf(string);
        } else {
            if (i != 4) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbfh.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbfh.f(parcel);
            ((we4) this).a(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbyb() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }
}
