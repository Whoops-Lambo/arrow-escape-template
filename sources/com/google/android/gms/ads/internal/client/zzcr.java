package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbfh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcr extends zzbfg implements zzcs {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze zzeVar = (zze) zzbfh.b(parcel, zze.CREATOR);
            zzbfh.f(parcel);
            zza(zzeVar);
        } else if (i == 2) {
            zzb();
        } else if (i == 3) {
            zzc();
        } else if (i == 4) {
            zzd();
        } else {
            if (i != 5) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }

    public zzcr() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }
}
