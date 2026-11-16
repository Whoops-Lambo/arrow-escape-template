package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Strategy strategy = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        ParcelUuid parcelUuid = null;
        byte[] bArrCreateByteArray = null;
        int[] iArrCreateIntArray = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel, header, Strategy.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    z4 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 4:
                    z5 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 5:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 6:
                    parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel, header, ParcelUuid.CREATOR);
                    break;
                case 7:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 8:
                    z6 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    z7 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z8 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    z3 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 12:
                    i = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    i2 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 15:
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 16:
                    iArrCreateIntArray = SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 17:
                    SafeParcelReader.readBoolean(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        DiscoveryOptions discoveryOptions = new DiscoveryOptions();
        discoveryOptions.p = true;
        discoveryOptions.a = strategy;
        discoveryOptions.b = z;
        discoveryOptions.c = z4;
        discoveryOptions.d = z5;
        discoveryOptions.e = z2;
        discoveryOptions.f = parcelUuid;
        discoveryOptions.g = z6;
        discoveryOptions.h = z7;
        discoveryOptions.i = z8;
        discoveryOptions.j = z3;
        discoveryOptions.k = i;
        discoveryOptions.l = i2;
        discoveryOptions.m = bArrCreateByteArray;
        discoveryOptions.n = j;
        discoveryOptions.o = iArrCreateIntArray;
        return discoveryOptions;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DiscoveryOptions[i];
    }
}
