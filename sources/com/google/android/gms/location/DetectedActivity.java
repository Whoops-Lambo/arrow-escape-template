package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.C4664b4;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DetectedActivityCreator")
@SafeParcelable.Reserved({1000})
public class DetectedActivity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzr();
    public int a;
    public int b;

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.a == detectedActivity.a && this.b == detectedActivity.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        String string;
        int i = this.a;
        if (i > 22 || i < 0) {
            i = 4;
        }
        if (i == 0) {
            string = "IN_VEHICLE";
        } else if (i == 1) {
            string = "ON_BICYCLE";
        } else if (i == 2) {
            string = "ON_FOOT";
        } else if (i == 3) {
            string = "STILL";
        } else if (i == 4) {
            string = "UNKNOWN";
        } else if (i == 5) {
            string = "TILTING";
        } else if (i == 7) {
            string = "WALKING";
        } else if (i == 8) {
            string = "RUNNING";
        } else if (i != 16) {
            string = i != 17 ? Integer.toString(i) : "IN_RAIL_VEHICLE";
        } else {
            string = "IN_ROAD_VEHICLE";
        }
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 48);
        n30.t(i2, "DetectedActivity [type=", string, ", confidence=", sb);
        sb.append(C4664b4.j.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
