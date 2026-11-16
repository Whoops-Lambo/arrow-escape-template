package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzs;
import defpackage.h50;
import defpackage.jc1;
import defpackage.q63;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "DeviceOrientationRequestInternalCreator")
public final class zzj extends AbstractSafeParcelable {
    public final zzs a;
    public final List b;
    public final String c;
    public static final List d = Collections.EMPTY_LIST;
    public static final zzs e = new zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return Objects.equal(this.a, zzjVar.a) && Objects.equal(this.b, zzjVar.b) && Objects.equal(this.c, zzjVar.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        String str = this.c;
        StringBuilder sb = new StringBuilder(h50.d(length, 77, length2, String.valueOf(str).length()));
        q63.y(sb, "DeviceOrientationRequestInternal{deviceOrientationRequest=", strValueOf, ", clients=", strValueOf2);
        return jc1.o(", tag='", str, sb, "'}");
    }

    public zzj(zzs zzsVar, List list, String str) {
        this.a = zzsVar;
        this.b = list;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
