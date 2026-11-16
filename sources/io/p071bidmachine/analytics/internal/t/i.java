package io.p071bidmachine.analytics.internal.t;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class i {
    private final SimpleDateFormat a = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.SSS", Locale.getDefault());

    public final Long a(String str) throws ParseException {
        int i = Calendar.getInstance().get(1);
        Date date = this.a.parse(i + '-' + str);
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }
}
