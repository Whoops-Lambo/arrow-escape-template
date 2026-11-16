package defpackage;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class n50 {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");

    public static final et0 a(Long l) {
        Calendar calendar = Calendar.getInstance(a, Locale.ROOT);
        calendar.getClass();
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        int i = calendar.get(16) + calendar.get(15);
        int i2 = calendar.get(13);
        int i3 = calendar.get(12);
        int i4 = calendar.get(11);
        int i5 = (calendar.get(7) + 5) % 7;
        n83.a.getClass();
        n83 n83Var = (n83) n83.c.get(i5);
        int i6 = calendar.get(5);
        int i7 = calendar.get(6);
        int i8 = calendar.get(2);
        go1.a.getClass();
        return new et0(i2, i3, i4, n83Var, i6, i7, (go1) go1.c.get(i8), calendar.get(1), calendar.getTimeInMillis() + ((long) i));
    }
}
