package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "ParcelablePayloadCreator")
@SafeParcelable.Reserved({1000})
public final class zzmb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmb> CREATOR = new zzmc();
    public long a;
    public int b;
    public byte[] c;
    public ParcelFileDescriptor d;
    public String e;
    public ParcelFileDescriptor g;
    public Uri h;
    public zzlx k;
    public String m;
    public String n;
    public long f = -1;
    public long i = 0;
    public boolean j = false;
    public long l = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmb) {
            zzmb zzmbVar = (zzmb) obj;
            if (Objects.equal(Long.valueOf(this.a), Long.valueOf(zzmbVar.a)) && Objects.equal(Integer.valueOf(this.b), Integer.valueOf(zzmbVar.b)) && Arrays.equals(this.c, zzmbVar.c) && Objects.equal(this.d, zzmbVar.d) && Objects.equal(this.e, zzmbVar.e) && Objects.equal(Long.valueOf(this.f), Long.valueOf(zzmbVar.f)) && Objects.equal(this.g, zzmbVar.g) && Objects.equal(this.h, zzmbVar.h) && Objects.equal(Long.valueOf(this.i), Long.valueOf(zzmbVar.i)) && Objects.equal(Boolean.valueOf(this.j), Boolean.valueOf(zzmbVar.j)) && Objects.equal(this.k, zzmbVar.k) && Objects.equal(Long.valueOf(this.l), Long.valueOf(zzmbVar.l)) && Objects.equal(this.m, zzmbVar.m) && Objects.equal(this.n, zzmbVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, Long.valueOf(this.f), this.g, this.h, Long.valueOf(this.i), Boolean.valueOf(this.j), this.k, Long.valueOf(this.l), this.m, this.n);
    }

    private zzmb() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeByteArray(parcel, 3, this.c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.e, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f);
        SafeParcelWriter.writeParcelable(parcel, 7, this.g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.h, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.i);
        SafeParcelWriter.writeBoolean(parcel, 10, this.j);
        SafeParcelWriter.writeParcelable(parcel, 11, this.k, i, false);
        SafeParcelWriter.writeLong(parcel, 12, this.l);
        SafeParcelWriter.writeString(parcel, 13, this.m, false);
        SafeParcelWriter.writeString(parcel, 14, this.n, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
