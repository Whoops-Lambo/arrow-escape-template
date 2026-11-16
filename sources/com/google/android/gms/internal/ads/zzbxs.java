package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ke4;
import defpackage.rl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbxs extends zzbfg implements zzbxt {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzbwp zzbwnVar;
        if (i == 1) {
            ((ke4) this).l(rl3.i(parcel, parcel));
        } else if (i == 2) {
            String string = parcel.readString();
            zzbfh.f(parcel);
            ((ke4) this).zzf(string);
        } else if (i == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbfh.b(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbfh.f(parcel);
            ((ke4) this).a(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbwnVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                zzbwnVar = iInterfaceQueryLocalInterface instanceof zzbwp ? (zzbwp) iInterfaceQueryLocalInterface : new zzbwn(strongBinder);
            }
            zzbfh.f(parcel);
            ke4 ke4Var = (ke4) this;
            ke4Var.b.d = zzbwnVar;
            ((zzeos) ke4Var.a.c).zzj();
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbxs() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }
}
