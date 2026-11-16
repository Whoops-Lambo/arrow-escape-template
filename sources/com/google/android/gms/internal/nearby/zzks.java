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
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "OnConnectionInitiatedParamsCreator")
public final class zzks extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzks> CREATOR = new zzkt();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final boolean h;
    public final int i;
    public final zznv j;
    public final zzk k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzks) {
            zzks zzksVar = (zzks) obj;
            if (Objects.equal(this.a, zzksVar.a) && Objects.equal(this.b, zzksVar.b) && Objects.equal(this.c, zzksVar.c) && Objects.equal(Boolean.valueOf(this.d), Boolean.valueOf(zzksVar.d)) && Arrays.equals(this.e, zzksVar.e) && Arrays.equals(this.f, zzksVar.f) && Arrays.equals(this.g, zzksVar.g) && Objects.equal(Boolean.valueOf(this.h), Boolean.valueOf(zzksVar.h)) && Objects.equal(Integer.valueOf(this.i), Integer.valueOf(zzksVar.i)) && Objects.equal(this.j, zzksVar.j) && Objects.equal(this.k, zzksVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, Boolean.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), Boolean.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k);
    }

    public zzks(String str, String str2, String str3, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z2, int i, zznv zznvVar, zzk zzkVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = bArr;
        this.f = bArr2;
        this.g = bArr3;
        this.h = z2;
        this.i = i;
        this.j = zznvVar;
        this.k = zzkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.writeByteArray(parcel, 5, this.e, false);
        SafeParcelWriter.writeByteArray(parcel, 6, this.f, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.g, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.h);
        SafeParcelWriter.writeInt(parcel, 9, this.i);
        SafeParcelWriter.writeParcelable(parcel, 10, this.j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.k, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzks() {
        this.i = 0;
    }
}
