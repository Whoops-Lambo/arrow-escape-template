package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbm[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        zzdc zzdcVar;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzdb zzczVar = null;
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
            zzdcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IExposureInformationResultListener");
            if (iInterfaceQueryLocalInterface instanceof zzdc) {
                zzdcVar = (zzdc) iInterfaceQueryLocalInterface;
            } else {
                zzdcVar = new zzdc(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.IExposureInformationResultListener");
            }
        }
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IExposureInformationListCallback");
            if (iInterfaceQueryLocalInterface2 instanceof zzdb) {
                zzczVar = (zzdb) iInterfaceQueryLocalInterface2;
            } else {
                zzczVar = new zzcz(iBinder2, "com.google.android.gms.nearby.exposurenotification.internal.IExposureInformationListCallback");
            }
        }
        zzbm zzbmVar = new zzbm();
        zzbmVar.c = zzdcVar;
        zzbmVar.a = zzczVar;
        zzbmVar.b = strCreateString;
        return zzbmVar;
    }
}
