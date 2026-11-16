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
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ThrottlingOverrideCreator")
public final class ThrottlingOverride extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ThrottlingOverride> CREATOR = new zzd();
    public ThrottlingSelector a;
    public ThrottlingLimits b;

    private ThrottlingOverride() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThrottlingOverride) {
            ThrottlingOverride throttlingOverride = (ThrottlingOverride) obj;
            if (Objects.equal(this.a, throttlingOverride.a) && Objects.equal(this.b, throttlingOverride.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @KeepForSdk
    public static final class Builder {
        public Builder() {
            new ThrottlingOverride();
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
