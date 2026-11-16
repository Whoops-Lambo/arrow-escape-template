package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbwu extends zzbfg implements zzbwv {
    public zzbwu() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                List listZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(listZzf);
                return true;
            case 4:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 5:
                zzbng zzbngVarZzh = zzh();
                parcel2.writeNoException();
                zzbfh.e(parcel2, zzbngVarZzh);
                return true;
            case 6:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzk);
                return true;
            case 9:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzn = zzn();
                parcel2.writeNoException();
                zzbfh.e(parcel2, zzeaVarZzn);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = zzbfh.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperZzp = zzp();
                parcel2.writeNoException();
                zzbfh.e(parcel2, iObjectWrapperZzp);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperZzq = zzq();
                parcel2.writeNoException();
                zzbfh.e(parcel2, iObjectWrapperZzq);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperZzr = zzr();
                parcel2.writeNoException();
                zzbfh.e(parcel2, iObjectWrapperZzr);
                return true;
            case 16:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                zzbfh.d(parcel2, bundleZzs);
                return true;
            case 17:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzbfh.a;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 18:
                boolean zZzu = zzu();
                parcel2.writeNoException();
                ClassLoader classLoader3 = zzbfh.a;
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 19:
                zzv();
                parcel2.writeNoException();
                return true;
            case 20:
                IObjectWrapper iObjectWrapperR = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                z(iObjectWrapperR);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper iObjectWrapperR2 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperR3 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperR4 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                G(iObjectWrapperR2, iObjectWrapperR3, iObjectWrapperR4);
                parcel2.writeNoException();
                return true;
            case 22:
                IObjectWrapper iObjectWrapperR5 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                S0(iObjectWrapperR5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzz = zzz();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzz);
                return true;
            case 24:
                float fZzA = zzA();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzA);
                return true;
            case 25:
                float fZzB = zzB();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzB);
                return true;
            case 26:
                zzC();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
