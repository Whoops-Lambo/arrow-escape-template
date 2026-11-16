package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbnb extends zzbff implements zzbnd {
    @Override // com.google.android.gms.internal.ads.zzbnd
    public final float zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zzda());
        float f = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final IObjectWrapper zzg() {
        return rl3.h(zzdb(4, zzda()));
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final float zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zzda());
        float f = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final float zzi() throws RemoteException {
        Parcel parcelZzdb = zzdb(6, zzda());
        float f = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final com.google.android.gms.ads.internal.client.zzea zzj() throws RemoteException {
        Parcel parcelZzdb = zzdb(7, zzda());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZza = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzeaVarZza;
    }

    public zzbnb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final boolean zzk() throws RemoteException {
        Parcel parcelZzdb = zzdb(8, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(10, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(3, parcelZzda);
    }
}
