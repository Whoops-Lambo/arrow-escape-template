package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "ExposureInformationCreator")
@Deprecated
public final class ExposureInformation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ExposureInformation> CREATOR = new zzf();
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int[] f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ExposureInformationBuilder {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExposureInformation)) {
            return false;
        }
        ExposureInformation exposureInformation = (ExposureInformation) obj;
        if (!Objects.equal(Long.valueOf(this.a), Long.valueOf(exposureInformation.a)) || !Objects.equal(Integer.valueOf(this.b), Integer.valueOf(exposureInformation.b)) || !Objects.equal(Integer.valueOf(this.c), Integer.valueOf(exposureInformation.c)) || !Objects.equal(Integer.valueOf(this.d), Integer.valueOf(exposureInformation.d)) || !Objects.equal(Integer.valueOf(this.e), Integer.valueOf(exposureInformation.e))) {
            return false;
        }
        int[] iArr = exposureInformation.f;
        return Arrays.equals(this.f, Arrays.copyOf(iArr, iArr.length));
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), this.f);
    }

    public final String toString() {
        Locale locale = Locale.US;
        long j = this.a;
        return String.format(locale, "ExposureInformation<date: %s, dateMillisSinceEpoch: %d, durationMinutes: %d, attenuationValue: %d, transmissionRiskLevel: %d, totalRiskScore: %d, attenuationDurations: %s>", new Date(j), Long.valueOf(j), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Arrays.toString(this.f));
    }

    public ExposureInformation(long j, int i, int i2, int i3, int i4, int[] iArr) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = iArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        int[] iArr = this.f;
        SafeParcelWriter.writeIntArray(parcel, 6, Arrays.copyOf(iArr, iArr.length), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
