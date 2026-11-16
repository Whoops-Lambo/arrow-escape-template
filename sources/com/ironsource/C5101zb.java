package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.zb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class C5101zb {
    private static final String g = "zb";
    private final com.ironsource.lifecycle.b a;
    private final Runnable b;
    private final C4819jg c;
    private Timer e;
    private final Object d = new Object();
    private final InterfaceC4939qa f = new a();

    /* JADX INFO: renamed from: com.ironsource.zb$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements InterfaceC4939qa {
        @Override // com.ironsource.InterfaceC4939qa
        public void c() {
        }

        @Override // com.ironsource.InterfaceC4939qa
        public void d() {
        }

        public a() {
        }

        @Override // com.ironsource.InterfaceC4939qa
        public void a() {
            C5101zb.this.c.c(System.currentTimeMillis());
            C5101zb.this.c();
        }

        @Override // com.ironsource.InterfaceC4939qa
        public void b() {
            C5101zb.this.c.b(System.currentTimeMillis());
            C5101zb c5101zb = C5101zb.this;
            c5101zb.b(c5101zb.c.a());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.zb$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C5101zb c5101zb = C5101zb.this;
            c5101zb.a.b(c5101zb.f);
            C5101zb.this.c.b();
            C5101zb.this.b.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        synchronized (this.d) {
            c();
            Timer timer = new Timer();
            this.e = timer;
            timer.schedule(new b(), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.d) {
            try {
                Timer timer = this.e;
                if (timer != null) {
                    timer.cancel();
                    this.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(long j) {
        if (j < 0) {
            Log.d(g, "cannot start timer with delay < 0");
            return;
        }
        this.a.a(this.f);
        this.c.a(j);
        if (this.a.e()) {
            this.c.c(System.currentTimeMillis());
        } else {
            b(j);
        }
    }

    public C5101zb(Runnable runnable, com.ironsource.lifecycle.b bVar, C4819jg c4819jg) {
        this.b = runnable;
        this.a = bVar;
        this.c = c4819jg;
    }

    public void b() {
        c();
        this.a.b(this.f);
        this.c.b();
    }

    public void a() {
        a(0L);
    }
}
