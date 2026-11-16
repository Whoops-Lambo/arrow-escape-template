package com.mbridge.msdk.config.dynamic.utils;

import android.os.Handler;
import android.os.Looper;
import defpackage.qb3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class f {
    private final Handler a;
    private final long b;
    private final boolean c;
    private final boolean d;
    private final Runnable e;
    private long f;
    private boolean g;
    private final Runnable h;

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        if (this.g) {
            a(System.currentTimeMillis());
            this.g = false;
        }
    }

    public synchronized void c() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.c) {
                long j = this.f;
                if (j != 0) {
                    if (jCurrentTimeMillis - j >= this.b) {
                    }
                }
                a(jCurrentTimeMillis);
                this.g = false;
                return;
            }
            this.g = true;
            long j2 = this.f;
            long j3 = this.b;
            if (j2 != 0) {
                j3 -= jCurrentTimeMillis - j2;
            }
            if (j3 <= 0) {
                j3 = this.b;
            }
            this.a.removeCallbacks(this.h);
            this.a.postDelayed(this.h, j3);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a() {
        this.a.removeCallbacks(this.h);
        this.g = false;
    }

    public f(long j, boolean z, boolean z2, Runnable runnable) {
        this.a = new Handler(Looper.getMainLooper());
        this.f = 0L;
        this.g = false;
        this.h = new qb3(this, 19);
        this.b = j <= 0 ? 100L : j;
        this.c = z;
        this.d = z2;
        this.e = runnable;
    }

    private void a(long j) {
        this.f = j;
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }

    public f(Runnable runnable) {
        this(100L, true, true, runnable);
    }
}
