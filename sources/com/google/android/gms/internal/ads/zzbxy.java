package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.qe4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbxy extends zzbfg implements zzbxz {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzbwv zzbwtVar;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbwtVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                zzbwtVar = iInterfaceQueryLocalInterface instanceof zzbwv ? (zzbwv) iInterfaceQueryLocalInterface : new zzbwt(strongBinder);
            }
            zzbfh.f(parcel);
            ((qe4) this).n1(zzbwtVar);
        } else if (i == 2) {
            String string = parcel.readString();
            zzbfh.f(parcel);
            ((qe4) this).zzf(string);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbfh.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbfh.f(parcel);
            ((qe4) this).a(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbxy() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }
}
