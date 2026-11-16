package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.BleSignal;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "BleSignalImplCreator")
public final class zza extends AbstractSafeParcelable implements BleSignal {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    public final int a;
    public final int b;
    public final int c;

    @Override // com.google.android.gms.nearby.messages.BleSignal
    public final int V() {
        return this.c;
    }

    @Override // com.google.android.gms.nearby.messages.BleSignal
    public final int W() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSignal)) {
            return false;
        }
        BleSignal bleSignal = (BleSignal) obj;
        return this.b == bleSignal.W() && this.c == bleSignal.V();
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return jc1.n("BleSignal{rssi=", this.b, ", txPower=", this.c, "}");
    }

    public zza(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = (i3 <= -169 || i3 >= 87) ? Integer.MIN_VALUE : i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
