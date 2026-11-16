package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zznh;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Message[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        byte[] bArrCreateByteArray = null;
        String strCreateString = null;
        String strCreateString2 = null;
        zznh[] zznhVarArr = null;
        int i = 0;
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
                                j = SafeParcelReader.readLong(parcel, header);
                            }
                        } else {
                            zznhVarArr = (zznh[]) SafeParcelReader.createTypedArray(parcel, header, zznh.CREATOR);
                        }
                    } else {
                        strCreateString = SafeParcelReader.createString(parcel, header);
                    }
                } else {
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                }
            } else {
                bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new Message(i, bArrCreateByteArray, strCreateString, strCreateString2, zznhVarArr, j);
    }
}
