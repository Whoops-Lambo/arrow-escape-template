package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbwn extends zzbff implements zzbwp {
    @Override // com.google.android.gms.internal.ads.zzbwp
    public final IObjectWrapper zze() {
        return rl3.h(zzdb(1, zzda()));
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    public zzbwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }
}
