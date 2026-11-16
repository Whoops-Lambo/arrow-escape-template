package com.google.android.material.datepicker;

import defpackage.b43;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public Long a;

    static {
        long j = Month.a(1900, 0).f;
        Calendar calendarC = b43.c(null);
        calendarC.setTimeInMillis(j);
        b43.a(calendarC).getTimeInMillis();
        long j2 = Month.a(2100, 11).f;
        Calendar calendarC2 = b43.c(null);
        calendarC2.setTimeInMillis(j2);
        b43.a(calendarC2).getTimeInMillis();
    }
}
