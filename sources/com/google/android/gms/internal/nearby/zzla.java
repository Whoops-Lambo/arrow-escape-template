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
@SafeParcelable.Class(creator = "OnDisconnectedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzla extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzla> CREATOR = new zzlb();
    public final String a;
    public final int b;
    public final zznv c;
    public final zzk d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzla) {
            zzla zzlaVar = (zzla) obj;
            if (Objects.equal(this.a, zzlaVar.a) && Objects.equal(Integer.valueOf(this.b), Integer.valueOf(zzlaVar.b)) && Objects.equal(this.c, zzlaVar.c) && Objects.equal(this.d, zzlaVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Integer.valueOf(this.b), this.c, this.d);
    }

    public zzla(String str, int i, zznv zznvVar, zzk zzkVar) {
        this.a = str;
        this.b = i;
        this.c = zznvVar;
        this.d = zzkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzla() {
        this.b = 0;
    }
}
