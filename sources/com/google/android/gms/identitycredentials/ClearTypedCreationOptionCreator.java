package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ClearTypedCreationOptionCreator implements Parcelable.Creator<ClearCreationOptionsRequest.ClearTypedCreationOption> {
    @Override // android.os.Parcelable.Creator
    public final ClearCreationOptionsRequest.ClearTypedCreationOption[] newArray(int i) {
        return new ClearCreationOptionsRequest.ClearTypedCreationOption[i];
    }

    @Override // android.os.Parcelable.Creator
    public final ClearCreationOptionsRequest.ClearTypedCreationOption createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        boolean z = false;
        ArrayList<String> arrayListCreateStringList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    }
                } else {
                    strCreateString = SafeParcelReader.createString(parcel, header);
                }
            } else {
                z = SafeParcelReader.readBoolean(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ClearCreationOptionsRequest.ClearTypedCreationOption(z, strCreateString, arrayListCreateStringList);
    }
}
