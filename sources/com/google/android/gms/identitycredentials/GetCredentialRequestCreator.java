package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class GetCredentialRequestCreator implements Parcelable.Creator<GetCredentialRequest> {
    @Override // android.os.Parcelable.Creator
    public final GetCredentialRequest[] newArray(int i) {
        return new GetCredentialRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final GetCredentialRequest createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayListCreateTypedList = null;
        Bundle bundleCreateBundle = null;
        String strCreateString = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, header);
                        } else {
                            resultReceiver = (ResultReceiver) SafeParcelReader.createParcelable(parcel, header, ResultReceiver.CREATOR);
                        }
                    } else {
                        strCreateString = SafeParcelReader.createString(parcel, header);
                    }
                } else {
                    bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                }
            } else {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, CredentialOption.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GetCredentialRequest(arrayListCreateTypedList, bundleCreateBundle, strCreateString, resultReceiver);
    }
}
