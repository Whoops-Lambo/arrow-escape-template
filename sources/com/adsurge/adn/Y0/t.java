package com.adsurge.adn.Y0;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class t {
    public Handler a;
    public Context b;
    public n c;
    public r d;
    public Runnable e = new d();
    public Runnable f = new e();
    public Runnable g = new f();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.adsurge.adn.Y0.k.a(t.this.b.getApplicationContext()).c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        public final /* synthetic */ com.adsurge.adn.Y0.a a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ o c;

        public c(com.adsurge.adn.Y0.a aVar, boolean z, o oVar) {
            this.a = aVar;
            this.b = z;
            this.c = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.a(this.b);
                this.a.a(this.c);
                if (this.b) {
                    this.a.f();
                } else {
                    t.this.a(l.ITEM_ADD);
                }
            } catch (NullPointerException unused) {
            }
            if (com.adsurge.adn.J0.a.a) {
                com.adsurge.adn.J0.a.a("new " + this.c.getClass().getName() + ": " + this.c.c(), new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!com.adsurge.adn.I0.a.a().b()) {
                t.this.a(l.BACKGROUND);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.c.g();
            t.this.d.g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.c.a();
            t.this.d.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.c.f();
            t.this.d.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class j extends BroadcastReceiver {
        public j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            t.this.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class k implements Application.ActivityLifecycleCallbacks {
        public t a;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            this.a.f();
            this.a.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            this.a.a(l.PAGE_SWITCH);
        }

        public k(t tVar) {
            this.a = tVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum l {
        SDK_INIT,
        BACKGROUND,
        ITEM_ADD,
        PAGE_SWITCH,
        NETWORK_CHANGE
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class m {
        public static final t a = new t();
    }

    public final void b() {
        Handler handler;
        com.adsurge.adn.J0.a.a("Call commit stat", new Object[0]);
        if (com.adsurge.adn.D0.a.c().d().a() && (handler = this.a) != null) {
            handler.post(new h());
        }
    }

    public final void e() {
        Handler handler;
        com.adsurge.adn.J0.a.a("Call report stat", new Object[0]);
        if (com.adsurge.adn.D0.a.c().d().a() && (handler = this.a) != null) {
            handler.post(new i());
        }
    }

    public final void f() {
        com.adsurge.adn.J0.a.a("Call save stat", new Object[0]);
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new g());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[l.values().length];
            a = iArr;
            try {
                iArr[l.SDK_INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[l.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[l.ITEM_ADD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[l.PAGE_SWITCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[l.NETWORK_CHANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static t c() {
        return m.a;
    }

    public void a(l lVar) {
        com.adsurge.adn.J0.a.a("Stat check type: " + lVar, new Object[0]);
        if (this.a == null) {
            return;
        }
        int i2 = a.a[lVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            this.a.removeCallbacks(this.e);
            this.a.postDelayed(this.e, 500L);
        } else if (i2 == 3 || i2 == 4 || i2 == 5) {
            this.a.removeCallbacks(this.f);
            this.a.postDelayed(this.f, 500L);
        }
    }

    public final void d() {
        a(l.NETWORK_CHANGE);
    }

    public t() {
        Context contextA = com.adsurge.adn.D0.a.c().a();
        this.b = contextA;
        this.c = new n(contextA);
        this.d = new r(this.b);
        HandlerThread handlerThread = new HandlerThread("eudk_stat_service");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        if (looper != null) {
            this.a = new Handler(looper);
        } else {
            com.adsurge.adn.J0.a.a("Create stat handler failed!");
        }
        if (this.b instanceof Application) {
            com.adsurge.adn.J0.a.a("Stat register activity listener", new Object[0]);
            ((Application) this.b).registerActivityLifecycleCallbacks(new k(this));
        }
        a(this.b);
        a(l.SDK_INIT);
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new b());
        }
    }

    public void a(com.adsurge.adn.Y0.l lVar, boolean z) {
        a(this.c, lVar, z);
    }

    public final void a(com.adsurge.adn.Y0.a aVar, o oVar, boolean z) {
        Handler handler = this.a;
        if (handler == null || oVar == null) {
            return;
        }
        handler.post(new c(aVar, z, oVar));
    }

    public void a(p pVar) {
        a(this.d, pVar, false);
    }

    public final void a() {
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacks(this.g);
            this.a.postDelayed(this.g, 1000L);
        }
    }

    public void a(Context context) {
        try {
            context.getApplicationContext().registerReceiver(new j(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Throwable unused) {
        }
    }
}
