package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Contents[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        DriveId driveId = null;
        String strCreateString = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        if (fieldId != 5) {
                            if (fieldId != 7) {
                                if (fieldId != 8) {
                                    SafeParcelReader.skipUnknownField(parcel, header);
                                } else {
                                    strCreateString = SafeParcelReader.createString(parcel, header);
                                }
                            } else {
                                z = SafeParcelReader.readBoolean(parcel, header);
                            }
                        } else {
                            driveId = (DriveId) SafeParcelReader.createParcelable(parcel, header, DriveId.CREATOR);
                        }
                    } else {
                        i2 = SafeParcelReader.readInt(parcel, header);
                    }
                } else {
                    i = SafeParcelReader.readInt(parcel, header);
                }
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.createParcelable(parcel, header, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new Contents(parcelFileDescriptor, i, i2, driveId, z, strCreateString);
    }
}
