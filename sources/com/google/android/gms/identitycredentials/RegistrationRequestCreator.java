package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class RegistrationRequestCreator implements Parcelable.Creator<RegistrationRequest> {
    @Override // android.os.Parcelable.Creator
    public final RegistrationRequest[] newArray(int i) {
        return new RegistrationRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final RegistrationRequest createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        List listCreateStringList = Collections.EMPTY_LIST;
        String strCreateString = "";
        String strCreateString2 = strCreateString;
        String strCreateString3 = strCreateString2;
        String strCreateString4 = strCreateString3;
        byte[] bArrCreateByteArray = null;
        byte[] bArrCreateByteArray2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 2:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    listCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 6:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new RegistrationRequest(bArrCreateByteArray, bArrCreateByteArray2, strCreateString, strCreateString2, listCreateStringList, strCreateString3, strCreateString4);
    }
}
