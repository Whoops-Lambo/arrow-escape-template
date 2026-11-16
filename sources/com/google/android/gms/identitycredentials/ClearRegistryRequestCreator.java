package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ClearRegistryRequestCreator implements Parcelable.Creator<ClearRegistryRequest> {
    @Override // android.os.Parcelable.Creator
    public final ClearRegistryRequest[] newArray(int i) {
        return new ClearRegistryRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final ClearRegistryRequest createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ClearRegistryRequest.ClearTypedRegistryOption clearTypedRegistryOption = null;
        boolean z = true;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    SafeParcelReader.skipUnknownField(parcel, header);
                } else {
                    clearTypedRegistryOption = (ClearRegistryRequest.ClearTypedRegistryOption) SafeParcelReader.createParcelable(parcel, header, ClearRegistryRequest.ClearTypedRegistryOption.CREATOR);
                }
            } else {
                z = SafeParcelReader.readBoolean(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ClearRegistryRequest(z, clearTypedRegistryOption);
    }
}
