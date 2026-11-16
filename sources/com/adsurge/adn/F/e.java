package com.adsurge.adn.F;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.adsurge.adn.G.f;
import com.adsurge.adn.X.x;
import com.adsurge.adn.X.y;
import com.adsurge.adn.p011c0.g;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements g {
    public static final e c = b();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final int a = com.adsurge.adn.N.b.a("selmit", 5000);

    public static e b() {
        int iA = x.a("dsec", 0);
        x.a("dsec");
        if (iA > 0 && iA <= 1023) {
            if (((y.c() ? 256 : 512) & iA) != 0 && new Random().nextInt(255) < (iA & 255)) {
                return new f();
            }
        }
        return new b();
    }

    public abstract d a();

    public abstract boolean b(int i);

    public abstract void e();

    public abstract boolean g();

    public static e d() {
        return c;
    }

    public int c() {
        return this instanceof f ? 2 : 1;
    }

    public boolean f() {
        return this.b.getLooper().getThread() == Thread.currentThread();
    }

    @Override // com.adsurge.adn.p011c0.g
    public void a(com.adsurge.adn.Y0.c cVar) {
        try {
            boolean zF = f();
            int i = this.a;
            if (zF) {
                i /= 5;
            }
            if (!b(i)) {
                com.adsurge.adn.w1.b.a(9130092, cVar, Integer.valueOf(i), Integer.valueOf(c()), (com.adsurge.adn.Y0.d) null);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void a(int i) {
        if (i > 0 && i <= 1023 && (i & 768) != 0) {
            x.b("dsec", i);
        } else {
            x.a("dsec");
        }
    }

    public void a(Runnable runnable) {
        if (f()) {
            runnable.run();
        } else {
            this.b.post(runnable);
        }
    }

    public void a(Object obj, Runnable runnable) {
        if (f()) {
            runnable.run();
        } else {
            this.b.postAtTime(runnable, obj, SystemClock.uptimeMillis());
        }
    }

    public void a(Object obj) {
        this.b.removeCallbacksAndMessages(obj);
    }
}
