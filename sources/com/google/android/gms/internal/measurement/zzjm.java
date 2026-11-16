package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzjm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjl[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        byte[] bArrCreateByteArray = null;
        byte[][] bArrCreateByteArrayArray = null;
        byte[][] bArrCreateByteArrayArray2 = null;
        byte[][] bArrCreateByteArrayArray3 = null;
        byte[][] bArrCreateByteArrayArray4 = null;
        int[] iArrCreateIntArray = null;
        byte[][] bArrCreateByteArrayArray5 = null;
        int[] iArrCreateIntArray2 = null;
        byte[][] bArrCreateByteArrayArray6 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 4:
                    bArrCreateByteArrayArray = SafeParcelReader.createByteArrayArray(parcel, header);
                    break;
                case 5:
                    bArrCreateByteArrayArray2 = SafeParcelReader.createByteArrayArray(parcel, header);
                    break;
                case 6:
                    bArrCreateByteArrayArray3 = SafeParcelReader.createByteArrayArray(parcel, header);
                    break;
                case 7:
                    bArrCreateByteArrayArray4 = SafeParcelReader.createByteArrayArray(parcel, header);
                    break;
                case 8:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 9:
                    bArrCreateByteArrayArray5 = SafeParcelReader.createByteArrayArray(parcel, header);
                    break;
                case 10:
                    iArrCreateIntArray2 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 11:
                    bArrCreateByteArrayArray6 = SafeParcelReader.createByteArrayArray(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzjl(strCreateString, bArrCreateByteArray, bArrCreateByteArrayArray, bArrCreateByteArrayArray2, bArrCreateByteArrayArray3, bArrCreateByteArrayArray4, iArrCreateIntArray, bArrCreateByteArrayArray5, iArrCreateIntArray2, bArrCreateByteArrayArray6);
    }
}
