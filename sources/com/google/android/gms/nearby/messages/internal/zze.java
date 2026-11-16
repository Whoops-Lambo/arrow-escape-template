package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Distance;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "DistanceImplCreator")
public final class zze extends AbstractSafeParcelable implements Distance {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    public final int a;
    public final int b;
    public final double c;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof zze) {
                zze zzeVar = (zze) obj;
                if (this.b == zzeVar.b) {
                    double d = this.c;
                    if (((Double.isNaN(d) && Double.isNaN(zzeVar.K())) ? 0 : Double.compare(d, zzeVar.K())) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.nearby.messages.Distance
    public final double K() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Distance distance) {
        Distance distance2 = distance;
        double d = this.c;
        if (Double.isNaN(d) && Double.isNaN(distance2.K())) {
            return 0;
        }
        return Double.compare(d, distance2.K());
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.b), Double.valueOf(this.c));
    }

    public final String toString() {
        return String.format(Locale.US, "(%.1fm, %s)", Double.valueOf(this.c), this.b != 1 ? "UNKNOWN" : "LOW");
    }

    public zze(int i, int i2, double d) {
        this.a = i;
        this.b = i2;
        this.c = d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeDouble(parcel, 3, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
