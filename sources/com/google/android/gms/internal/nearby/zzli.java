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
@SafeParcelable.Class(creator = "OnPayloadReceivedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzli extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzli> CREATOR = new zzlj();
    public final String a;
    public final zzmb b;
    public final boolean c;
    public final int d;
    public final zznv e;
    public final zzk f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzli) {
            zzli zzliVar = (zzli) obj;
            if (Objects.equal(this.a, zzliVar.a) && Objects.equal(this.b, zzliVar.b) && Objects.equal(Boolean.valueOf(this.c), Boolean.valueOf(zzliVar.c)) && Objects.equal(Integer.valueOf(this.d), Integer.valueOf(zzliVar.d)) && Objects.equal(this.e, zzliVar.e) && Objects.equal(this.f, zzliVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public zzli(String str, zzmb zzmbVar, boolean z, int i, zznv zznvVar, zzk zzkVar) {
        this.a = str;
        this.b = zzmbVar;
        this.c = z;
        this.d = i;
        this.e = zznvVar;
        this.f = zzkVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.c);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeParcelable(parcel, 5, this.e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzli() {
        this.d = 0;
    }
}
