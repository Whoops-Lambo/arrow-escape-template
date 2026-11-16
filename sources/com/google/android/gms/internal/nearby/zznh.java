package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.n30;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "NearbyDeviceCreator")
public final class zznh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznh> CREATOR = new zzni();
    public static final zznh d = new zznh(1, "", null);
    public final int a;
    public final String b;
    public final String c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zznh)) {
            return false;
        }
        zznh zznhVar = (zznh) obj;
        return Objects.equal(this.b, zznhVar.b) && Objects.equal(this.c, zznhVar.c);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.c);
    }

    public final String toString() {
        return n30.n("NearbyDevice{handle=", this.b, ", bluetoothAddress=", this.c, "}");
    }

    public zznh(int i, String str, String str2) {
        this.a = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
        this.b = str == null ? "" : str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 6, this.c, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
