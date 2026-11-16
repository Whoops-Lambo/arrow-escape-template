package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.zzk;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "OnConnectionResultParamsCreator")
public final class zzky extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzky> CREATOR = new zzkz();
    public final String a;
    public final int b;
    public final byte[] c;
    public final int d;
    public final zznv e;
    public final zzk f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzky) {
            zzky zzkyVar = (zzky) obj;
            if (Objects.equal(this.a, zzkyVar.a) && Objects.equal(Integer.valueOf(this.b), Integer.valueOf(zzkyVar.b)) && Arrays.equals(this.c, zzkyVar.c) && Objects.equal(Integer.valueOf(this.d), Integer.valueOf(zzkyVar.d)) && Objects.equal(this.e, zzkyVar.e) && Objects.equal(this.f, zzkyVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(this.d), this.e, this.f);
    }

    public zzky(String str, int i, byte[] bArr, int i2, zznv zznvVar, zzk zzkVar) {
        this.a = str;
        this.b = i;
        this.c = bArr;
        this.d = i2;
        this.e = zznvVar;
        this.f = zzkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeByteArray(parcel, 3, this.c, false);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeParcelable(parcel, 5, this.e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzky() {
        this.d = 0;
    }
}
