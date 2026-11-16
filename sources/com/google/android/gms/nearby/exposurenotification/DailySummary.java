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
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "DailySummaryCreator")
public class DailySummary extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DailySummary> CREATOR = new zzc();
    public final int a;
    public final List b;
    public final ExposureSummaryData c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SafeParcelable.Class(creator = "ExposureSummaryDataCreator")
    public static class ExposureSummaryData extends AbstractSafeParcelable implements ReflectedParcelable {

        @NonNull
        public static final Parcelable.Creator<ExposureSummaryData> CREATOR = new zzl();
        public final double a;
        public final double b;
        public final double c;

        public final boolean equals(Object obj) {
            if (obj instanceof ExposureSummaryData) {
                ExposureSummaryData exposureSummaryData = (ExposureSummaryData) obj;
                if (this.a == exposureSummaryData.a && this.b == exposureSummaryData.b && this.c == exposureSummaryData.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(Double.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c));
        }

        public final String toString() {
            return String.format(Locale.US, "ExposureSummaryData<maximumScore: %.3f, scoreSum: %.3f, weightedDurationSum: %.3f>", Double.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c));
        }

        public ExposureSummaryData(double d, double d2, double d3) {
            this.a = d;
            this.b = d2;
            this.c = d3;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeDouble(parcel, 1, this.a);
            SafeParcelWriter.writeDouble(parcel, 2, this.b);
            SafeParcelWriter.writeDouble(parcel, 3, this.c);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DailySummary) {
            DailySummary dailySummary = (DailySummary) obj;
            if (this.a == dailySummary.a && this.b.equals(dailySummary.b) && Objects.equal(this.c, dailySummary.c) && Objects.equal(this.d, dailySummary.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), this.b, this.c, this.d);
    }

    public final String toString() {
        return String.format(Locale.US, "DailySummary<daysSinceEpoch: %d, reportSummaries: %s, daySummary: %s, deviceName: %s>", Integer.valueOf(this.a), this.b, this.c, this.d);
    }

    public DailySummary(int i, ArrayList arrayList, ExposureSummaryData exposureSummaryData, String str) {
        this.a = i;
        this.b = arrayList;
        this.c = exposureSummaryData;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeTypedList(parcel, 2, this.b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.c, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
