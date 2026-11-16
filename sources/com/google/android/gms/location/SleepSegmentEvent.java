package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "SleepSegmentEventCreator")
@SafeParcelable.Reserved({1000})
public class SleepSegmentEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new zzbv();
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;

    public final boolean equals(Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.a == sleepSegmentEvent.a && this.b == sleepSegmentEvent.b && this.c == sleepSegmentEvent.c && this.d == sleepSegmentEvent.d && this.e == sleepSegmentEvent.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(84);
        sb.append("startMillis=");
        sb.append(this.a);
        sb.append(", endMillis=");
        sb.append(this.b);
        sb.append(", status=");
        sb.append(this.c);
        return sb.toString();
    }

    public SleepSegmentEvent(int i, int i2, int i3, long j, long j2) {
        boolean z;
        if (j <= j2) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
