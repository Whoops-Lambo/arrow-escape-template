package com.google.android.gms.measurement.internal;

import defpackage.i05;
import defpackage.jc1;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbb extends i05 {
    public long c;
    public String d;

    @Override // defpackage.i05
    public final boolean u() {
        Calendar calendar = Calendar.getInstance();
        this.c = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.d = jc1.o(lowerCase, "-", new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase2);
        return false;
    }

    public final long x() {
        v();
        return this.c;
    }

    public final String y() {
        v();
        return this.d;
    }
}
