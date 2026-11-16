package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.pm.ShortcutInfo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RequiresApi
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzg[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList<String> arrayListCreateStringList = null;
        ArrayList arrayListCreateTypedList = null;
        ArrayList<String> arrayListCreateStringList2 = null;
        ArrayList<String> arrayListCreateStringList3 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, header);
                        } else {
                            arrayListCreateStringList3 = SafeParcelReader.createStringList(parcel, header);
                        }
                    } else {
                        arrayListCreateStringList2 = SafeParcelReader.createStringList(parcel, header);
                    }
                } else {
                    arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, ShortcutInfo.CREATOR);
                }
            } else {
                arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzg(arrayListCreateStringList, arrayListCreateTypedList, arrayListCreateStringList2, arrayListCreateStringList3);
    }
}
