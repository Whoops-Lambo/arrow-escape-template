package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.a;
import com.google.android.gms.internal.nearby.zzsq;
import defpackage.n30;
import defpackage.rl3;
import defpackage.x75;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "ExposureWindowCreator")
public final class ExposureWindow extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ExposureWindow> CREATOR = new zzm();
    public final long a;
    public final zzsq b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final int g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        public Builder() {
            x75 x75Var = zzsq.b;
            a aVar = a.e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ExposureWindow.class != obj.getClass()) {
            return false;
        }
        ExposureWindow exposureWindow = (ExposureWindow) obj;
        return this.c == exposureWindow.c && this.a == exposureWindow.a && this.b.equals(exposureWindow.b) && this.d == exposureWindow.d && this.e == exposureWindow.e && Objects.equal(this.f, exposureWindow.f) && this.g == exposureWindow.g;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, Integer.valueOf(this.g));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder("ExposureWindow{dateMillisSinceEpoch=");
        sb.append(this.a);
        sb.append(", reportType=");
        sb.append(this.c);
        n30.t(this.d, ", scanInstances=", strValueOf, ", infectiousness=", sb);
        rl3.m(this.e, ", calibrationConfidence=", ", deviceName=", this.f, sb);
        sb.append("}");
        return sb.toString();
    }

    public ExposureWindow(long j, ArrayList arrayList, int i, int i2, int i3, String str, int i4) {
        this.a = j;
        this.b = zzsq.x(arrayList);
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeTypedList(parcel, 2, this.b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeString(parcel, 6, this.f, false);
        SafeParcelWriter.writeInt(parcel, 7, this.g);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
