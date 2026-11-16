package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        byte[] bArrCreateByteArray = null;
        Strategy strategy = null;
        byte[] bArrCreateByteArray2 = null;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = false;
        int i3 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 2:
                    z7 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 8:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 10:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 15:
                    iArrCreateIntArray2 = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 16:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 17:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 18:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel, header, Strategy.CREATOR);
                    i3 = i3;
                    break;
                case 19:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        ConnectionOptions connectionOptions = new ConnectionOptions();
        connectionOptions.a = z;
        connectionOptions.b = z7;
        connectionOptions.c = z8;
        connectionOptions.d = z9;
        connectionOptions.e = z10;
        connectionOptions.f = z2;
        connectionOptions.g = z6;
        connectionOptions.h = z5;
        connectionOptions.i = bArrCreateByteArray;
        connectionOptions.j = z11;
        connectionOptions.k = z4;
        connectionOptions.l = z3;
        connectionOptions.m = i3;
        connectionOptions.n = i2;
        connectionOptions.o = iArrCreateIntArray2;
        connectionOptions.p = iArrCreateIntArray;
        connectionOptions.q = bArrCreateByteArray2;
        connectionOptions.r = strategy;
        connectionOptions.s = i;
        return connectionOptions;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionOptions[i];
    }
}
