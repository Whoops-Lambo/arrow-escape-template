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
@SafeParcelable.Class(creator = "RangingParametersParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzpy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpy> CREATOR = new zzpz();
    public int a;
    public int b;
    public byte[] c;
    public zzqv d;
    public int e;
    public zzrv[] f;
    public int g;
    public byte[] h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzpy) {
            zzpy zzpyVar = (zzpy) obj;
            if (Objects.equal(Integer.valueOf(this.a), Integer.valueOf(zzpyVar.a)) && Objects.equal(Integer.valueOf(this.b), Integer.valueOf(zzpyVar.b)) && Arrays.equals(this.c, zzpyVar.c) && Objects.equal(this.d, zzpyVar.d) && Objects.equal(Integer.valueOf(this.e), Integer.valueOf(zzpyVar.e)) && Arrays.equals(this.f, zzpyVar.f) && Objects.equal(Integer.valueOf(this.g), Integer.valueOf(zzpyVar.g)) && Arrays.equals(this.h, zzpyVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), this.d, Integer.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(this.g), Integer.valueOf(Arrays.hashCode(this.h)));
    }

    private zzpy() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeByteArray(parcel, 3, this.c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.f, i, false);
        SafeParcelWriter.writeInt(parcel, 7, this.g);
        SafeParcelWriter.writeByteArray(parcel, 8, this.h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
