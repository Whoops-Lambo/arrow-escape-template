package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzch implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcg[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        zzdv zzdvVar;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzdy zzdwVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    SafeParcelReader.skipUnknownField(parcel, header);
                } else {
                    iBinder2 = SafeParcelReader.readIBinder(parcel, header);
                }
            } else {
                iBinder = SafeParcelReader.readIBinder(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        if (iBinder == null) {
            zzdvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyHistoryResultListener");
            if (iInterfaceQueryLocalInterface instanceof zzdv) {
                zzdvVar = (zzdv) iInterfaceQueryLocalInterface;
            } else {
                zzdvVar = new zzdv(iBinder, "com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyHistoryResultListener");
            }
        }
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyListCallback");
            if (iInterfaceQueryLocalInterface2 instanceof zzdy) {
                zzdwVar = (zzdy) iInterfaceQueryLocalInterface2;
            } else {
                zzdwVar = new zzdw(iBinder2, "com.google.android.gms.nearby.exposurenotification.internal.ITemporaryExposureKeyListCallback");
            }
        }
        zzcg zzcgVar = new zzcg();
        zzcgVar.b = zzdvVar;
        zzcgVar.a = zzdwVar;
        return zzcgVar;
    }
}
