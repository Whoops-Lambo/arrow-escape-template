package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class S5 {
    public static final int e = -1;
    private Runnable a = new a();
    private int b;
    private InterfaceC4892o c;
    private Ab d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC4892o interfaceC4892o = S5.this.c;
            if (interfaceC4892o != null) {
                interfaceC4892o.a();
            }
        }
    }

    public boolean b() {
        return this.b > 0;
    }

    public S5(int i, InterfaceC4892o interfaceC4892o) {
        this.c = interfaceC4892o;
        this.b = i;
    }

    public void a(long j) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.b) - Math.max(j, 0L);
            if (millis > 0) {
                a();
                this.d = new Ab(millis, this.a, true);
                Calendar calendar = Calendar.getInstance();
                calendar.add(14, (int) millis);
                IronLog.INTERNAL.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format(Locale.getDefault(), "%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
                return;
            }
            IronLog.INTERNAL.verbose("no delay - onAdExpired called");
            this.c.a();
        }
    }

    public void a() {
        if (!b() || this.d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.d.e();
        this.d = null;
    }
}
