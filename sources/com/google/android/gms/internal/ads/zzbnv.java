package com.google.android.gms.internal.ads;

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
public final class zzbnv extends zzbff implements zzbnx {
    @Override // com.google.android.gms.internal.ads.zzbnx
    public final List zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zzda());
        ArrayList<String> arrayListCreateStringArrayList = parcelZzdb.createStringArrayList();
        parcelZzdb.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zzda());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzj() throws RemoteException {
        zzdc(6, zzda());
    }

    public zzbnv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzl() throws RemoteException {
        zzdc(8, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final IObjectWrapper zzm() {
        return rl3.h(zzdb(9, zzda()));
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean zzo() throws RemoteException {
        Parcel parcelZzdb = zzdb(12, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean zzp() throws RemoteException {
        Parcel parcelZzdb = zzdb(13, zzda());
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzr() throws RemoteException {
        zzdc(15, zzda());
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzbnd zzs() throws RemoteException {
        zzbnd zzbnbVar;
        Parcel parcelZzdb = zzdb(16, zzda());
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

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean S1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        Parcel parcelZzdb = zzdb(10, parcelZzda);
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void Z1(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        zzdc(14, parcelZzda);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean g(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, iObjectWrapper);
        Parcel parcelZzdb = zzdb(17, parcelZzda);
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zze(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(1, parcelZzda);
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzbng zzf(String str) throws RemoteException {
        zzbng zzbneVar;
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(2, parcelZzda);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbneVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (iInterfaceQueryLocalInterface instanceof zzbng) {
                zzbneVar = (zzbng) iInterfaceQueryLocalInterface;
            } else {
                zzbneVar = new zzbne(strongBinder);
            }
        }
        parcelZzdb.recycle();
        return zzbneVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzi(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        zzdc(5, parcelZzda);
    }
}
