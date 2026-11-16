package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "RangingPositionParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqa> CREATOR = new zzqb();
    public final zzpu a;
    public final zzpu b;
    public final zzpu c;
    public final long d;
    public final int e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqa) {
            zzqa zzqaVar = (zzqa) obj;
            if (Objects.equal(this.a, zzqaVar.a) && Objects.equal(this.b, zzqaVar.b) && Objects.equal(this.c, zzqaVar.c) && Objects.equal(Long.valueOf(this.d), Long.valueOf(zzqaVar.d)) && Objects.equal(Integer.valueOf(this.e), Integer.valueOf(zzqaVar.e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, Long.valueOf(this.d), Integer.valueOf(this.e));
    }

    public zzqa(zzpu zzpuVar, zzpu zzpuVar2, zzpu zzpuVar3, long j, int i) {
        this.a = zzpuVar;
        this.b = zzpuVar2;
        this.c = zzpuVar3;
        this.d = j;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        SafeParcelWriter.writeLong(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzqa() {
        this.e = -128;
    }
}
