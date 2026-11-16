package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.nearby.zzne;
import com.google.android.gms.internal.nearby.zznj;
import com.google.android.gms.nearby.messages.internal.zzac;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageFilter[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        ArrayList arrayListCreateTypedList = null;
        ArrayList arrayListCreateTypedList2 = null;
        ArrayList arrayListCreateTypedList3 = null;
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
                                i2 = SafeParcelReader.readInt(parcel, header);
                            }
                        } else {
                            arrayListCreateTypedList3 = SafeParcelReader.createTypedList(parcel, header, zzne.CREATOR);
                        }
                    } else {
                        z = SafeParcelReader.readBoolean(parcel, header);
                    }
                } else {
                    arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header, zznj.CREATOR);
                }
            } else {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzac.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new MessageFilter(i, arrayListCreateTypedList, arrayListCreateTypedList2, z, arrayListCreateTypedList3, i2);
    }
}
