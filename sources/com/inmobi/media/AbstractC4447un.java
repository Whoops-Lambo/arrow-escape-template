package com.inmobi.media;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.sdk.InMobiSdk;
import defpackage.aj0;
import defpackage.cz;
import defpackage.dk2;
import defpackage.du;
import defpackage.jc1;
import defpackage.kc2;
import defpackage.s71;
import defpackage.tb5;
import defpackage.w32;
import defpackage.wr0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.un, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4447un {
    public static final cz a;
    public static final w32 b;
    public static final Set c;

    /* JADX WARN: Code duplicated, block: B:30:0x00af A[Catch: all -> 0x00be, TryCatch #4 {all -> 0x00be, blocks: (B:28:0x0093, B:30:0x00af, B:31:0x00b6), top: B:39:0x0093 }] */
    public static final String a(Thread thread, Throwable th) {
        JSONObject jSONObject;
        String strA;
        th.getClass();
        JSONObject jSONObject2 = new JSONObject();
        try {
            try {
                jSONObject2.put("name", th.getClass().getSimpleName());
                jSONObject2.put("message", th.getMessage());
                if (thread != null) {
                    jSONObject2.put("thread", thread.getName());
                }
                StackTraceElement[] stackTrace = th.getStackTrace();
                stackTrace.getClass();
                boolean zB = b(stackTrace);
                if (zB) {
                    int maxStackFrames = Ba.a().getCrashConfig().getMaxStackFrames();
                    if (maxStackFrames < 1 || maxStackFrames > 1024) {
                        maxStackFrames = 64;
                    }
                    strA = a(stackTrace, maxStackFrames);
                } else {
                    strA = "";
                }
                jSONObject2.put("stack", strA);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Ba.a(jSONObject2, zB, jCurrentTimeMillis);
                AbstractC4133jg.a(jSONObject2, th instanceof OutOfMemoryError, zB, jCurrentTimeMillis);
                String string = jSONObject2.toString();
                string.getClass();
                return string;
            } catch (OutOfMemoryError unused) {
                String string2 = jSONObject2.toString();
                string2.getClass();
                return string2;
            } catch (JSONException e) {
                e.toString();
                if (jSONObject2.has("name") && jSONObject2.has("message")) {
                    try {
                        String string3 = jSONObject2.toString();
                        string3.getClass();
                        return string3;
                    } catch (Throwable unused2) {
                        jSONObject = new JSONObject();
                        jSONObject.put("name", th.getClass().getSimpleName());
                        jSONObject.put("message", th.getMessage());
                        jSONObject.put("stack", "[unavailable]");
                        if (thread != null) {
                            jSONObject.put("thread", thread.getName());
                        }
                        String string4 = jSONObject.toString();
                        string4.getClass();
                        return string4;
                    }
                }
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", th.getClass().getSimpleName());
                    jSONObject.put("message", th.getMessage());
                    jSONObject.put("stack", "[unavailable]");
                    if (thread != null) {
                        jSONObject.put("thread", thread.getName());
                    }
                    String string5 = jSONObject.toString();
                    string5.getClass();
                    return string5;
                } catch (Throwable unused3) {
                    return "{\"name\":\"unknown\",\"message\":\"crash report serialization failed\",\"stack\":\"[unavailable]\"}";
                }
            }
        } catch (Throwable unused4) {
            return "{\"name\":\"unknown\",\"message\":\"crash report serialization failed\",\"stack\":\"[unavailable]\"}";
        }
    }

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.getClass();
        a = kc2.a(new aj0(executorServiceNewSingleThreadExecutor).plus(tb5.a()));
        b = new w32("com\\.inmobi\\.(adquality|ads|commons|compliance|constants|logging|media|sdk|signals|unification|unifiedId)");
        Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            arrayList.add(method.getName());
        }
        c = du.E0(arrayList);
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        stackTraceElementArr.getClass();
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length && !a(stackTraceElementArr[i], InMobiInterstitial.a.class.getSuperclass()) && !a(stackTraceElementArr[i], InMobiInterstitial.a.class) && !a(stackTraceElementArr[i], Hd.class) && !a(stackTraceElementArr[i], InMobiBanner.a.class) && !a(stackTraceElementArr[i], InMobiBanner.a.class.getSuperclass()) && (!s71.b(stackTraceElementArr[i].getClassName(), InMobiSdk.class.getName()) || !s71.b(stackTraceElementArr[i].getMethodName(), "fireListener")); i++) {
            String className = stackTraceElementArr[i].getClassName();
            className.getClass();
            if (dk2.O(className, C4401t5.class.getName(), false)) {
                break;
            }
            String className2 = stackTraceElementArr[i].getClassName();
            className2.getClass();
            if (b.a(className2)) {
                return true;
            }
        }
        return false;
    }

    public static final String a(String str, String str2) {
        str.getClass();
        str2.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "AppExitEvent");
            jSONObject.put("message", str);
            jSONObject.put("stack", str2);
        } catch (JSONException e) {
            e.toString();
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public static final String a(StackTraceElement[] stackTraceElementArr) {
        stackTraceElementArr.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "Blocked");
            jSONObject.put("message", "MainThreadBlocked");
            int maxStackFrames = Ba.a().getCrashConfig().getMaxStackFrames();
            if (maxStackFrames < 1 || maxStackFrames > 1024) {
                maxStackFrames = 64;
            }
            jSONObject.put("stack", a(stackTraceElementArr, maxStackFrames));
        } catch (JSONException e) {
            e.toString();
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public static final String a(StackTraceElement[] stackTraceElementArr, int i) {
        stackTraceElementArr.getClass();
        if (i > 0 && stackTraceElementArr.length != 0) {
            int length = stackTraceElementArr.length;
            int iMin = Math.min(i, length);
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < iMin; i2++) {
                sb.append(stackTraceElementArr[i2].toString());
                sb.append('\n');
            }
            if (iMin < length) {
                sb.append(jc1.n("...[truncated: ", iMin, "/", length, " frames shown]"));
            }
            return sb.toString();
        }
        return "";
    }

    public static final boolean a(Ca ca) {
        ca.getClass();
        if (ca instanceof C4429u5) {
            StackTraceElement[] stackTraceElementArr = ((C4429u5) ca).g;
            if (stackTraceElementArr != null) {
                return b(stackTraceElementArr);
            }
            s71.D("stackTrace");
            throw null;
        }
        if (ca instanceof T1) {
            T1 t1 = (T1) ca;
            if (t1.g != 6) {
                return false;
            }
            return b.a(t1.h);
        }
        if (ca instanceof C4199lq) {
            return b(((C4199lq) ca).g);
        }
        return false;
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) {
        stackTraceElement.getClass();
        return cls != null && s71.b(stackTraceElement.getClassName(), cls.getName()) && c.contains(stackTraceElement.getMethodName());
    }

    public static final void a(wr0 wr0Var) {
        wr0Var.getClass();
        tb5.t(a, null, null, new C4336qn(wr0Var, null), 3);
    }
}
