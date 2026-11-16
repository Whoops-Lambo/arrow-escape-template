package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "DailySummariesConfigCreator")
public class DailySummariesConfig extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DailySummariesConfig> CREATOR = new zzb();
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final int e;
    public final double f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class DailySummariesConfigBuilder {
        public DailySummariesConfigBuilder() {
            Double[] dArr = new Double[zzj.values().length];
            Double dValueOf = Double.valueOf(0.0d);
            Arrays.fill(new Double[6], dValueOf);
            Arrays.fill(dArr, dValueOf);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DailySummariesConfig) {
            DailySummariesConfig dailySummariesConfig = (DailySummariesConfig) obj;
            if (this.a.equals(dailySummariesConfig.a) && this.b.equals(dailySummariesConfig.b) && this.c.equals(dailySummariesConfig.c) && this.d.equals(dailySummariesConfig.d) && this.e == dailySummariesConfig.e && this.f == dailySummariesConfig.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, this.d, Integer.valueOf(this.e), Double.valueOf(this.f));
    }

    public final String toString() {
        return String.format(Locale.US, "DailySummariesConfig<reportTypeWeights: %s, infectiousnessWeights: %s, attenuationBucketThresholdDb: %s, attenuationBucketWeights: %sdaysSinceExposureThreshold: %d,minimumWindowScore: %.3f>", this.a, this.b, this.c, this.d, Integer.valueOf(this.e), Double.valueOf(this.f));
    }

    public DailySummariesConfig(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i, double d) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
        this.e = i;
        this.f = d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDoubleList(parcel, 1, new ArrayList(this.a), false);
        SafeParcelWriter.writeDoubleList(parcel, 2, new ArrayList(this.b), false);
        SafeParcelWriter.writeIntegerList(parcel, 3, new ArrayList(this.c), false);
        SafeParcelWriter.writeDoubleList(parcel, 4, new ArrayList(this.d), false);
        SafeParcelWriter.writeInt(parcel, 5, this.e);
        SafeParcelWriter.writeDouble(parcel, 6, this.f);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
