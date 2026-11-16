package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbwg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcw extends zzbff implements zzcy {
    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zze() throws RemoteException {
        zzdc(1, zzda());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzg(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float zzk() throws RemoteException {
        Parcel parcelZzdb = zzdb(7, zzda());
        float f = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f;
    }

    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(8, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzm() throws RemoteException {
        Parcel parcelZzdb = zzdb(9, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzq() throws RemoteException {
        Parcel parcelZzdb = zzdb(13, zzda());
        ArrayList arrayListCreateTypedArrayList = parcelZzdb.createTypedArrayList(zzbst.CREATOR);
        parcelZzdb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() throws RemoteException {
        zzdc(15, zzda());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzw() throws RemoteException {
        zzdc(19, zzda());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzf(float f) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeFloat(f);
        zzdc(2, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzh(boolean z) throws RemoteException {
        Parcel parcelZzda = zzda();
        ClassLoader classLoader = zzbfh.a;
        parcelZzda.writeInt(z ? 1 : 0);
        zzdc(4, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        parcelZzda.writeString(str);
        zzdc(5, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(null);
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(6, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        zzdc(10, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(zzbwg zzbwgVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzbwgVar);
        zzdc(11, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(zzbta zzbtaVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzbtaVar);
        zzdc(12, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(zzfr zzfrVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.c(parcelZzda, zzfrVar);
        zzdc(14, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(zzdk zzdkVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzdkVar);
        zzdc(16, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z) throws RemoteException {
        Parcel parcelZzda = zzda();
        ClassLoader classLoader = zzbfh.a;
        parcelZzda.writeInt(z ? 1 : 0);
        zzdc(17, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        zzdc(18, parcelZzda);
    }
}
