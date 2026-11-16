package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rl3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbov extends zzbff implements zzbox {
    @Override // com.google.android.gms.internal.ads.zzbox
    public final String zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final List zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zzda());
        ArrayList arrayList = parcelZzdb.readArrayList(zzbfh.a);
        parcelZzdb.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final String zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final zzbng zzh() throws RemoteException {
        zzbng zzbneVar;
        Parcel parcelZzdb = zzdb(5, zzda());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbneVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbneVar = iInterfaceQueryLocalInterface instanceof zzbng ? (zzbng) iInterfaceQueryLocalInterface : new zzbne(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbneVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final String zzi() throws RemoteException {
        Parcel parcelZzdb = zzdb(6, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final String zzj() throws RemoteException {
        Parcel parcelZzdb = zzdb(7, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final long v() throws RemoteException {
        Parcel parcelZzdb = zzdb(34, zzda());
        long j = parcelZzdb.readLong();
        parcelZzdb.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void x() throws RemoteException {
        zzdc(22, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean y() throws RemoteException {
        Parcel parcelZzdb = zzdb(30, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzdb = zzdb(24, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzD() throws RemoteException {
        zzdc(27, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzE() throws RemoteException {
        zzdc(28, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final zzbnd zzF() throws RemoteException {
        zzbnd zzbnbVar;
        Parcel parcelZzdb = zzdb(29, zzda());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbnbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbnbVar = iInterfaceQueryLocalInterface instanceof zzbnd ? (zzbnd) iInterfaceQueryLocalInterface : new zzbnb(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final com.google.android.gms.ads.internal.client.zzdx zzH() throws RemoteException {
        Parcel parcelZzdb = zzdb(31, zzda());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZza = com.google.android.gms.ads.internal.client.zzdw.zza(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzdxVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final double zzk() throws RemoteException {
        Parcel parcelZzdb = zzdb(8, zzda());
        double d = parcelZzdb.readDouble();
        parcelZzdb.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final String zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(9, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final String zzm() throws RemoteException {
        Parcel parcelZzdb = zzdb(10, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws RemoteException {
        Parcel parcelZzdb = zzdb(11, zzda());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZza = com.google.android.gms.ads.internal.client.zzdz.zza(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzeaVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzp() throws RemoteException {
        zzdc(13, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final zzbmz zzq() throws RemoteException {
        zzbmz zzbmxVar;
        Parcel parcelZzdb = zzdb(14, zzda());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbmxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbmxVar = iInterfaceQueryLocalInterface instanceof zzbmz ? (zzbmz) iInterfaceQueryLocalInterface : new zzbmx(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final IObjectWrapper zzu() {
        return rl3.h(zzdb(18, zzda()));
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final IObjectWrapper zzv() {
        return rl3.h(zzdb(19, zzda()));
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final Bundle zzw() throws RemoteException {
        Parcel parcelZzdb = zzdb(20, zzda());
        Bundle bundle = (Bundle) zzbfh.b(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final List zzz() throws RemoteException {
        Parcel parcelZzdb = zzdb(23, zzda());
        ArrayList arrayList = parcelZzdb.readArrayList(zzbfh.a);
        parcelZzdb.recycle();
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void D3(Bundle bundle) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, bundle);
        zzdc(15, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void I2(zzbou zzbouVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzbouVar);
        zzdc(21, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void O0(com.google.android.gms.ads.internal.client.zzdc zzdcVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzdcVar);
        zzdc(26, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void Q0(long j) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeLong(j);
        zzdc(35, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void d0(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzdqVar);
        zzdc(32, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void n3(Bundle bundle) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, bundle);
        zzdc(17, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final boolean s3(Bundle bundle) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, bundle);
        Parcel parcelZzdb = zzdb(16, parcelZzda);
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void t2(Bundle bundle) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, bundle);
        zzdc(33, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void v2(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzdgVar);
        zzdc(25, parcelZzda);
    }
}
