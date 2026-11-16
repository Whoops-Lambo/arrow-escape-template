package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbhm extends zzbfg implements zzbhn {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzbhk zzbhiVar;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbhiVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbhiVar = iInterfaceQueryLocalInterface instanceof zzbhk ? (zzbhk) iInterfaceQueryLocalInterface : new zzbhi(strongBinder);
            }
            zzbfh.f(parcel);
            M(zzbhiVar);
        } else if (i == 2) {
            int i3 = parcel.readInt();
            zzbfh.f(parcel);
            zzb(i3);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbfh.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbfh.f(parcel);
            zzc(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbhm() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }
}
