package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rl3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzcfp extends zzbfg implements zzcfq {
    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcfn zzcflVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperR = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzcfu zzcfuVar = (zzcfu) zzbfh.b(parcel, zzcfu.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcflVar = iInterfaceQueryLocalInterface instanceof zzcfn ? (zzcfn) iInterfaceQueryLocalInterface : new zzcfl(strongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
                }
                zzbfh.f(parcel);
                zze(iObjectWrapperR, zzcfuVar, zzcflVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperR2 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzf(iObjectWrapperR2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.r(parcel.readStrongBinder());
                IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperR3 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzcau zzcauVarO3 = zzcat.O3(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzg(arrayListCreateTypedArrayList, iObjectWrapperR3, zzcauVarO3);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperR4 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzcau zzcauVarO4 = zzcat.O3(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzh(arrayListCreateTypedArrayList2, iObjectWrapperR4, zzcauVarO4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcax zzcaxVar = (zzcax) zzbfh.b(parcel, zzcax.CREATOR);
                zzbfh.f(parcel);
                zzi(zzcaxVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper iObjectWrapperR5 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzj(iObjectWrapperR5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperR6 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzcau zzcauVarO5 = zzcat.O3(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzk(arrayListCreateTypedArrayList3, iObjectWrapperR6, zzcauVarO5);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperR7 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzcau zzcauVarO6 = zzcat.O3(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzl(arrayListCreateTypedArrayList4, iObjectWrapperR7, zzcauVarO6);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper iObjectWrapperZzm = zzm(IObjectWrapper.Stub.r(parcel.readStrongBinder()), IObjectWrapper.Stub.r(parcel.readStrongBinder()), parcel.readString(), rl3.i(parcel, parcel));
                parcel2.writeNoException();
                zzbfh.e(parcel2, iObjectWrapperZzm);
                return true;
            default:
                return false;
        }
    }

    public zzcfp() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcfq zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzcfq ? (zzcfq) iInterfaceQueryLocalInterface : new zzcfo(iBinder);
    }
}
