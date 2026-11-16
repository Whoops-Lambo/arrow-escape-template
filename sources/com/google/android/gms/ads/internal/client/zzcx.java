package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbwf;
import com.google.android.gms.internal.ads.zzbwg;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcx extends zzbfg implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzdk zzdiVar;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                float f = parcel.readFloat();
                zzbfh.f(parcel);
                zzf(f);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzbfh.f(parcel);
                zzg(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zA = zzbfh.a(parcel);
                zzbfh.f(parcel);
                zzh(zA);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper iObjectWrapperR = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzbfh.f(parcel);
                zzi(iObjectWrapperR, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                IObjectWrapper iObjectWrapperR2 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzj(string3, iObjectWrapperR2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                ClassLoader classLoader = zzbfh.a;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzbfh.f(parcel);
                zzn(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbwg zzbwgVarO3 = zzbwf.O3(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzo(zzbwgVarO3);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbta zzbtaVarZzb = zzbsz.zzb(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzp(zzbtaVarZzb);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzq);
                return true;
            case 14:
                zzfr zzfrVar = (zzfr) zzbfh.b(parcel, zzfr.CREATOR);
                zzbfh.f(parcel);
                zzr(zzfrVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzdiVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    if (iInterfaceQueryLocalInterface instanceof zzdk) {
                        zzdiVar = (zzdk) iInterfaceQueryLocalInterface;
                    } else {
                        zzdiVar = new zzdi(strongBinder);
                    }
                }
                zzbfh.f(parcel);
                zzt(zzdiVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zA2 = zzbfh.a(parcel);
                zzbfh.f(parcel);
                zzu(zA2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                zzbfh.f(parcel);
                zzv(string5);
                parcel2.writeNoException();
                return true;
            case 19:
                zzw();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
