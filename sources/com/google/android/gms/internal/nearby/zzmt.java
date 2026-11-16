package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.connection.AdvertisingOptions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzmt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzms[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        zzkm zzkkVar;
        zzjp zzjnVar;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzjv zzjtVar = null;
        long j = 0;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String strCreateString = null;
        String strCreateString2 = null;
        AdvertisingOptions advertisingOptions = null;
        IBinder iBinder3 = null;
        byte[] bArrCreateByteArray = null;
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
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    advertisingOptions = (AdvertisingOptions) SafeParcelReader.createParcelable(parcel, header, AdvertisingOptions.CREATOR);
                    break;
                case 7:
                    iBinder3 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 8:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        if (iBinder == null) {
            zzkkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
            if (iInterfaceQueryLocalInterface instanceof zzkm) {
                zzkkVar = (zzkm) iInterfaceQueryLocalInterface;
            } else {
                zzkkVar = new zzkk(iBinder, "com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
            }
        }
        if (iBinder2 == null) {
            zzjnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
            if (iInterfaceQueryLocalInterface2 instanceof zzjp) {
                zzjnVar = (zzjp) iInterfaceQueryLocalInterface2;
            } else {
                zzjnVar = new zzjn(iBinder2, "com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
            }
        }
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            if (iInterfaceQueryLocalInterface3 instanceof zzjv) {
                zzjtVar = (zzjv) iInterfaceQueryLocalInterface3;
            } else {
                zzjtVar = new zzjt(iBinder3);
            }
        }
        zzms zzmsVar = new zzms();
        zzmsVar.a = zzkkVar;
        zzmsVar.b = zzjnVar;
        zzmsVar.c = strCreateString;
        zzmsVar.d = strCreateString2;
        zzmsVar.e = j;
        zzmsVar.f = advertisingOptions;
        zzmsVar.g = zzjtVar;
        zzmsVar.h = bArrCreateByteArray;
        return zzmsVar;
    }
}
