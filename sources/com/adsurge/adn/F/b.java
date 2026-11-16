package com.adsurge.adn.F;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.adsurge.adn.I0.h;
import com.adsurge.adn.p011c0.g;
import com.adsurge.adn.x1.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends e {
    public static String i = "YWRzdXJnZXFqcw==";
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final ArrayList f = new ArrayList();
    public int g = 999;
    public volatile CountDownLatch h = new CountDownLatch(1);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ boolean a;

        public a(g.a aVar, boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a((g.a) null, this.a);
        }
    }

    /* JADX INFO: renamed from: com.adsurge.adn.F.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0072b implements Runnable {
        public RunnableC0072b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = b.this.f.iterator();
            if (it.hasNext()) {
                com.adsurge.adn.F.c.a(it.next());
                throw null;
            }
            b.this.f.clear();
        }
    }

    @Override // com.adsurge.adn.F.e
    public void e() {
        a(true);
        CountDownLatch countDownLatch = this.h;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.h = null;
        }
    }

    public final String a(String str) {
        try {
            Context contextA = com.adsurge.adn.J.a.d().a();
            if (contextA == null) {
                return "";
            }
            return h.a(new File(contextA.getApplicationInfo().nativeLibraryDir, "lib" + str + ".so"));
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.adsurge.adn.F.e
    public boolean b(int i2) {
        CountDownLatch countDownLatch = this.h;
        return countDownLatch == null || countDownLatch.await((long) i2, TimeUnit.MILLISECONDS);
    }

    @Override // com.adsurge.adn.F.e
    public boolean g() {
        return this.d.get();
    }

    public final void i() {
        this.d.compareAndSet(false, true);
        com.adsurge.adn.I0.g.a(new c());
    }

    public b() {
        try {
            i = new String(Base64.decode(i, 10), com.adsurge.adn.B0.a.a);
        } catch (Exception unused) {
        }
    }

    public final void h() {
        if (g()) {
            return;
        }
        m.a(9130028, this.g);
        try {
            System.loadLibrary(i);
            i();
            m.a(9130039, this.g);
        } catch (Throwable th) {
            com.adsurge.adn.p059u.c.b().e();
            m.a(9130029, this.g, 3, Log.getStackTraceString(th), a(i));
        }
    }

    public final void j() {
        if (!g() && this.e.compareAndSet(false, true)) {
            if (f()) {
                com.adsurge.adn.x1.g.c.submit(new RunnableC0072b());
            } else {
                h();
            }
        }
    }

    public final void a(boolean z) {
        if (z && !f() && !g()) {
            j();
        } else {
            a((g.a) null, z);
        }
    }

    public void a(g.a aVar, boolean z) {
        if (!f()) {
            com.adsurge.adn.I0.g.a(new a(aVar, z));
            return;
        }
        if (g()) {
            if (aVar != null) {
                aVar.a();
            }
        } else {
            if (aVar != null) {
                this.f.add(aVar);
            }
            j();
        }
    }

    @Override // com.adsurge.adn.F.e
    public d a() {
        if (g()) {
            com.adsurge.adn.F.a aVar = new com.adsurge.adn.F.a();
            if (aVar.c()) {
                return aVar;
            }
            return null;
        }
        a((g.a) null, false);
        return null;
    }
}
