package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.zzk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "OnEndpointDistanceChangedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzlc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlc> CREATOR = new zzld();
    public final String a;
    public final int b;
    public final com.google.android.gms.nearby.connection.zzu c;
    public final int d;
    public final zzk e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlc) {
            zzlc zzlcVar = (zzlc) obj;
            if (Objects.equal(this.a, zzlcVar.a) && Objects.equal(Integer.valueOf(this.b), Integer.valueOf(zzlcVar.b)) && Objects.equal(this.c, zzlcVar.c) && Objects.equal(Integer.valueOf(this.d), Integer.valueOf(zzlcVar.d)) && Objects.equal(this.e, zzlcVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Integer.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e);
    }

    public zzlc(String str, int i, com.google.android.gms.nearby.connection.zzu zzuVar, int i2, zzk zzkVar) {
        this.a = str;
        this.b = i;
        this.c = zzuVar;
        this.d = i2;
        this.e = zzkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeParcelable(parcel, 5, this.e, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzlc() {
        this.d = 0;
    }
}
