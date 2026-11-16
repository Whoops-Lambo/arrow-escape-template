package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbf();
    public int a = 102;
    public long b = 3600000;
    public long c = 600000;
    public boolean d = false;
    public long e = Long.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public float g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public long h = 0;
    public boolean i = false;

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.a != locationRequest.a) {
            return false;
        }
        long j = this.b;
        long j2 = locationRequest.b;
        if (j != j2 || this.c != locationRequest.c || this.d != locationRequest.d || this.e != locationRequest.e || this.f != locationRequest.f || this.g != locationRequest.g) {
            return false;
        }
        long j3 = this.h;
        if (j3 >= j) {
            j = j3;
        }
        long j4 = locationRequest.h;
        if (j4 >= j2) {
            j2 = j4;
        }
        return j == j2 && this.i == locationRequest.i;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.g), Long.valueOf(this.h));
    }

    public final String toString() {
        String str;
        int i = this.f;
        float f = this.g;
        long j = this.h;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder("Request[");
        int i2 = this.a;
        if (i2 == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i2 == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i2 != 104) {
            str = i2 != 105 ? "???" : "PRIORITY_NO_POWER";
        } else {
            str = "PRIORITY_LOW_POWER";
        }
        sb.append(str);
        if (i2 != 105) {
            sb.append(" requested=");
            sb.append(j2);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.c);
        sb.append("ms");
        if (j > j2) {
            sb.append(" maxWait=");
            sb.append(j);
            sb.append("ms");
        }
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            sb.append(" smallestDisplacement=");
            sb.append(f);
            sb.append("m");
        }
        long j3 = this.e;
        if (j3 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j3 - jElapsedRealtime);
            sb.append("ms");
        }
        if (i != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i);
        }
        sb.append(']');
        return sb.toString();
    }

    @Deprecated
    public LocationRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeLong(parcel, 3, this.c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.writeLong(parcel, 5, this.e);
        SafeParcelWriter.writeInt(parcel, 6, this.f);
        SafeParcelWriter.writeFloat(parcel, 7, this.g);
        SafeParcelWriter.writeLong(parcel, 8, this.h);
        SafeParcelWriter.writeBoolean(parcel, 9, this.i);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
