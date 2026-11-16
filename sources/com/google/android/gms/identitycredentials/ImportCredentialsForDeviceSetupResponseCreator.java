package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ImportCredentialsForDeviceSetupResponseCreator implements Parcelable.Creator<ImportCredentialsForDeviceSetupResponse> {
    @Override // android.os.Parcelable.Creator
    public final ImportCredentialsForDeviceSetupResponse[] newArray(int i) {
        return new ImportCredentialsForDeviceSetupResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final ImportCredentialsForDeviceSetupResponse createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) != 1) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ImportCredentialsForDeviceSetupResponse(bundleCreateBundle);
    }
}
