package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "ActivityTransitionResultCreator")
@SafeParcelable.Reserved({1000})
public class ActivityTransitionResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzp();
    public final List a;
    public final Bundle b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ActivityTransitionResult) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ActivityTransitionResult(Bundle bundle, ArrayList arrayList) {
        boolean z;
        this.b = null;
        Preconditions.checkNotNull(arrayList, "transitionEvents list can't be null.");
        if (!arrayList.isEmpty()) {
            for (int i = 1; i < arrayList.size(); i++) {
                if (((ActivityTransitionEvent) arrayList.get(i)).c >= ((ActivityTransitionEvent) arrayList.get(i - 1)).c) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z);
            }
        }
        this.a = Collections.unmodifiableList(arrayList);
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.a, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
