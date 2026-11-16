package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzk implements Parcelable.Creator<ActivityRecognitionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityRecognitionResult[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }

    @Override // android.os.Parcelable.Creator
    public final ActivityRecognitionResult createFromParcel(Parcel parcel) {
        boolean z;
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayListCreateTypedList = null;
        boolean z2 = false;
        Bundle bundleCreateBundle = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
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
                                bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                            }
                        } else {
                            i = SafeParcelReader.readInt(parcel, header);
                        }
                    } else {
                        j2 = SafeParcelReader.readLong(parcel, header);
                    }
                } else {
                    j = SafeParcelReader.readLong(parcel, header);
                }
            } else {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, DetectedActivity.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult();
        if (arrayListCreateTypedList != null && arrayListCreateTypedList.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Must have at least 1 detected activity");
        if (j > 0 && j2 > 0) {
            z2 = true;
        }
        Preconditions.checkArgument(z2, "Must set times");
        activityRecognitionResult.a = arrayListCreateTypedList;
        activityRecognitionResult.b = j;
        activityRecognitionResult.c = j2;
        activityRecognitionResult.d = i;
        activityRecognitionResult.e = bundleCreateBundle;
        return activityRecognitionResult;
    }
}
