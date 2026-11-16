package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzqj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzqi[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        zzpb zzozVar;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzoy zzowVar = null;
        IBinder iBinder = null;
        zzpy zzpyVar = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        iBinder2 = SafeParcelReader.readIBinder(parcel, header);
                    }
                } else {
                    zzpyVar = (zzpy) SafeParcelReader.createParcelable(parcel, header, zzpy.CREATOR);
                }
            } else {
                iBinder = SafeParcelReader.readIBinder(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        if (iBinder == null) {
            zzozVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            if (iInterfaceQueryLocalInterface instanceof zzpb) {
                zzozVar = (zzpb) iInterfaceQueryLocalInterface;
            } else {
                zzozVar = new zzoz(iBinder);
            }
        }
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
            if (iInterfaceQueryLocalInterface2 instanceof zzoy) {
                zzowVar = (zzoy) iInterfaceQueryLocalInterface2;
            } else {
                zzowVar = new zzow(iBinder2, "com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
            }
        }
        zzqi zzqiVar = new zzqi();
        zzqiVar.a = zzozVar;
        zzqiVar.b = zzpyVar;
        zzqiVar.c = zzowVar;
        return zzqiVar;
    }
}
