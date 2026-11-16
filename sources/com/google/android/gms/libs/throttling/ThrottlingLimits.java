package com.google.android.gms.libs.throttling;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ThrottlingLimitsCreator")
public final class ThrottlingLimits extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ThrottlingLimits> CREATOR = new zzc();
    public final int a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @KeepForSdk
    public static final class Builder {
        public Builder() {
            new ThrottlingLimits((Object) null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThrottlingLimits) {
            return Objects.equal(Integer.valueOf(this.a), Integer.valueOf(((ThrottlingLimits) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a));
    }

    private ThrottlingLimits() {
        this.a = -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public ThrottlingLimits(int i) {
        this.a = i;
    }

    public /* synthetic */ ThrottlingLimits(Object obj) {
        this.a = -1;
    }
}
