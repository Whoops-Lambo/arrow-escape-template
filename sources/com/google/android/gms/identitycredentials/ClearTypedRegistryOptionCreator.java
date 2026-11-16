package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ClearTypedRegistryOptionCreator implements Parcelable.Creator<ClearRegistryRequest.ClearTypedRegistryOption> {
    @Override // android.os.Parcelable.Creator
    public final ClearRegistryRequest.ClearTypedRegistryOption[] newArray(int i) {
        return new ClearRegistryRequest.ClearTypedRegistryOption[i];
    }

    @Override // android.os.Parcelable.Creator
    public final ClearRegistryRequest.ClearTypedRegistryOption createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        boolean z = false;
        boolean z2 = false;
        ArrayList<String> arrayListCreateStringList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, header);
                        } else {
                            arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                        }
                    } else {
                        z2 = SafeParcelReader.readBoolean(parcel, header);
                    }
                } else {
                    strCreateString = SafeParcelReader.createString(parcel, header);
                }
            } else {
                z = SafeParcelReader.readBoolean(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ClearRegistryRequest.ClearTypedRegistryOption(z, strCreateString, z2, arrayListCreateStringList);
    }
}
