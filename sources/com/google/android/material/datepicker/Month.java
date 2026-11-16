package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b43;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new i();
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    public static Month a(int i, int i2) {
        Calendar calendarC = b43.c(null);
        calendarC.set(1, i);
        calendarC.set(2, i2);
        return new Month(calendarC);
    }

    public static Month b(long j) {
        Calendar calendarC = b43.c(null);
        calendarC.setTimeInMillis(j);
        return new Month(calendarC);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.b == month.b && this.c == month.c;
    }

    public final String c() {
        if (this.g == null) {
            long timeInMillis = this.a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = b43.a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.a.compareTo(month.a);
    }

    public final int d(Month month) {
        if (this.a instanceof GregorianCalendar) {
            return (month.b - this.b) + ((month.c - this.c) * 12);
        }
        defpackage.d.r("Only Gregorian calendars are supported.");
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = b43.a(calendar);
        this.a = calendarA;
        this.b = calendarA.get(2);
        this.c = calendarA.get(1);
        this.d = calendarA.getMaximum(7);
        this.e = calendarA.getActualMaximum(5);
        this.f = calendarA.getTimeInMillis();
    }
}
