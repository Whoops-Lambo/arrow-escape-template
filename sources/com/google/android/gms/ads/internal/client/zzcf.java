package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbwg;
import com.google.android.gms.internal.ads.zzcdl;
import com.google.android.gms.internal.ads.zzcdm;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcf extends zzbff implements zzch {
    public zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(List list, zzcb zzcbVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeTypedList(list);
        zzbfh.e(parcelZzda, zzcbVar);
        zzdc(1, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzf(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(2, parcelZzda);
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzcdm zzg(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(3, parcelZzda);
        zzcdm zzcdmVarZzs = zzcdl.zzs(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzcdmVarZzs;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzh(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(4, parcelZzda);
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbhk zzi(String str) throws RemoteException {
        zzbhk zzbhiVar;
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(5, parcelZzda);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        int i = zzbhj.a;
        if (strongBinder == null) {
            zzbhiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
            if (iInterfaceQueryLocalInterface instanceof zzbhk) {
                zzbhiVar = (zzbhk) iInterfaceQueryLocalInterface;
            } else {
                zzbhiVar = new zzbhi(strongBinder);
            }
        }
        parcelZzdb.recycle();
        return zzbhiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzj(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(6, parcelZzda);
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzk(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(7, parcelZzda);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) iInterfaceQueryLocalInterface;
            } else {
                zzbsVar = new zzbs(strongBinder);
            }
        }
        parcelZzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzl(zzbwg zzbwgVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        zzbfh.e(parcelZzda, zzbwgVar);
        zzdc(8, parcelZzda);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzm(String str, zzfp zzfpVar, zzce zzceVar) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        zzbfh.c(parcelZzda, zzfpVar);
        zzbfh.e(parcelZzda, zzceVar);
        Parcel parcelZzdb = zzdb(9, parcelZzda);
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzn(int i, String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(10, parcelZzda);
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzo(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(11, parcelZzda);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iInterfaceQueryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) iInterfaceQueryLocalInterface;
            } else {
                zzbsVar = new zzbs(strongBinder);
            }
        }
        parcelZzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbhk zzp(String str) throws RemoteException {
        zzbhk zzbhiVar;
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(12, parcelZzda);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        int i = zzbhj.a;
        if (strongBinder == null) {
            zzbhiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
            if (iInterfaceQueryLocalInterface instanceof zzbhk) {
                zzbhiVar = (zzbhk) iInterfaceQueryLocalInterface;
            } else {
                zzbhiVar = new zzbhi(strongBinder);
            }
        }
        parcelZzdb.recycle();
        return zzbhiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzcdm zzq(String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(13, parcelZzda);
        zzcdm zzcdmVarZzs = zzcdl.zzs(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzcdmVarZzs;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzfp zzr(int i, String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(14, parcelZzda);
        zzfp zzfpVar = (zzfp) zzbfh.b(parcelZzdb, zzfp.CREATOR);
        parcelZzdb.recycle();
        return zzfpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final Bundle zzs(int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        Parcel parcelZzdb = zzdb(15, parcelZzda);
        Bundle bundle = (Bundle) zzbfh.b(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final int zzt(int i, String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(16, parcelZzda);
        int i2 = parcelZzdb.readInt();
        parcelZzdb.recycle();
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzu(int i, String str) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        parcelZzda.writeString(str);
        Parcel parcelZzdb = zzdb(17, parcelZzda);
        boolean zA = zzbfh.a(parcelZzdb);
        parcelZzdb.recycle();
        return zA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzv(int i) throws RemoteException {
        Parcel parcelZzda = zzda();
        parcelZzda.writeInt(i);
        zzdc(18, parcelZzda);
    }
}
