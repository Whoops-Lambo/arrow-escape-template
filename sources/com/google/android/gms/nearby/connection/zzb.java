package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = true;
        boolean z13 = true;
        boolean z14 = true;
        boolean z15 = true;
        byte[] bArrCreateByteArray = null;
        Strategy strategy = null;
        byte[] bArrCreateByteArray2 = null;
        zzw[] zzwVarArr = null;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        byte[] bArrCreateByteArray3 = null;
        long j = 0;
        boolean z16 = false;
        boolean z17 = false;
        ParcelUuid parcelUuid = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel, header, Strategy.CREATOR);
                    z17 = z17;
                    break;
                case 2:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    z17 = z17;
                    break;
                case 3:
                    z9 = SafeParcelReader.readBoolean(parcel, header);
                    z17 = z17;
                    break;
                case 4:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    z17 = z17;
                    break;
                case 5:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    z17 = z17;
                    break;
                case 6:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    z17 = z17;
                    break;
                case 7:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    i = i;
                    break;
                case 8:
                    parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel, header, ParcelUuid.CREATOR);
                    z17 = z17;
                    break;
                case 9:
                    z7 = SafeParcelReader.readBoolean(parcel, header);
                    z17 = z17;
                    break;
                case 10:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    z17 = z17;
                    break;
                case 11:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    z17 = z17;
                    break;
                case 12:
                    z16 = SafeParcelReader.readBoolean(parcel, header);
                    i = i;
                    break;
                case 13:
                    z17 = SafeParcelReader.readBoolean(parcel, header);
                    i = i;
                    break;
                case 14:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    z17 = z17;
                    break;
                case 15:
                    i4 = SafeParcelReader.readInt(parcel, header);
                    z17 = z17;
                    break;
                case 16:
                    i3 = SafeParcelReader.readInt(parcel, header);
                    z17 = z17;
                    break;
                case 17:
                    bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                    z17 = z17;
                    break;
                case 18:
                    j = SafeParcelReader.readLong(parcel, header);
                    z17 = z17;
                    i = i;
                    break;
                case 19:
                    zzwVarArr = (zzw[]) SafeParcelReader.createTypedArray(parcel, header, zzw.CREATOR);
                    z17 = z17;
                    break;
                case 20:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    i = i;
                    break;
                case 21:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    i = i;
                    break;
                case 22:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    i = i;
                    break;
                case 23:
                    z13 = SafeParcelReader.readBoolean(parcel, header);
                    i = i;
                    break;
                case 24:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    i = i;
                    break;
                case 25:
                    iArrCreateIntArray2 = SafeParcelReader.createIntArray(parcel, header);
                    i = i;
                    break;
                case 26:
                    z14 = SafeParcelReader.readBoolean(parcel, header);
                    i = i;
                    break;
                case 27:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    i = i;
                    break;
                case 28:
                    bArrCreateByteArray3 = SafeParcelReader.createByteArray(parcel, header);
                    i = i;
                    break;
                case 29:
                    z15 = SafeParcelReader.readBoolean(parcel, header);
                    i = i;
                    break;
                case 30:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    i = i;
                    break;
            }
            i = i;
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        AdvertisingOptions advertisingOptions = new AdvertisingOptions();
        advertisingOptions.a = strategy;
        advertisingOptions.b = z8;
        advertisingOptions.c = z9;
        advertisingOptions.d = z10;
        advertisingOptions.e = z11;
        advertisingOptions.f = bArrCreateByteArray;
        advertisingOptions.g = z;
        advertisingOptions.h = parcelUuid;
        advertisingOptions.i = z7;
        advertisingOptions.j = z6;
        advertisingOptions.k = z5;
        advertisingOptions.l = z16;
        advertisingOptions.m = z17;
        advertisingOptions.n = z4;
        advertisingOptions.o = i4;
        advertisingOptions.p = i3;
        advertisingOptions.q = bArrCreateByteArray2;
        advertisingOptions.r = j;
        advertisingOptions.s = zzwVarArr;
        advertisingOptions.t = z3;
        advertisingOptions.u = z12;
        advertisingOptions.v = z2;
        advertisingOptions.w = z13;
        advertisingOptions.x = iArrCreateIntArray;
        advertisingOptions.y = iArrCreateIntArray2;
        advertisingOptions.z = z14;
        advertisingOptions.A = i2;
        advertisingOptions.B = bArrCreateByteArray3;
        advertisingOptions.C = z15;
        advertisingOptions.D = i;
        return advertisingOptions;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdvertisingOptions[i];
    }
}
