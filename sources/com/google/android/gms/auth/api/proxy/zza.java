package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        byte[] bArrCreateByteArray = null;
        Bundle bundleCreateBundle = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                if (fieldId != 1000) {
                                    SafeParcelReader.skipUnknownField(parcel, header);
                                } else {
                                    i = SafeParcelReader.readInt(parcel, header);
                                }
                            } else {
                                bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                            }
                        } else {
                            bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                        }
                    } else {
                        j = SafeParcelReader.readLong(parcel, header);
                    }
                } else {
                    i2 = SafeParcelReader.readInt(parcel, header);
                }
            } else {
                strCreateString = SafeParcelReader.createString(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ProxyRequest(i, strCreateString, i2, j, bArrCreateByteArray, bundleCreateBundle);
    }
}
