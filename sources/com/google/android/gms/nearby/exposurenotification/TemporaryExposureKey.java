package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Hex;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "TemporaryExposureKeyCreator")
public final class TemporaryExposureKey extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TemporaryExposureKey> CREATOR = new zzp();
    public final byte[] a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class TemporaryExposureKeyBuilder {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TemporaryExposureKey)) {
            return false;
        }
        TemporaryExposureKey temporaryExposureKey = (TemporaryExposureKey) obj;
        byte[] bArr = temporaryExposureKey.a;
        return Arrays.equals(this.a, Arrays.copyOf(bArr, bArr.length)) && Objects.equal(Integer.valueOf(this.b), Integer.valueOf(temporaryExposureKey.b)) && Objects.equal(Integer.valueOf(this.c), Integer.valueOf(temporaryExposureKey.c)) && Objects.equal(Integer.valueOf(this.d), Integer.valueOf(temporaryExposureKey.d)) && Objects.equal(Integer.valueOf(this.e), Integer.valueOf(temporaryExposureKey.e)) && this.f == temporaryExposureKey.f && this.g == temporaryExposureKey.g;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String strBytesToStringLowercase = Hex.bytesToStringLowercase(this.a);
        Date date = new Date(TimeUnit.MINUTES.toMillis(((long) this.b) * 10));
        Integer numValueOf = Integer.valueOf(this.c);
        Integer numValueOf2 = Integer.valueOf(this.d);
        Integer numValueOf3 = Integer.valueOf(this.e);
        int i = this.f;
        return String.format(locale, "TemporaryExposureKey<keyData: %s, rollingStartIntervalNumber: %s, transmissionRiskLevel: %d, rollingPeriod: %d, reportType: %d, daysSinceOnsetOfSymptoms: %s>", strBytesToStringLowercase, date, numValueOf, numValueOf2, numValueOf3, i == Integer.MAX_VALUE ? "unknown" : Integer.valueOf(i));
    }

    public TemporaryExposureKey(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        byte[] bArr = this.a;
        SafeParcelWriter.writeByteArray(parcel, 1, Arrays.copyOf(bArr, bArr.length), false);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeInt(parcel, 6, this.f);
        SafeParcelWriter.writeInt(parcel, 7, this.g);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
