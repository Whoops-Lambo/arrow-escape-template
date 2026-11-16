package com.adsurge.adn.X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Window;
import com.facebook.login.a0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements Application.ActivityLifecycleCallbacks, l.g {
    public static volatile f c;
    public volatile Set a = Collections.EMPTY_SET;
    public final Map b = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            f.this.a("on_activity_interaction", f.a(this.a, this.b).a("x", (int) motionEvent.getX()).a("y", (int) motionEvent.getY()).a("pressDurationMs", motionEvent.getEventTime() - motionEvent.getDownTime()).a());
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b {
        public volatile JSONObject a;
        public volatile JSONObject b;
        public long c = -1;
        public long d;

        public void a() {
            if (this.c >= 0) {
                this.d = (SystemClock.elapsedRealtime() - this.c) + this.d;
                this.c = -1L;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static f c() {
        if (c == null) {
            synchronized (f.class) {
                try {
                    if (c == null) {
                        c = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public void a(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i, "");
                if (!strOptString.isEmpty()) {
                    hashSet.add(strOptString);
                }
            }
        }
        this.a = hashSet;
        if (hashSet.isEmpty()) {
            l.b().b(this);
        } else {
            l.b().a(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        a(activity, "onActivityDestroyed");
        String localClassName = activity.getLocalClassName();
        if (this.a.contains(localClassName)) {
            String strA = a(activity);
            b bVar = (b) this.b.get(strA);
            if (bVar != null) {
                bVar.a();
            }
            a("on_activity_destroyed", a(localClassName, strA).a("durationMs", bVar != null ? bVar.d : 0L).a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity, "onActivityPaused");
        String localClassName = activity.getLocalClassName();
        if (this.a.contains(localClassName)) {
            String strA = a(activity);
            b bVar = (b) this.b.get(strA);
            if (bVar != null) {
                bVar.a();
                if (bVar.b == null) {
                    Window window = activity.isDestroyed() ? null : activity.getWindow();
                    bVar.b = AbstractC1631d.a(window != null ? window.getDecorView() : null);
                }
            }
            a("on_activity_paused", a(localClassName, strA).a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        a(activity, "onActivityResumed");
        String localClassName = activity.getLocalClassName();
        if (this.a.contains(localClassName)) {
            String strA = a(activity);
            b bVar = (b) this.b.get(strA);
            if (bVar == null) {
                bVar = new b();
                this.b.put(strA, bVar);
                Window window = activity.isDestroyed() ? null : activity.getWindow();
                bVar.a = AbstractC1631d.a(window != null ? window.getDecorView() : null);
                WindowCallbackC1632e.a(activity, new GestureDetector(activity, new a(localClassName, strA)));
            }
            if (bVar.c < 0) {
                bVar.c = SystemClock.elapsedRealtime();
            }
            a("on_activity_resumed", a(localClassName, strA).a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(activity, "onActivityStarted");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(activity, "onActivityStopped");
    }

    public final /* synthetic */ void b(String str, JSONObject jSONObject) {
        com.adsurge.adn.B.b.c().a(str, jSONObject, (com.adsurge.adn.u1.c) null, (Map) null);
        if ("on_activity_destroyed".equals(str)) {
            this.b.remove(jSONObject.optString("activityId"));
        }
    }

    @Override // com.adsurge.adn.X.l.g
    public boolean b() {
        if (this.a.isEmpty()) {
            return false;
        }
        a("on_app_background", new JSONObject());
        return false;
    }

    @Override // com.adsurge.adn.X.l.g
    public boolean a() {
        return false;
    }

    public final void a(Activity activity, String str) {
    }

    public JSONObject a(String str, int i) {
        b bVar = str != null ? (b) this.b.get(str) : null;
        if (bVar == null) {
            return null;
        }
        if (i == 0) {
            return bVar.a;
        }
        if (i != 1) {
            return null;
        }
        return bVar.b;
    }

    public final void a(String str, JSONObject jSONObject) {
        q.c.execute(new a0(9, this, str, jSONObject));
    }

    public static String a(Activity activity) {
        return String.valueOf(System.identityHashCode(activity));
    }

    public static com.adsurge.adn.I0.e a(String str, String str2) {
        return new com.adsurge.adn.I0.e().a("activityClass", str).a("activityId", str2);
    }
}
