package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.q63;
import defpackage.rl3;
import defpackage.sl3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "ActivityTransitionRequestCreator")
@SafeParcelable.Reserved({1000})
public class ActivityTransitionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzo();
    public static final sl3 e = new sl3(13);
    public final List a;
    public final String b;
    public final List c;
    public final String d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (Objects.equal(this.a, activityTransitionRequest.a) && Objects.equal(this.b, activityTransitionRequest.b) && Objects.equal(this.d, activityTransitionRequest.d) && Objects.equal(this.c, activityTransitionRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.c);
        int length = strValueOf.length();
        String str = this.b;
        int length2 = String.valueOf(str).length();
        int length3 = strValueOf2.length();
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(rl3.v(length, 79, length2, length3, String.valueOf(str2).length()));
        q63.y(sb, "ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='", str);
        q63.y(sb, "', mClients=", strValueOf2, ", mAttributionTag=", str2);
        sb.append(']');
        return sb.toString();
    }

    public ActivityTransitionRequest(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        boolean z;
        List listUnmodifiableList;
        Preconditions.checkNotNull(arrayList, "transitions can't be null");
        int i = 0;
        if (arrayList.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "transitions can't be empty.");
        Preconditions.checkNotNull(arrayList);
        TreeSet treeSet = new TreeSet(e);
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ActivityTransition activityTransition = (ActivityTransition) obj;
            Preconditions.checkArgument(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.a = Collections.unmodifiableList(arrayList);
        this.b = str;
        if (arrayList2 == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        this.c = listUnmodifiableList;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
