package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UwbRangingDataCreator")
@SafeParcelable.Reserved({1000})
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public int a;
    public int b;
    public int c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzu) {
            zzu zzuVar = (zzu) obj;
            if (Objects.equal(Integer.valueOf(this.a), Integer.valueOf(zzuVar.a)) && Objects.equal(Integer.valueOf(this.b), Integer.valueOf(zzuVar.b)) && Objects.equal(Integer.valueOf(this.c), Integer.valueOf(zzuVar.c)) && Objects.equal(Boolean.valueOf(this.d), Boolean.valueOf(zzuVar.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d));
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        boolean z = this.d;
        StringBuilder sbT = jc1.t("UwbRangingData{rawDistance=", i, ", rawAngleOfArrivalAzimuth=", i2, ", rawAngleOfArrivalPolar=");
        sbT.append(i3);
        sbT.append(", isValidAngleOfArrivalData=");
        sbT.append(z);
        sbT.append("}");
        return sbT.toString();
    }

    private zzu() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
