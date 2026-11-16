package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
public final class zzbe extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();
    public final String a;
    public final long b;
    public final short c;
    public final double d;
    public final double e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.f == zzbeVar.f && this.d == zzbeVar.d && this.e == zzbeVar.e && this.c == zzbeVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.e);
        return ((((Float.floatToIntBits(this.f) + ((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31)) * 31) + this.c) * 31) + this.g;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s = this.c;
        if (s != -1) {
            str = s != 1 ? "UNKNOWN" : "CIRCLE";
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.g), Double.valueOf(this.d), Double.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.h / 1000), Integer.valueOf(this.i), Long.valueOf(this.b));
    }

    public zzbe(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        String str2;
        if (str != null && str.length() <= 100) {
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (d <= 90.0d && d >= -90.0d) {
                    if (d2 <= 180.0d && d2 >= -180.0d) {
                        int i4 = i & 7;
                        if (i4 != 0) {
                            this.c = s;
                            this.a = str;
                            this.d = d;
                            this.e = d2;
                            this.f = f;
                            this.b = j;
                            this.g = i4;
                            this.h = i2;
                            this.i = i3;
                            return;
                        }
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("No supported transition specified: ");
                        sb.append(i);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder(43);
                    sb2.append("invalid longitude: ");
                    sb2.append(d2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder(42);
                sb3.append("invalid latitude: ");
                sb3.append(d);
                throw new IllegalArgumentException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder(31);
            sb4.append("invalid radius: ");
            sb4.append(f);
            throw new IllegalArgumentException(sb4.toString());
        }
        String strValueOf = String.valueOf(str);
        if (strValueOf.length() != 0) {
            str2 = "requestId is null or too long: ".concat(strValueOf);
        } else {
            str2 = new String("requestId is null or too long: ");
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeShort(parcel, 3, this.c);
        SafeParcelWriter.writeDouble(parcel, 4, this.d);
        SafeParcelWriter.writeDouble(parcel, 5, this.e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f);
        SafeParcelWriter.writeInt(parcel, 7, this.g);
        SafeParcelWriter.writeInt(parcel, 8, this.h);
        SafeParcelWriter.writeInt(parcel, 9, this.i);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
