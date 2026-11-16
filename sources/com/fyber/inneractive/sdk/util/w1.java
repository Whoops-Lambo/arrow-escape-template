package com.fyber.inneractive.sdk.util;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class w1 {
    public final TimeUnit a;
    public final long b;
    public final u1 c;
    public v1 e;
    public boolean d = false;
    public long f = 0;

    public final void a(long j) {
        long jUptimeMillis = (SystemClock.uptimeMillis() - j) + 50 + this.f;
        this.f = jUptimeMillis;
        if (this.e != null && jUptimeMillis > this.a.toMillis(this.b)) {
            this.e.a();
            return;
        }
        u1 u1Var = this.c;
        if (u1Var == null || this.e == null) {
            return;
        }
        u1Var.removeMessages(1932593528);
        this.c.sendEmptyMessageDelayed(1932593528, 50L);
    }

    public w1(TimeUnit timeUnit, long j) {
        this.b = j;
        this.a = timeUnit;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j));
        this.c = new u1(this);
    }
}
