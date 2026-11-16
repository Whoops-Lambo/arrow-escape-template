package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "RangingCapabilitiesParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzps extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzps> CREATOR = new zzpt();
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int[] f;
    public int[] g;
    public float h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzps) {
            zzps zzpsVar = (zzps) obj;
            if (Objects.equal(Boolean.valueOf(this.a), Boolean.valueOf(zzpsVar.a)) && Objects.equal(Boolean.valueOf(this.b), Boolean.valueOf(zzpsVar.b)) && Objects.equal(Boolean.valueOf(this.c), Boolean.valueOf(zzpsVar.c)) && Objects.equal(Integer.valueOf(this.d), Integer.valueOf(zzpsVar.d)) && Objects.equal(Integer.valueOf(this.e), Integer.valueOf(zzpsVar.e)) && Arrays.equals(this.f, zzpsVar.f) && Arrays.equals(this.g, zzpsVar.g) && Objects.equal(Float.valueOf(this.h), Float.valueOf(zzpsVar.h))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), Float.valueOf(this.h));
    }

    private zzps() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.a);
        SafeParcelWriter.writeBoolean(parcel, 2, this.b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.c);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeIntArray(parcel, 6, this.f, false);
        SafeParcelWriter.writeIntArray(parcel, 7, this.g, false);
        SafeParcelWriter.writeFloat(parcel, 8, this.h);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
