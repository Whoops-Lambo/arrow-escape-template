package com.adsurge.adn.G;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import defpackage.bl1;
import defpackage.n30;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Map b = new ConcurrentHashMap();
    public final ThreadLocal c = new ThreadLocal();
    public final ThreadLocal d = new ThreadLocal();
    public final ConcurrentMap e = new ConcurrentHashMap();

    public static Object a(JSONArray jSONArray, int i, Class cls) {
        if (jSONArray == null) {
            return null;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return Boolean.valueOf(jSONArray.optBoolean(i));
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return Integer.valueOf(jSONArray.optInt(i));
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return Long.valueOf(jSONArray.optLong(i));
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return Double.valueOf(jSONArray.optDouble(i, 0.0d));
        }
        if (cls == String.class) {
            return jSONArray.optString(i);
        }
        if (cls == JSONObject.class) {
            return jSONArray.optJSONObject(i);
        }
        if (cls == JSONArray.class) {
            return jSONArray.optJSONArray(i);
        }
        return null;
    }

    @JavascriptInterface
    public void complete(String str, String str2, String str3) {
        Object obj;
        Throwable illegalStateException;
        Object obj2 = null;
        if (str3 != null) {
            illegalStateException = new IllegalStateException(str3);
        } else {
            try {
                obj = new JSONArray(str2).get(0);
                try {
                    if (obj == JSONObject.NULL) {
                        illegalStateException = null;
                    } else {
                        Object obj3 = obj2;
                        obj2 = obj;
                        illegalStateException = obj3;
                    }
                } catch (JSONException e) {
                    obj2 = e;
                }
            } catch (JSONException e2) {
                obj2 = e2;
                obj = null;
            }
        }
        a(str, obj2, illegalStateException);
    }

    /* JADX INFO: renamed from: com.adsurge.adn.G.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class C0074a {
        public final Object a;
        public final Map b;
        public final b c;

        public C0074a(Object obj, Map map, b bVar) {
            this.a = obj;
            this.b = map;
            this.c = bVar;
        }
    }

    public final JSONObject b(String str, Method method, Object obj, Object[] objArr) {
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a.post(new bl1(this, atomicReference, str, method, obj, objArr, countDownLatch, 2));
        try {
            countDownLatch.await();
            JSONObject jSONObject = (JSONObject) atomicReference.get();
            if (jSONObject != null) {
                return jSONObject;
            }
            return a("no result: " + method.getName());
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return a("interrupted: " + method.getName());
        }
    }

    public boolean c(String str) {
        return this.e.containsKey(str);
    }

    public void d(String str) {
        String strM = n30.m(str, "::");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(strM)) {
                it.remove();
            }
        }
    }

    @JavascriptInterface
    public String invoke(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            C0074a c0074a = (C0074a) this.b.get(str);
            if (c0074a == null) {
                jSONObject.put("t", "null");
                return jSONObject.toString();
            }
            Method method = (Method) c0074a.b.get(str2);
            if (method == null) {
                jSONObject.put("t", "null");
                return jSONObject.toString();
            }
            JSONArray jSONArray = new JSONArray(str3);
            Class<?>[] parameterTypes = method.getParameterTypes();
            Object[] objArr = new Object[parameterTypes.length];
            for (int i = 0; i < parameterTypes.length; i++) {
                objArr[i] = a(jSONArray, i, parameterTypes[i]);
            }
            b bVar = c0074a.c;
            b bVar2 = b.CURRENT;
            Object obj = c0074a.a;
            return bVar == bVar2 ? a(str, method, obj, objArr).toString() : b(str, method, obj, objArr).toString();
        } catch (Throwable th) {
            a(jSONObject, th);
            return jSONObject.toString();
        }
    }

    public void b(String str) {
        String strM = n30.m(str, "::");
        for (String str2 : this.e.keySet()) {
            if (str2.startsWith(strM)) {
                a(str2, (Object) null, new IllegalStateException("WebView script scope is destroyed"));
            }
        }
    }

    public void a(String str, Object obj, Throwable th) {
        e.c cVar = (e.c) this.e.remove(str);
        if (cVar != null) {
            cVar.a(obj, th);
        }
    }

    public String a(String str, Class cls, Object obj, b bVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Method method : cls.getMethods()) {
            linkedHashMap.put(method.getName(), method);
        }
        this.b.put(str, new C0074a(obj, linkedHashMap, bVar));
        return new JSONArray((Collection) linkedHashMap.keySet()).toString();
    }

    public boolean a(Object obj, String str) {
        String str2 = (String) this.c.get();
        if (str2 == null) {
            return false;
        }
        if (!str2.startsWith(obj + "::") || !this.b.containsKey(str2)) {
            return false;
        }
        JSONArray jSONArray = (JSONArray) this.d.get();
        Objects.requireNonNull(jSONArray);
        jSONArray.put(str);
        return true;
    }

    public final JSONObject a(String str, Method method, Object obj, Object[] objArr) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        this.c.set(str);
        this.d.set(jSONArray);
        try {
            Object objInvoke = method.invoke(obj, objArr);
            if (objInvoke == null) {
                jSONObject.put("t", "null");
            } else {
                jSONObject.put("t", "v");
                jSONObject.put("v", objInvoke);
            }
            this.c.remove();
            this.d.remove();
        } catch (Throwable th) {
            try {
                a(jSONObject, th);
                this.c.remove();
                this.d.remove();
            } catch (Throwable th2) {
                this.c.remove();
                this.d.remove();
                throw th2;
            }
        }
        try {
            if (this.b.containsKey(str)) {
                jSONObject.put("scripts", jSONArray);
            }
        } catch (JSONException e) {
            a(jSONObject, e);
        }
        return jSONObject;
    }

    public final /* synthetic */ void a(AtomicReference atomicReference, String str, Method method, Object obj, Object[] objArr, CountDownLatch countDownLatch) {
        try {
            atomicReference.set(a(str, method, obj, objArr));
        } finally {
            countDownLatch.countDown();
        }
    }

    public static void a(JSONObject jSONObject, Throwable th) {
        if ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        try {
            jSONObject.put("t", "error");
            jSONObject.put("m", String.valueOf(th));
        } catch (JSONException unused) {
        }
    }

    public static JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", "error");
            jSONObject.put("m", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void a(String str, e.c cVar) {
        this.e.put(str, cVar);
    }
}
