package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "ExposureConfigurationCreator")
@Deprecated
public final class ExposureConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ExposureConfiguration> CREATOR = new zze();
    public final int a;
    public final int[] b;
    public final int c;
    public final int[] d;
    public final int e;
    public final int[] f;
    public final int g;
    public final int[] h;
    public final int i;
    public final int[] j;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ExposureConfigurationBuilder {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExposureConfiguration)) {
            return false;
        }
        ExposureConfiguration exposureConfiguration = (ExposureConfiguration) obj;
        if (!Objects.equal(Integer.valueOf(this.a), Integer.valueOf(exposureConfiguration.a))) {
            return false;
        }
        int[] iArr = exposureConfiguration.b;
        if (!Arrays.equals(this.b, Arrays.copyOf(iArr, iArr.length)) || !Objects.equal(Integer.valueOf(this.c), Integer.valueOf(exposureConfiguration.c))) {
            return false;
        }
        int[] iArr2 = exposureConfiguration.d;
        if (!Arrays.equals(this.d, Arrays.copyOf(iArr2, iArr2.length)) || !Objects.equal(Integer.valueOf(this.e), Integer.valueOf(exposureConfiguration.e))) {
            return false;
        }
        int[] iArr3 = exposureConfiguration.f;
        if (!Arrays.equals(this.f, Arrays.copyOf(iArr3, iArr3.length)) || !Objects.equal(Integer.valueOf(this.g), Integer.valueOf(exposureConfiguration.g))) {
            return false;
        }
        int[] iArr4 = exposureConfiguration.h;
        if (!Arrays.equals(this.h, Arrays.copyOf(iArr4, iArr4.length)) || !Objects.equal(Integer.valueOf(this.i), Integer.valueOf(exposureConfiguration.i))) {
            return false;
        }
        int[] iArr5 = exposureConfiguration.j;
        return Arrays.equals(this.j, Arrays.copyOf(iArr5, iArr5.length));
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Integer.valueOf(this.i), this.j);
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "ExposureConfiguration<minimumRiskScore: " + this.a + ", attenuationScores: " + Arrays.toString(this.b) + ", attenuationWeight: " + this.c + ", daysSinceLastExposureScores: " + Arrays.toString(this.d) + ", daysSinceLastExposureWeight: " + this.e + ", durationScores: " + Arrays.toString(this.f) + ", durationWeight: " + this.g + ", transmissionRiskScores: " + Arrays.toString(this.h) + ", transmissionRiskWeight: " + this.i + ", durationAtAttenuationThresholds: " + Arrays.toString(this.j) + ">";
    }

    public ExposureConfiguration(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4, int[] iArr4, int i5, int[] iArr5) {
        this.a = i;
        this.b = iArr;
        this.c = i2;
        this.d = iArr2;
        this.e = i3;
        this.f = iArr3;
        this.g = i4;
        this.h = iArr4;
        this.i = i5;
        this.j = iArr5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        int[] iArr = this.b;
        SafeParcelWriter.writeIntArray(parcel, 2, Arrays.copyOf(iArr, iArr.length), false);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        int[] iArr2 = this.d;
        SafeParcelWriter.writeIntArray(parcel, 4, Arrays.copyOf(iArr2, iArr2.length), false);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        int[] iArr3 = this.f;
        SafeParcelWriter.writeIntArray(parcel, 6, Arrays.copyOf(iArr3, iArr3.length), false);
        SafeParcelWriter.writeInt(parcel, 7, this.g);
        int[] iArr4 = this.h;
        SafeParcelWriter.writeIntArray(parcel, 8, Arrays.copyOf(iArr4, iArr4.length), false);
        SafeParcelWriter.writeInt(parcel, 9, this.i);
        int[] iArr5 = this.j;
        SafeParcelWriter.writeIntArray(parcel, 10, Arrays.copyOf(iArr5, iArr5.length), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
