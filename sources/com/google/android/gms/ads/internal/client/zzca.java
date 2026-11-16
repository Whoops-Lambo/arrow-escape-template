package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbfh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzca extends zzbfg implements zzcb {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzfp zzfpVar = (zzfp) zzbfh.b(parcel, zzfp.CREATOR);
            zzbfh.f(parcel);
            zze(zzfpVar);
        } else {
            if (i != 2) {
                return false;
            }
            zzfp zzfpVar2 = (zzfp) zzbfh.b(parcel, zzfp.CREATOR);
            zzbfh.f(parcel);
            zzf(zzfpVar2);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzca() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }
}
