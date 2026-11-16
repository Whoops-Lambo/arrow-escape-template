package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    private static long b;
    private final b a;
    private boolean c = false;
    private final Runnable d;

    public final void b() {
        this.c = true;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        m.a().a(this.d, 5000L);
    }

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.c) {
                    return;
                }
                c.this.a.d();
                long unused = c.b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.d, 500L);
                } else {
                    m.a().a(c.this.d, 500L);
                }
                com.apm.insight.runtime.b.a(c.b);
            }
        };
        this.d = runnable;
        this.a = bVar;
        m.a().a(runnable, 5000L);
    }

    public static boolean c() {
        if (SystemClock.uptimeMillis() - b <= 15000) {
            return true;
        }
        return false;
    }
}
