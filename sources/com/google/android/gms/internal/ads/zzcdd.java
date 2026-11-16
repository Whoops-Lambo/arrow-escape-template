package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcdd extends zzbfg implements zzcde {
    public zzcdd() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperR = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                l(iObjectWrapperR);
                break;
            case 2:
                IObjectWrapper.Stub.r(parcel.readStrongBinder());
                parcel.readInt();
                zzbfh.f(parcel);
                u2();
                break;
            case 3:
                IObjectWrapper iObjectWrapperR2 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                k3(iObjectWrapperR2);
                break;
            case 4:
                IObjectWrapper iObjectWrapperR3 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                m(iObjectWrapperR3);
                break;
            case 5:
                IObjectWrapper iObjectWrapperR4 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                u3(iObjectWrapperR4);
                break;
            case 6:
                IObjectWrapper iObjectWrapperR5 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                zzj(iObjectWrapperR5);
                break;
            case 7:
                IObjectWrapper iObjectWrapperR6 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzcdf zzcdfVar = (zzcdf) zzbfh.b(parcel, zzcdf.CREATOR);
                zzbfh.f(parcel);
                X2(iObjectWrapperR6, zzcdfVar);
                break;
            case 8:
                IObjectWrapper iObjectWrapperR7 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                J3(iObjectWrapperR7);
                break;
            case 9:
                IObjectWrapper iObjectWrapperR8 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzbfh.f(parcel);
                T0(iObjectWrapperR8, i3);
                break;
            case 10:
                IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                V0();
                break;
            case 11:
                IObjectWrapper iObjectWrapperR9 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                L1(iObjectWrapperR9);
                break;
            case 12:
                zzbfh.f(parcel);
                break;
            case 13:
                IObjectWrapper iObjectWrapperR10 = IObjectWrapper.Stub.r(parcel.readStrongBinder());
                zzbfh.f(parcel);
                j2(iObjectWrapperR10);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
