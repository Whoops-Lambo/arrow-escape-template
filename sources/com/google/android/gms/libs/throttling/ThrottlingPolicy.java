package com.google.android.gms.libs.throttling;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ThrottlingPolicyCreator")
public final class ThrottlingPolicy extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ThrottlingPolicy> CREATOR = new zze();
    public final boolean a;
    public final ThrottlingLimits b;
    public final ThrottlingOverride[] c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThrottlingPolicy) {
            ThrottlingPolicy throttlingPolicy = (ThrottlingPolicy) obj;
            if (Objects.equal(Boolean.valueOf(this.a), Boolean.valueOf(throttlingPolicy.a)) && Objects.equal(this.b, throttlingPolicy.b) && Arrays.equals(this.c, throttlingPolicy.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @KeepForSdk
    public static final class Builder {
        public Builder() {
            new ThrottlingPolicy(0);
        }
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.a), this.b, Integer.valueOf(Arrays.hashCode(this.c)));
    }

    public ThrottlingPolicy(boolean z, ThrottlingLimits throttlingLimits, ThrottlingOverride[] throttlingOverrideArr) {
        this.a = z;
        this.b = throttlingLimits;
        this.c = throttlingOverrideArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ ThrottlingPolicy(int i) {
        this.a = false;
    }

    private ThrottlingPolicy() {
        this.a = false;
    }
}
