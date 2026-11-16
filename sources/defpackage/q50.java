package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q50 {

    @NotNull
    public static final o50 Companion = new o50();
    public static final TimeZone c = TimeZone.getTimeZone("UTC");
    public static final cm2 d;
    public final cm2 a;
    public final Calendar b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q50.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return c() == ((q50) obj).c();
    }

    static {
        new cm2(u7.m);
        d = new cm2(u7.l);
    }

    public final q50 b() {
        Calendar calendar = Calendar.getInstance(c);
        calendar.setTime(this.b.getTime());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new q50(calendar);
    }

    public final long c() {
        return this.b.getTime().getTime();
    }

    public q50(Calendar calendar) {
        new cm2(new p50(this, 5));
        new cm2(new p50(this, 3));
        this.a = new cm2(new p50(this, 0));
        new cm2(new p50(this, 1));
        new cm2(new p50(this, 2));
        new cm2(new p50(this, 4));
        this.b = calendar;
    }

    public final q50 a(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.b.getTime());
        calendar.add(i, i2);
        return new q50(calendar);
    }

    public final int hashCode() {
        return Long.hashCode(c());
    }

    public q50(long j) {
        Companion.getClass();
        Date date = new Date(j);
        Calendar calendar = Calendar.getInstance(c);
        calendar.setTime(date);
        this(calendar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q50() {
        Companion.getClass();
        Calendar calendar = Calendar.getInstance(c);
        calendar.getClass();
        this(calendar);
    }
}
