package com.adsurge.adn.I0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public Context a;
    public int c;
    public volatile Activity e;
    public volatile boolean g;
    public volatile int h = -1;
    public final List b = new ArrayList();
    public volatile int d = d.a;
    public final Application.ActivityLifecycleCallbacks f = new C0079a();

    /* JADX INFO: renamed from: com.adsurge.adn.I0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class C0079a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public C0079a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            a.this.a("onActivityCreated", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            a.this.a("onActivityDestroyed", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            a.this.a("onActivityPaused", activity);
            a aVar = a.this;
            if (aVar.c != 0 || activity == null) {
                return;
            }
            aVar.c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            a.this.a("onActivityResumed", activity);
            a.this.e = activity;
            a aVar = a.this;
            int i = aVar.c;
            if (activity != null) {
                aVar.c = activity.hashCode();
            }
            if (i == 0) {
                a.this.d();
            }
            if (a.this.h >= 0 || a.this.e == null || a.this.e.getIntent() == null) {
                return;
            }
            a aVar2 = a.this;
            aVar2.h = aVar2.e.getIntent().getSourceBounds() == null ? 0 : 1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            a.this.a("onActivityStarted", activity);
            a aVar = a.this;
            int i = aVar.c;
            aVar.c = activity != null ? activity.hashCode() : i;
            if (i == 0) {
                a.this.d();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a.this.a("onActivityStopped", activity);
            if (a.this.e == activity) {
                a.this.e = null;
            }
            if (activity != null) {
                int iHashCode = activity.hashCode();
                a aVar = a.this;
                if (iHashCode == aVar.c) {
                    aVar.c = 0;
                    aVar.c();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = a.this.b.iterator();
            if (it.hasNext()) {
                com.adsurge.adn.F.c.a(it.next());
                a.this.g = true;
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = a.this.b.iterator();
            if (it.hasNext()) {
                com.adsurge.adn.F.c.a(it.next());
                a.this.g = true;
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class d {
        public static int a = -1;
        public static int b = 0;
        public static int c = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class e {
        public static final a a = new a();
    }

    public void a(Context context) {
        this.a = context;
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this.f);
        }
    }

    public boolean b() {
        if (this.d == d.a) {
            if (com.adsurge.adn.I0.b.c(this.a)) {
                this.d = d.c;
            } else {
                this.d = d.b;
            }
        }
        return this.d == d.c;
    }

    public final void c() {
        this.d = d.b;
        g.b(new c());
    }

    public final void d() {
        this.d = d.c;
        g.b(new b());
    }

    public final void a(String str, Activity activity) {
        com.adsurge.adn.J0.a.a("AppStatusManager %s, %s", str, activity);
    }

    public static a a() {
        return e.a;
    }
}
