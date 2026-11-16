package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "LocationRequestInternalCreator")
@SafeParcelable.Reserved({1000, 2, 3, 4})
public final class zzba extends AbstractSafeParcelable {
    public final LocationRequest a;
    public final List b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final long k;
    public static final List l = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    public static zzba d(LocationRequest locationRequest) {
        return new zzba(locationRequest, l, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (Objects.equal(this.a, zzbaVar.a) && Objects.equal(this.b, zzbaVar.b) && Objects.equal(this.c, zzbaVar.c) && this.d == zzbaVar.d && this.e == zzbaVar.e && this.f == zzbaVar.f && Objects.equal(this.g, zzbaVar.g) && this.h == zzbaVar.h && this.i == zzbaVar.i && Objects.equal(this.j, zzbaVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        String str = this.c;
        if (str != null) {
            sb.append(" tag=");
            sb.append(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            sb.append(" moduleId=");
            sb.append(str2);
        }
        String str3 = this.j;
        if (str3 != null) {
            sb.append(" contextAttributionTag=");
            sb.append(str3);
        }
        sb.append(" hideAppOps=");
        sb.append(this.d);
        sb.append(" clients=");
        sb.append(this.b);
        sb.append(" forceCoarseLocation=");
        sb.append(this.e);
        if (this.f) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.h) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.i) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    public zzba(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.a = locationRequest;
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str2;
        this.h = z4;
        this.i = z5;
        this.j = str3;
        this.k = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.b, false);
        SafeParcelWriter.writeString(parcel, 6, this.c, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.d);
        SafeParcelWriter.writeBoolean(parcel, 8, this.e);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f);
        SafeParcelWriter.writeString(parcel, 10, this.g, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.h);
        SafeParcelWriter.writeBoolean(parcel, 12, this.i);
        SafeParcelWriter.writeString(parcel, 13, this.j, false);
        SafeParcelWriter.writeLong(parcel, 14, this.k);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
