package com.lessmore.arrows.profiling;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import androidx.annotation.Keep;
import com.applovin.impl.sdk.utils.JsonUtils;
import defpackage.si2;
import defpackage.ti2;
import defpackage.ue0;
import defpackage.uj2;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Keep
public final class StartupLifecycleProvider extends ContentProvider {
    private static Application application;
    private static long latestId;
    private static long nextId;
    private static int unityCreations;
    private static final Object gate = new Object();
    private static final Map<Long, ti2> launches = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$classify$0(ti2 ti2Var) {
        for (int i = 0; i < 3; i++) {
            try {
                SystemClock.sleep(250L);
                if (uj2.d(ti2Var)) {
                    return;
                }
            } catch (Exception | LinkageError unused) {
                return;
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public static /* synthetic */ int access$208() {
        int i = unityCreations;
        unityCreations = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void add(Activity activity, String str, long j) {
        ti2 ti2Var = new ti2();
        ti2Var.g = "lifecycle";
        ti2Var.h = -1.0d;
        ti2Var.i = -1.0d;
        long j2 = nextId + 1;
        nextId = j2;
        ti2Var.a = j2;
        ti2Var.b = SystemClock.uptimeMillis();
        ti2Var.c = j;
        ti2Var.d = activity.getClass().getName();
        ti2Var.e = str;
        ti2Var.f = str;
        launches.put(Long.valueOf(ti2Var.a), ti2Var);
        latestId = ti2Var.a;
        while (true) {
            Map<Long, ti2> map = launches;
            if (map.size() <= 4) {
                return;
            } else {
                map.remove(map.keySet().iterator().next());
            }
        }
    }

    public static void classify(long j) {
        synchronized (gate) {
            ti2 ti2Var = launches.get(Long.valueOf(j));
            if (ti2Var != null && !ti2Var.j) {
                ti2Var.j = true;
                if (Build.VERSION.SDK_INT < 35 || application == null) {
                    return;
                }
                new Thread(new ue0(ti2Var, 29), "ArrowsStartupInfo").start();
            }
        }
    }

    private static String json(ti2 ti2Var) {
        if (ti2Var == null) {
            return JsonUtils.EMPTY_JSON;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", ti2Var.a);
            jSONObject.put("kind", ti2Var.e);
            jSONObject.put("startType", ti2Var.f);
            jSONObject.put("source", ti2Var.g);
            jSONObject.put("nativeToUnityMs", ti2Var.h);
            jSONObject.put("androidTtidMs", ti2Var.i);
            return jSONObject.toString();
        } catch (Exception unused) {
            return JsonUtils.EMPTY_JSON;
        }
    }

    public static String latest() {
        String strJson;
        synchronized (gate) {
            strJson = json(launches.get(Long.valueOf(latestId)));
        }
        return strJson;
    }

    public static void markUnity(long j) {
        synchronized (gate) {
            try {
                ti2 ti2Var = launches.get(Long.valueOf(j));
                if (ti2Var != null && ti2Var.h < 0.0d) {
                    ti2Var.h = Math.max(0L, SystemClock.uptimeMillis() - ti2Var.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String result(long j) {
        String strJson;
        synchronized (gate) {
            strJson = json(launches.get(Long.valueOf(j)));
        }
        return strJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isUnity(Activity activity) {
        for (Class<?> superclass = activity.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            String name = superclass.getName();
            if (name.equals("com.unity3d.player.UnityPlayerActivity") || name.equals("com.unity3d.player.UnityPlayerGameActivity")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            Application application2 = (Application) getContext().getApplicationContext();
            application = application2;
            application2.registerActivityLifecycleCallbacks(new si2());
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
