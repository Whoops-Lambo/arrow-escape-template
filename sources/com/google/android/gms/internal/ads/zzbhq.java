package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbhq extends zzbfg implements zzbhr {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ((zzbhh) this).zzb();
        } else if (i == 2) {
            ((zzbhh) this).zzc();
        } else if (i == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbfh.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbfh.f(parcel);
            ((zzbhh) this).Y1(zzeVar);
        } else if (i == 4) {
            ((zzbhh) this).zze();
        } else {
            if (i != 5) {
                return false;
            }
            ((zzbhh) this).zzf();
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbhq() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }
}
