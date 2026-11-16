package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcae extends zzbfg implements zzcaf {
    public zzcae() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzcaf zzH(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof zzcaf ? (zzcaf) iInterfaceQueryLocalInterface : new zzcad(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) zzbfh.b(parcel, Bundle.CREATOR);
                zzbfh.f(parcel);
                zzg(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                zzh();
                parcel2.writeNoException();
                return true;
            case 3:
                zzi();
                parcel2.writeNoException();
                return true;
            case 4:
                zzj();
                parcel2.writeNoException();
                return true;
            case 5:
                zzk();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) zzbfh.b(parcel, Bundle.CREATOR);
                zzbfh.f(parcel);
                zzn(bundle2);
                parcel2.writeNoException();
                zzbfh.d(parcel2, bundle2);
                return true;
            case 7:
                zzo();
                parcel2.writeNoException();
                return true;
            case 8:
                zzp();
                parcel2.writeNoException();
                return true;
            case 9:
                zzr();
                parcel2.writeNoException();
                return true;
            case 10:
                zzd();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZzf = zzf();
                parcel2.writeNoException();
                ClassLoader classLoader = zzbfh.a;
                parcel2.writeInt(zZzf ? 1 : 0);
                return true;
            case 12:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                Intent intent = (Intent) zzbfh.b(parcel, Intent.CREATOR);
                zzbfh.f(parcel);
                zzl(i3, i4, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 14:
                zze();
                parcel2.writeNoException();
                return true;
            case 15:
                int i5 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                zzbfh.f(parcel);
                zzG(i5, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
