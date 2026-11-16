package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b43;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    public final Month a;
    public final Month b;
    public final DateValidator c;
    public final Month d;
    public final int e;
    public final int f;
    public final int g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface DateValidator extends Parcelable {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.a.equals(calendarConstraints.a) && this.b.equals(calendarConstraints.b) && Objects.equals(this.d, calendarConstraints.d) && this.e == calendarConstraints.e && this.c.equals(calendarConstraints.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Integer.valueOf(this.e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.a = month;
        this.b = month2;
        this.d = month3;
        this.e = i;
        this.c = dateValidator;
        if (month3 != null && month.a.compareTo(month3.a) > 0) {
            defpackage.d.r("start Month cannot be after current Month");
            throw null;
        }
        if (month3 != null && month3.a.compareTo(month2.a) > 0) {
            defpackage.d.r("current Month cannot be after end Month");
            throw null;
        }
        if (i >= 0 && i <= b43.c(null).getMaximum(7)) {
            this.g = month.d(month2) + 1;
            this.f = (month2.c - month.c) + 1;
        } else {
            defpackage.d.r("firstDayOfWeek is not valid");
            throw null;
        }
    }
}
