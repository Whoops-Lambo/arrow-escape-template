package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.ap4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzai[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ap4 ap4VarR;
        ap4 ap4VarR2;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        ap4 ap4VarR3 = null;
        byte[] bArrCreateByteArray = null;
        byte[] bArrCreateByteArray2 = null;
        byte[] bArrCreateByteArray3 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, header);
                        } else {
                            i = SafeParcelReader.readInt(parcel, header);
                        }
                    } else {
                        bArrCreateByteArray3 = SafeParcelReader.createByteArray(parcel, header);
                    }
                } else {
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                }
            } else {
                bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        if (bArrCreateByteArray == null) {
            ap4VarR = null;
        } else {
            ap4VarR = zzgx.r(bArrCreateByteArray.length, bArrCreateByteArray);
        }
        if (bArrCreateByteArray2 == null) {
            ap4VarR2 = null;
        } else {
            ap4VarR2 = zzgx.r(bArrCreateByteArray2.length, bArrCreateByteArray2);
        }
        if (bArrCreateByteArray3 != null) {
            ap4VarR3 = zzgx.r(bArrCreateByteArray3.length, bArrCreateByteArray3);
        }
        return new zzai(ap4VarR, ap4VarR2, ap4VarR3, i);
    }
}
