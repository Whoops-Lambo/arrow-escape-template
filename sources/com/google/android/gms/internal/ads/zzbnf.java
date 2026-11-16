package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzbnf extends zzbfg implements zzbng {
    public zzbnf() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzbng O3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof zzbng ? (zzbng) iInterfaceQueryLocalInterface : new zzbne(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperZza = ((zzbmr) this).zza();
                parcel2.writeNoException();
                zzbfh.e(parcel2, iObjectWrapperZza);
                return true;
            case 2:
                parcel2.writeNoException();
                zzbfh.d(parcel2, ((zzbmr) this).b);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(((zzbmr) this).c);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(((zzbmr) this).d);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(((zzbmr) this).e);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(((zzbmr) this).f);
                return true;
            default:
                return false;
        }
    }
}
