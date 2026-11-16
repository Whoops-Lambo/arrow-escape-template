package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbe implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }

    @Override // android.os.Parcelable.Creator
    public final LocationAvailability createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 1000;
        long j = 0;
        zzbo[] zzboVarArr = null;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                zzboVarArr = (zzbo[]) SafeParcelReader.createTypedArray(parcel, header, zzbo.CREATOR);
                            }
                        } else {
                            i = SafeParcelReader.readInt(parcel, header);
                        }
                    } else {
                        j = SafeParcelReader.readLong(parcel, header);
                    }
                } else {
                    i3 = SafeParcelReader.readInt(parcel, header);
                }
            } else {
                i2 = SafeParcelReader.readInt(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        LocationAvailability locationAvailability = new LocationAvailability();
        locationAvailability.d = i;
        locationAvailability.a = i2;
        locationAvailability.b = i3;
        locationAvailability.c = j;
        locationAvailability.e = zzboVarArr;
        return locationAvailability;
    }
}
