package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.zzk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "OnBandwidthChangedParamsCreator")
public final class zzkq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkq> CREATOR = new zzkr();
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final zznv e;
    public final zzk f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzkq) {
            zzkq zzkqVar = (zzkq) obj;
            if (Objects.equal(this.a, zzkqVar.a) && Objects.equal(Integer.valueOf(this.b), Integer.valueOf(zzkqVar.b)) && Objects.equal(Integer.valueOf(this.c), Integer.valueOf(zzkqVar.c)) && Objects.equal(Integer.valueOf(this.d), Integer.valueOf(zzkqVar.d)) && Objects.equal(this.e, zzkqVar.e) && Objects.equal(this.f, zzkqVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public zzkq(String str, int i, int i2, int i3, zznv zznvVar, zzk zzkVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = zznvVar;
        this.f = zzkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeParcelable(parcel, 5, this.e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzkq() {
        this.c = 0;
        this.d = 0;
    }
}
