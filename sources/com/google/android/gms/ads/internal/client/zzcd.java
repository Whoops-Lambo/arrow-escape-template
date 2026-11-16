package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbfh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcd extends zzbfg implements zzce {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzdx zzdvVar;
        if (i == 1) {
            String string = parcel.readString();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzdvVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
                zzdvVar = iInterfaceQueryLocalInterface instanceof zzdx ? (zzdx) iInterfaceQueryLocalInterface : new zzdv(strongBinder);
            }
            zzbfh.f(parcel);
            zze(string, zzdvVar);
        } else if (i == 2) {
            String string2 = parcel.readString();
            zzbfh.f(parcel);
            zzf(string2);
        } else {
            if (i != 3) {
                return false;
            }
            String string3 = parcel.readString();
            zze zzeVar = (zze) zzbfh.b(parcel, zze.CREATOR);
            zzbfh.f(parcel);
            zzg(string3, zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }
}
