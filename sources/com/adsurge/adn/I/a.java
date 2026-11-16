package com.adsurge.adn.I;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.adsurge.adn.X.r;
import com.adsurge.adn.p059u.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final List a = new LinkedList();
    public static final AtomicReference b = new AtomicReference(null);
    public static boolean c = false;
    public static Handler d;

    /* JADX INFO: renamed from: com.adsurge.adn.I.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class RunnableC0078a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            a.d(new ArrayList(a.a));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        public final /* synthetic */ com.adsurge.adn.I.b a;

        public b(com.adsurge.adn.I.b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = a.a;
            if (list.size() >= 1000) {
                Iterator it = list.iterator();
                for (int size = list.size() - 999; size > 0 && it.hasNext(); size--) {
                    it.next();
                    it.remove();
                }
            }
            List list2 = a.a;
            list2.add(this.a);
            if (list2.size() >= 30) {
                a.d(new ArrayList(list2));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            a.a();
        }
    }

    public static void a(boolean z) {
        AtomicReference atomicReference = b;
        Boolean bool = z ? Boolean.TRUE : Boolean.FALSE;
        while (!atomicReference.compareAndSet(null, bool)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        boolean z2 = com.adsurge.adn.N.b.a("odclre", 1) == 1 && com.adsurge.adn.J.a.d().b().i() && z;
        c = z2;
        if (z2) {
            HandlerThread handlerThread = new HandlerThread("odc_log_report");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            if (looper != null) {
                d = new Handler(looper);
            }
            ((Application) com.adsurge.adn.J.a.d().a()).registerActivityLifecycleCallbacks(new c());
        }
    }

    public static void d(List list) {
        JSONObject jSONObjectA;
        com.adsurge.adn.H0.b bVar;
        if (list == null || list.isEmpty() || !r.e() || (jSONObjectA = a(list)) == null) {
            return;
        }
        Future futureA = a(jSONObjectA);
        if (futureA != null) {
            try {
                bVar = (com.adsurge.adn.H0.b) futureA.get();
            } catch (Exception unused) {
                b(list);
                return;
            }
        } else {
            bVar = null;
        }
        if (bVar == null || bVar.b() != 200) {
            b(list);
        } else {
            c(list);
        }
    }

    public static void b(String str, com.adsurge.adn.Y0.c cVar) {
        a(str, cVar);
    }

    public static void c(List list) {
        list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a.remove((com.adsurge.adn.I.b) it.next());
        }
    }

    public static void b(List list) {
        list.size();
    }

    public static void a() {
        Handler handler;
        if (!c || (handler = d) == null) {
            return;
        }
        handler.post(new RunnableC0078a());
    }

    public static void a(String str) {
        a(str, null);
    }

    public static void a(String str, com.adsurge.adn.Y0.c cVar) {
        if (str == null || !c) {
            return;
        }
        com.adsurge.adn.I.b bVar = new com.adsurge.adn.I.b(false);
        bVar.b(str);
        bVar.a(cVar);
        a(bVar);
    }

    public static void a(com.adsurge.adn.I.b bVar) {
        Handler handler = d;
        if (handler == null) {
            return;
        }
        handler.post(new b(bVar));
    }

    public static JSONObject a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((com.adsurge.adn.I.b) it.next()).b());
        }
        return h.b("logs", jSONArray.toString()).k();
    }

    public static Future a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        return com.adsurge.adn.R.c.a().a(new com.adsurge.adn.T.c(com.adsurge.adn.p069z.a.i(), com.adsurge.adn.H0.a.EnumC0076a.POST, jSONObject.toString().getBytes(com.adsurge.adn.B0.a.a)), com.adsurge.adn.G0.c.a.Low);
    }
}
