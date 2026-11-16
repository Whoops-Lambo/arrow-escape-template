package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaid implements Parcelable.Creator<zzaia> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaia[] newArray(int i) {
        return new zzaia[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaia createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        Long longObject = null;
        String strCreateString3 = null;
        Long longObject2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        if (fieldId != 5) {
                            if (fieldId != 6) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                longObject2 = SafeParcelReader.readLongObject(parcel, header);
                            }
                        } else {
                            strCreateString3 = SafeParcelReader.createString(parcel, header);
                        }
                    } else {
                        longObject = SafeParcelReader.readLongObject(parcel, header);
                    }
                } else {
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                }
            } else {
                strCreateString = SafeParcelReader.createString(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzaia(strCreateString, strCreateString2, longObject, strCreateString3, longObject2);
    }
}
