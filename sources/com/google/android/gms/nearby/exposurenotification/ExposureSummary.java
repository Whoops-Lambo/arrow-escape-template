package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.jc1;
import defpackage.nj;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "ExposureSummaryCreator")
@Deprecated
public final class ExposureSummary extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ExposureSummary> CREATOR = new zzk();
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final int e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ExposureSummaryBuilder {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ExposureSummary)) {
            return false;
        }
        ExposureSummary exposureSummary = (ExposureSummary) obj;
        if (!Objects.equal(Integer.valueOf(this.a), Integer.valueOf(exposureSummary.a)) || !Objects.equal(Integer.valueOf(this.b), Integer.valueOf(exposureSummary.b)) || !Objects.equal(Integer.valueOf(this.c), Integer.valueOf(exposureSummary.c))) {
            return false;
        }
        int[] iArr = exposureSummary.d;
        return Arrays.equals(this.d, Arrays.copyOf(iArr, iArr.length)) && Objects.equal(Integer.valueOf(this.e), Integer.valueOf(exposureSummary.e));
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String string = Arrays.toString(this.d);
        StringBuilder sbT = jc1.t("ExposureSummary<daysSinceLastExposure: ", this.a, ", matchedKeyCount: ", this.b, ", maximumRiskScore: ");
        sbT.append(this.c);
        sbT.append(", attenuationDurations: ");
        sbT.append(string);
        sbT.append(", summationRiskScore: ");
        return nj.l(this.e, ">", sbT);
    }

    public ExposureSummary(int i, int i2, int i3, int i4, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        int[] iArr = this.d;
        SafeParcelWriter.writeIntArray(parcel, 4, Arrays.copyOf(iArr, iArr.length), false);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
