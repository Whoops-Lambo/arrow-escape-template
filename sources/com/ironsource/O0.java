package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class O0 {
    private final M0 a;
    private final Kb b;
    private final C5101zb c = c();
    private Timer d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            O0.this.b.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            O0.this.b.b();
        }
    }

    private synchronized void b(long j) {
        j();
        Timer timer = new Timer();
        this.d = timer;
        timer.schedule(new b(), j);
    }

    private synchronized void j() {
        Timer timer = this.d;
        if (timer != null) {
            timer.cancel();
            this.d = null;
        }
    }

    private C5101zb c() {
        return new C5101zb(new a(), com.ironsource.lifecycle.b.d(), new C4819jg());
    }

    public void a() {
        if (this.a.a() == M0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public boolean d() {
        return this.a.c() > 0;
    }

    public void e() {
        if (this.a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.a.c());
        }
    }

    public void f() {
        if (this.a.a() == M0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.a.d());
        }
    }

    public void g() {
        if (this.a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.a.a() != M0.a.AUTOMATIC_LOAD_WHILE_SHOW || this.a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.a.d());
    }

    public void i() {
        C5101zb c5101zb = this.c;
        if (c5101zb != null) {
            c5101zb.b();
        }
    }

    public void k() {
        if (this.a.a() != M0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.a.b());
    }

    public O0(M0 m0, @NotNull Kb kb) {
        this.a = m0;
        this.b = kb;
    }

    public void a(long j) {
        C5101zb c5101zb = this.c;
        if (c5101zb != null) {
            c5101zb.a(j);
        }
    }

    public M0 b() {
        return this.a;
    }
}
