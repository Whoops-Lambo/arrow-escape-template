package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbnj extends zzbfg implements zzbnk {
    public zzbnj() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbnk zzdH(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbnk ? (zzbnk) iInterfaceQueryLocalInterface : new zzbni(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbnd zzbnbVar;
        switch (i) {
            case 1:
                String string = parcel.readString();
                IObjectWrapper iObjectWrapperR = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zza(string, iObjectWrapperR);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                zzbfh.f(parcel);
                IObjectWrapper iObjectWrapperZzb = zzb(string2);
                parcel2.writeNoException();
                zzbfh.e(parcel2, iObjectWrapperZzb);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperR2 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzc(iObjectWrapperR2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzd();
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper.Stub.r(parcel.readStrongBinder());
                parcel.readInt();
                zzbfh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperR3 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzdC(iObjectWrapperR3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperR4 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzdE(iObjectWrapperR4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbnbVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    if (iInterfaceQueryLocalInterface instanceof zzbnd) {
                        zzbnbVar = (zzbnd) iInterfaceQueryLocalInterface;
                    } else {
                        zzbnbVar = new zzbnb(strongBinder);
                    }
                }
                zzbfh.f(parcel);
                zzdF(zzbnbVar);
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper iObjectWrapperR5 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzdD(iObjectWrapperR5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
