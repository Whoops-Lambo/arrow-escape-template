package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        return this.a == zzbxVar.a && this.b == zzbxVar.b && this.c == zzbxVar.c && this.d == zzbxVar.d;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(this.a);
        sb.append(", startMinute=");
        sb.append(this.b);
        pv1.s(this.c, this.d, ", endHour=", ", endMinute=", sb);
        sb.append(']');
        return sb.toString();
    }

    public zzbx(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i >= 0 && i <= 23) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Start hour must be in range [0, 23].");
        if (i2 >= 0 && i2 <= 59) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2, "Start minute must be in range [0, 59].");
        if (i3 >= 0 && i3 <= 23) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkState(z3, "End hour must be in range [0, 23].");
        if (i4 >= 0 && i4 <= 59) {
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.checkState(z4, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i + i2) + i3) + i4 > 0, "Parameters can't be all 0.");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
