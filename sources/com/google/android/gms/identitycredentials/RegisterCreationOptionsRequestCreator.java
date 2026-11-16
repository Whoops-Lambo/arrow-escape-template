package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class RegisterCreationOptionsRequestCreator implements Parcelable.Creator<RegisterCreationOptionsRequest> {
    @Override // android.os.Parcelable.Creator
    public final RegisterCreationOptionsRequest[] newArray(int i) {
        return new RegisterCreationOptionsRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final RegisterCreationOptionsRequest createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = "";
        byte[] bArrCreateByteArray = null;
        byte[] bArrCreateByteArray2 = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
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
                                strCreateString = SafeParcelReader.createString(parcel, header);
                            }
                        } else {
                            strCreateString3 = SafeParcelReader.createString(parcel, header);
                        }
                    } else {
                        strCreateString2 = SafeParcelReader.createString(parcel, header);
                    }
                } else {
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                }
            } else {
                bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new RegisterCreationOptionsRequest(bArrCreateByteArray, bArrCreateByteArray2, strCreateString2, strCreateString3, strCreateString);
    }
}
