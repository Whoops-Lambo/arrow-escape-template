package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbfh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzdz extends zzbfg implements zzea {
    public zzdz() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzea zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof zzea ? (zzea) iInterfaceQueryLocalInterface : new zzdy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzed zzebVar;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                zzf();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zA = zzbfh.a(parcel);
                zzbfh.f(parcel);
                zzg(zA);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzh = zzh();
                parcel2.writeNoException();
                ClassLoader classLoader = zzbfh.a;
                parcel2.writeInt(zZzh ? 1 : 0);
                return true;
            case 5:
                int iZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeInt(iZzi);
                return true;
            case 6:
                float fZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzj);
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzebVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (iInterfaceQueryLocalInterface instanceof zzed) {
                        zzebVar = (zzed) iInterfaceQueryLocalInterface;
                    } else {
                        zzebVar = new zzeb(strongBinder);
                    }
                }
                zzbfh.f(parcel);
                zzl(zzebVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float fZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzm);
                return true;
            case 10:
                boolean zZzn = zzn();
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzbfh.a;
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                zzed zzedVarZzo = zzo();
                parcel2.writeNoException();
                zzbfh.e(parcel2, zzedVarZzo);
                return true;
            case 12:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                ClassLoader classLoader3 = zzbfh.a;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 13:
                zzq();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
