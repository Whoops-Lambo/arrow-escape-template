package com.mbridge.msdk.config.activity;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.r93;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static volatile InterfaceC1399b a = null;
    private static volatile boolean b = false;
    private static volatile boolean c = false;
    private static volatile boolean d = true;
    private static volatile boolean e;
    private static volatile boolean f;
    private static final Object g = new Object();
    private static final Handler h = new Handler(Looper.getMainLooper());
    private static final Runnable i = new a();
    private static final com.mbridge.msdk.config.component.status.a j = new r93(1);

    /* JADX INFO: renamed from: com.mbridge.msdk.config.activity.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC1399b {
        void a();

        void a(int i);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.g) {
                try {
                    if (!b.b) {
                        return;
                    }
                    if (b.a != null) {
                        if (!b.d) {
                            return;
                        }
                        boolean unused = b.b = false;
                        InterfaceC1399b interfaceC1399b = b.a;
                        InterfaceC1399b unused2 = b.a = null;
                        try {
                            interfaceC1399b.a();
                            q0.a("AdSessionRestorer", "ad session restored after task reset");
                            return;
                        } catch (Throwable th) {
                            q0.b("AdSessionRestorer", "restore error: " + th.getMessage());
                            b.b(interfaceC1399b, 2);
                            b.g();
                            return;
                        }
                    }
                    boolean unused3 = b.b = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(d dVar) {
        if (dVar == null || dVar.d() == null) {
            return;
        }
        if (!"916003".equals(dVar.d())) {
            if ("916004".equals(dVar.d())) {
                d = false;
            }
        } else {
            d = true;
            if (b) {
                h.post(i);
            }
        }
    }

    public static boolean b(InterfaceC1399b interfaceC1399b) {
        synchronized (g) {
            try {
                if (c && !f && interfaceC1399b != null) {
                    a = interfaceC1399b;
                    b = true;
                    h.postDelayed(i, 300L);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static synchronized void e() {
        if (e) {
            return;
        }
        try {
            com.mbridge.msdk.config.component.status.b bVar = com.mbridge.msdk.foundation.controller.a.s;
            if (bVar == null) {
                return;
            }
            bVar.a(j);
            e = true;
        } catch (Throwable th) {
            q0.b("AdSessionRestorer", "ensureLifecycleSubscription: " + th.getMessage());
        }
    }

    public static boolean f() {
        return f;
    }

    public static void g() {
        int i2;
        InterfaceC1399b interfaceC1399bK;
        synchronized (g) {
            i2 = f ? 1 : 2;
            interfaceC1399bK = k();
            c = false;
            a = null;
            b = false;
        }
        b(interfaceC1399bK, i2);
        h.removeCallbacks(i);
        l();
        MBAdTaskWatchService.b();
    }

    public static void h() {
        synchronized (g) {
            k();
            c = true;
            b = false;
            d = true;
            f = false;
        }
        e();
        MBAdTaskWatchService.a();
    }

    public static void i() {
        InterfaceC1399b interfaceC1399bK;
        synchronized (g) {
            interfaceC1399bK = k();
            c = true;
            b = false;
            d = true;
            f = false;
        }
        b(interfaceC1399bK, 2);
        e();
        MBAdTaskWatchService.a();
    }

    public static void j() {
        synchronized (g) {
            f = true;
        }
        g();
    }

    private static InterfaceC1399b k() {
        if (!b) {
            return null;
        }
        b = false;
        InterfaceC1399b interfaceC1399b = a;
        a = null;
        return interfaceC1399b;
    }

    private static synchronized void l() {
        try {
            com.mbridge.msdk.config.component.status.b bVar = com.mbridge.msdk.foundation.controller.a.s;
            if (bVar == null) {
                return;
            }
            bVar.b(j);
            e = false;
        } catch (Throwable th) {
            q0.b("AdSessionRestorer", "unregisterLifecycleSubscription: " + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(InterfaceC1399b interfaceC1399b, int i2) {
        if (interfaceC1399b == null) {
            return;
        }
        try {
            interfaceC1399b.a(i2);
        } catch (Throwable th) {
            q0.b("AdSessionRestorer", "abort error: " + th.getMessage());
        }
    }
}
