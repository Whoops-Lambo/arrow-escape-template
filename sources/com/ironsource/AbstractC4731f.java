package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4731f<T> {
    private Object a = new Object();
    private Timer b;
    protected long c;
    protected T d;

    /* JADX INFO: renamed from: com.ironsource.f$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC4731f.this.b();
        }
    }

    public abstract void b();

    public void d() {
        this.d = null;
    }

    public void c() {
        synchronized (this.a) {
            try {
                Timer timer = this.b;
                if (timer != null) {
                    timer.cancel();
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AbstractC4731f(long j) {
        this.c = j;
    }

    public void a(T t) {
        if (a() || t == null) {
            return;
        }
        this.d = t;
        c();
        synchronized (this.a) {
            Timer timer = new Timer();
            this.b = timer;
            timer.schedule(new a(), this.c);
        }
    }

    public AbstractC4731f() {
    }

    public boolean a() {
        return this.c <= 0;
    }
}
