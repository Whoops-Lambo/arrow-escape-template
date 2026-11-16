package com.adsurge.adn.p005a0;

import com.adsurge.adn.Z.c;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static WeakReference a;

    /* JADX INFO: renamed from: com.adsurge.adn.a0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class RunnableC0098a implements Runnable {
        public long a;
        public long b;

        @Override // java.lang.Runnable
        public void run() {
            if (a.a.get() == null) {
                a.b();
            }
            if (this.b >= 0) {
                long jCurrentTimeMillis = com.adsurge.adn.Z.a.a().currentTimeMillis();
                if (jCurrentTimeMillis > this.b) {
                    long[] jArrF = com.adsurge.adn.Z.a.f();
                    int length = jArrF.length - 1;
                    for (int i = 0; i <= length; i += 2) {
                        if (i == length) {
                            this.b = -1L;
                            this.a = jArrF[length];
                            break;
                        }
                        long j = jArrF[i];
                        if (j > jCurrentTimeMillis) {
                            this.b = j;
                            this.a = jArrF[i + 1];
                            break;
                        }
                    }
                }
            }
            if (this.a <= 0) {
                this.a = 10000L;
                this.b = -1L;
            }
            c.a().postDelayed(this, this.a);
        }
    }

    public static void b() {
        b bVar = new b(Thread.getDefaultUncaughtExceptionHandler());
        Thread.setDefaultUncaughtExceptionHandler(bVar);
        a = new WeakReference(bVar);
    }

    public static void a() {
        b();
        c.a().post(new RunnableC0098a());
    }
}
