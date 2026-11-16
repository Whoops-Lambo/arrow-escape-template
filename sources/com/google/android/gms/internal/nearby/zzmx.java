package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzmx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzmw[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        zzkj zzkhVar;
        zzjz zzjzVar;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzkc zzkaVar = null;
        long j = 0;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String strCreateString = null;
        DiscoveryOptions discoveryOptions = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 2:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 5:
                    discoveryOptions = (DiscoveryOptions) SafeParcelReader.createParcelable(parcel, header, DiscoveryOptions.CREATOR);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        if (iBinder == null) {
            zzkhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            if (iInterfaceQueryLocalInterface instanceof zzkj) {
                zzkhVar = (zzkj) iInterfaceQueryLocalInterface;
            } else {
                zzkhVar = new zzkh(iBinder);
            }
        }
        if (iBinder2 == null) {
            zzjzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
            if (iInterfaceQueryLocalInterface2 instanceof zzjz) {
                zzjzVar = (zzjz) iInterfaceQueryLocalInterface2;
            } else {
                zzjzVar = new zzjz(iBinder2, "com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
            }
        }
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            if (iInterfaceQueryLocalInterface3 instanceof zzkc) {
                zzkaVar = (zzkc) iInterfaceQueryLocalInterface3;
            } else {
                zzkaVar = new zzka(iBinder3, "com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            }
        }
        zzmw zzmwVar = new zzmw();
        zzmwVar.a = zzkhVar;
        zzmwVar.f = zzjzVar;
        zzmwVar.b = strCreateString;
        zzmwVar.c = j;
        zzmwVar.d = discoveryOptions;
        zzmwVar.e = zzkaVar;
        return zzmwVar;
    }
}
