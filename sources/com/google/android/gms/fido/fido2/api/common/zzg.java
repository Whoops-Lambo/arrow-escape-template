package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.ap4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ap4 ap4VarR;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ap4 ap4VarR2 = null;
        byte[] bArrCreateByteArray = null;
        byte[] bArrCreateByteArray2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    SafeParcelReader.skipUnknownField(parcel, header);
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
        if (bArrCreateByteArray2 != null) {
            ap4VarR2 = zzgx.r(bArrCreateByteArray2.length, bArrCreateByteArray2);
        }
        return new zzf(ap4VarR, ap4VarR2);
    }
}
