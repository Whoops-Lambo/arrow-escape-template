package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbwf extends zzbfg implements zzbwg {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String string = parcel.readString();
            zzbfh.f(parcel);
            zzbwj zzbwjVarZza = ((zzbwc) this).zza(string);
            parcel2.writeNoException();
            zzbfh.e(parcel2, zzbwjVarZza);
            return true;
        }
        if (i == 2) {
            String string2 = parcel.readString();
            zzbfh.f(parcel);
            boolean zZzb = ((zzbwc) this).zzb(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzb ? 1 : 0);
            return true;
        }
        if (i == 3) {
            String string3 = parcel.readString();
            zzbfh.f(parcel);
            zzbyf zzbyfVarZzd = ((zzbwc) this).zzd(string3);
            parcel2.writeNoException();
            zzbfh.e(parcel2, zzbyfVarZzd);
            return true;
        }
        if (i != 4) {
            return false;
        }
        String string4 = parcel.readString();
        zzbfh.f(parcel);
        boolean zD = ((zzbwc) this).d(string4);
        parcel2.writeNoException();
        parcel2.writeInt(zD ? 1 : 0);
        return true;
    }

    public zzbwf() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbwg O3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbwg ? (zzbwg) iInterfaceQueryLocalInterface : new zzbwe(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }
}
