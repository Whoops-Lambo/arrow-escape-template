package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbq[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        zzdg zzdgVar;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzdf zzddVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        strCreateString = SafeParcelReader.createString(parcel, header);
                    }
                } else {
                    iBinder2 = SafeParcelReader.readIBinder(parcel, header);
                }
            } else {
                iBinder = SafeParcelReader.readIBinder(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        if (iBinder == null) {
            zzdgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryResultListener");
            if (iInterfaceQueryLocalInterface instanceof zzdg) {
                zzdgVar = (zzdg) iInterfaceQueryLocalInterface;
            } else {
                zzdgVar = new zzdg(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryResultListener");
            }
        }
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryCallback");
            if (iInterfaceQueryLocalInterface2 instanceof zzdf) {
                zzddVar = (zzdf) iInterfaceQueryLocalInterface2;
            } else {
                zzddVar = new zzdd(iBinder2, "com.google.android.gms.nearby.exposurenotification.internal.IExposureSummaryCallback");
            }
        }
        zzbq zzbqVar = new zzbq();
        zzbqVar.c = zzdgVar;
        zzbqVar.a = zzddVar;
        zzbqVar.b = strCreateString;
        return zzbqVar;
    }
}
