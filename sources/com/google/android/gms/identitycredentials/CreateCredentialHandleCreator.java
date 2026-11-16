package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class CreateCredentialHandleCreator implements Parcelable.Creator<CreateCredentialHandle> {
    @Override // android.os.Parcelable.Creator
    public final CreateCredentialHandle[] newArray(int i) {
        return new CreateCredentialHandle[i];
    }

    @Override // android.os.Parcelable.Creator
    public final CreateCredentialHandle createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        PendingIntent pendingIntent = null;
        CreateCredentialResponse createCredentialResponse = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    SafeParcelReader.skipUnknownField(parcel, header);
                } else {
                    createCredentialResponse = (CreateCredentialResponse) SafeParcelReader.createParcelable(parcel, header, CreateCredentialResponse.CREATOR);
                }
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel, header, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new CreateCredentialHandle(pendingIntent, createCredentialResponse);
    }
}
