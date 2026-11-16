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
/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "ThrottlingSelectorCreator")
public final class ThrottlingSelector extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ThrottlingSelector> CREATOR = new zzf();
    public final String a;
    public final int b;
    public final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThrottlingSelector) {
            ThrottlingSelector throttlingSelector = (ThrottlingSelector) obj;
            if (Objects.equal(this.a, throttlingSelector.a) && Objects.equal(Integer.valueOf(this.b), Integer.valueOf(throttlingSelector.b)) && Objects.equal(Integer.valueOf(this.c), Integer.valueOf(throttlingSelector.c))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @KeepForSdk
    public static final class Builder {
        public Builder() {
            new ThrottlingSelector(0);
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public ThrottlingSelector(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ ThrottlingSelector(int i) {
        this.b = -1;
        this.c = -1;
    }

    private ThrottlingSelector() {
        this.b = -1;
        this.c = -1;
    }
}
