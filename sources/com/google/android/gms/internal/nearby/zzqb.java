package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzqb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzqa[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = -128;
        long j = 0;
        zzpu zzpuVar = null;
        zzpu zzpuVar2 = null;
        zzpu zzpuVar3 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            if (fieldId != 5) {
                                SafeParcelReader.skipUnknownField(parcel, header);
                            } else {
                                i = SafeParcelReader.readInt(parcel, header);
                            }
                        } else {
                            j = SafeParcelReader.readLong(parcel, header);
                        }
                    } else {
                        zzpuVar3 = (zzpu) SafeParcelReader.createParcelable(parcel, header, zzpu.CREATOR);
                    }
                } else {
                    zzpuVar2 = (zzpu) SafeParcelReader.createParcelable(parcel, header, zzpu.CREATOR);
                }
            } else {
                zzpuVar = (zzpu) SafeParcelReader.createParcelable(parcel, header, zzpu.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzqa(zzpuVar, zzpuVar2, zzpuVar3, j, i);
    }
}
