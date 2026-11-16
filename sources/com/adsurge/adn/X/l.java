package com.adsurge.adn.X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class l {
    public Context a;
    public int c;
    public volatile Activity e;
    public volatile boolean g;
    public volatile int h = -1;
    public final List b = new ArrayList();
    public volatile int d = f.a;
    public final Application.ActivityLifecycleCallbacks f = new a();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.this.a("onActivityCreated", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            l.this.a("onActivityDestroyed", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            l.this.a("onActivityPaused", activity);
            com.adsurge.adn.r1.a.e();
            l lVar = l.this;
            if (lVar.c != 0 || activity == null) {
                return;
            }
            lVar.c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            l.this.a("onActivityResumed", activity);
            com.adsurge.adn.r1.a.f();
            l.this.e = activity;
            l lVar = l.this;
            int i = lVar.c;
            if (activity != null) {
                lVar.c = activity.hashCode();
            }
            if (i == 0) {
                l.this.e();
            }
            if (l.this.h >= 0 || l.this.e == null || l.this.e.getIntent() == null) {
                return;
            }
            l lVar2 = l.this;
            lVar2.h = lVar2.e.getIntent().getSourceBounds() == null ? 0 : 1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            l.this.a("onActivityStarted", activity);
            l lVar = l.this;
            int i = lVar.c;
            lVar.c = activity != null ? activity.hashCode() : i;
            com.adsurge.adn.r1.a.g();
            if (i == 0) {
                l.this.e();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            l.this.a("onActivityStopped", activity);
            com.adsurge.adn.r1.a.h();
            if (l.this.e == activity) {
                l.this.e = null;
            }
            if (activity != null) {
                int iHashCode = activity.hashCode();
                l lVar = l.this;
                if (iHashCode == lVar.c) {
                    lVar.c = 0;
                    lVar.d();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        public final /* synthetic */ g a;

        public b(g gVar) {
            this.a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l.this.b.contains(this.a)) {
                return;
            }
            l.this.b.add(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        public final /* synthetic */ g a;

        public c(g gVar) {
            this.a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.b.remove(this.a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = l.this.b.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                l.this.g = true;
                if (gVar.a()) {
                    it.remove();
                }
                l.this.g = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = l.this.b.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                l.this.g = true;
                if (gVar.b()) {
                    it.remove();
                }
                l.this.g = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class f {
        public static int a = -1;
        public static int b = 0;
        public static int c = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface g {
        boolean a();

        boolean b();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class h {
        public static final l a = new l();
    }

    public void a(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
        }
        this.a = context;
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this.f);
        }
        com.adsurge.adn.I0.a.a().a(context);
    }

    public void b(g gVar) {
        if (gVar == null) {
            return;
        }
        c cVar = new c(gVar);
        if (this.g) {
            com.adsurge.adn.I0.g.a(cVar);
        } else {
            com.adsurge.adn.I0.g.b(cVar);
        }
    }

    public boolean c() {
        if (this.d == f.a) {
            if (o.d(this.a)) {
                this.d = f.c;
            } else {
                this.d = f.b;
            }
        }
        return this.d == f.c;
    }

    public final void d() {
        this.d = f.b;
        com.adsurge.adn.I0.g.b(new e());
    }

    public final void e() {
        this.d = f.c;
        com.adsurge.adn.I0.g.b(new d());
    }

    public static l b() {
        return h.a;
    }

    public final void a(String str, Activity activity) {
    }

    public void a(g gVar) {
        if (gVar == null) {
            return;
        }
        b bVar = new b(gVar);
        if (this.g) {
            com.adsurge.adn.I0.g.a(bVar);
        } else {
            com.adsurge.adn.I0.g.b(bVar);
        }
    }

    public Activity a() {
        return this.e;
    }
}
