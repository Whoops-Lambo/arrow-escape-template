package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rl3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbwt extends zzbff implements zzbwv {
    @Override // com.google.android.gms.internal.ads.zzbwv
    public final String zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final List zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zzda());
        ArrayList arrayList = parcelZzdb.readArrayList(zzbfh.a);
        parcelZzdb.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final String zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final zzbng zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zzda());
        zzbng zzbngVarO3 = zzbnf.O3(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbngVarO3;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final String zzi() throws RemoteException {
        Parcel parcelZzdb = zzdb(6, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final String zzj() throws RemoteException {
        Parcel parcelZzdb = zzdb(7, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    public zzbwt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final float zzA() throws RemoteException {
        Parcel parcelZzdb = zzdb(24, zzda());
        float f = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final float zzB() throws RemoteException {
        Parcel parcelZzdb = zzdb(25, zzda());
        float f = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zzC() throws RemoteException {
        zzdc(26, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final double zzk() throws RemoteException {
        Parcel parcelZzdb = zzdb(8, zzda());
        double d = parcelZzdb.readDouble();
        parcelZzdb.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final String zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(9, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final String zzm() throws RemoteException {
        Parcel parcelZzdb = zzdb(10, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws RemoteException {
        Parcel parcelZzdb = zzdb(11, zzda());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZza = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzeaVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final zzbmz zzo() throws RemoteException {
        Parcel parcelZzdb = zzdb(12, zzda());
        zzbmz zzbmzVarO3 = zzbmy.O3(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbmzVarO3;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final IObjectWrapper zzp() {
        return rl3.h(zzdb(13, zzda()));
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final IObjectWrapper zzq() {
        return rl3.h(zzdb(14, zzda()));
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final IObjectWrapper zzr() {
        return rl3.h(zzdb(15, zzda()));
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final Bundle zzs() throws RemoteException {
        Parcel parcelZzdb = zzdb(16, zzda());
        Bundle bundle = (Bundle) zzbfh.b(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final boolean zzt() throws RemoteException {
        Parcel parcelZzdb = zzdb(17, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final boolean zzu() throws RemoteException {
        Parcel parcelZzdb = zzdb(18, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zzv() throws RemoteException {
        zzdc(19, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final float zzz() throws RemoteException {
        Parcel parcelZzdb = zzdb(23, zzda());
        float f = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void G(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzbfh.e(parcelZzda, iObjectWrapper2);
        zzbfh.e(parcelZzda, iObjectWrapper3);
        zzdc(21, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void S0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(22, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void z(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(20, parcelZzda);
    }
}
