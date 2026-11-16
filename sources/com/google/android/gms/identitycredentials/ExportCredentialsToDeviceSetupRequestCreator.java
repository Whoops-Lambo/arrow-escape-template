package com.google.android.gms.identitycredentials;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class ExportCredentialsToDeviceSetupRequestCreator implements Parcelable.Creator<ExportCredentialsToDeviceSetupRequest> {
    @Override // android.os.Parcelable.Creator
    public final ExportCredentialsToDeviceSetupRequest[] newArray(int i) {
        return new ExportCredentialsToDeviceSetupRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final ExportCredentialsToDeviceSetupRequest createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Uri uri = null;
        Bundle bundleCreateBundle = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    SafeParcelReader.skipUnknownField(parcel, header);
                } else {
                    bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                }
            } else {
                uri = (Uri) SafeParcelReader.createParcelable(parcel, header, Uri.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ExportCredentialsToDeviceSetupRequest(uri, bundleCreateBundle);
    }
}
