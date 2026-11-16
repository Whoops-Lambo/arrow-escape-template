package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "BleFilterCreator")
public final class zzne extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzne> CREATOR = new zznf();
    public final int a;
    public final ParcelUuid b;
    public final ParcelUuid c;
    public final ParcelUuid d;
    public final byte[] e;
    public final byte[] f;
    public final int g;
    public final byte[] h;
    public final byte[] i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzne.class == obj.getClass()) {
            zzne zzneVar = (zzne) obj;
            if (this.g == zzneVar.g && Arrays.equals(this.h, zzneVar.h) && Arrays.equals(this.i, zzneVar.i) && Objects.equal(this.d, zzneVar.d) && Arrays.equals(this.e, zzneVar.e) && Arrays.equals(this.f, zzneVar.f) && Objects.equal(this.b, zzneVar.b) && Objects.equal(this.c, zzneVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.g), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.i)), this.d, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), this.b, this.c);
    }

    public zzne(int i, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        this.a = i;
        this.b = parcelUuid;
        this.c = parcelUuid2;
        this.d = parcelUuid3;
        this.e = bArr;
        this.f = bArr2;
        this.g = i2;
        this.h = bArr3;
        this.i = bArr4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel, 4, this.b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.d, i, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.e, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.f, false);
        SafeParcelWriter.writeInt(parcel, 9, this.g);
        SafeParcelWriter.writeByteArray(parcel, 10, this.h, false);
        SafeParcelWriter.writeByteArray(parcel, 11, this.i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
