package defpackage;

import com.explorestack.protobuf.adcom.c;
import com.facebook.a0;
import com.facebook.g0;
import com.facebook.internal.v0;
import com.facebook.k0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class z61 {
    public static final void a(String str) {
        File fileB = b();
        if (fileB != null && str != null) {
            new File(fileB, str).delete();
        }
    }

    public static final File b() {
        File file = new File(a0.a().getCacheDir(), "instrument");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    public static final boolean c(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        className.getClass();
        if (!kk2.L(className, "com.facebook", false)) {
            String className2 = stackTraceElement.getClassName();
            className2.getClass();
            if (!kk2.L(className2, "com.meta", false)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean d(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                if (c(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    className.getClass();
                    if (!kk2.L(className, "com.facebook.appevents.codeless", false)) {
                        String className2 = stackTraceElement.getClassName();
                        className2.getClass();
                        if (!kk2.L(className2, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    methodName.getClass();
                    if (kk2.L(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        methodName2.getClass();
                        if (kk2.L(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            methodName3.getClass();
                            if (!kk2.L(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final JSONObject e(String str) {
        File fileB = b();
        if (fileB != null) {
            try {
                return new JSONObject(v0.T(new FileInputStream(new File(fileB, str))));
            } catch (Exception unused) {
                a(str);
            }
        }
        return null;
    }

    public static final void f(String str, JSONArray jSONArray, g0 g0Var) {
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                JSONObject jSONObjectR = v0.r();
                if (jSONObjectR != null) {
                    Iterator<String> itKeys = jSONObjectR.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObjectR.get(next));
                    }
                }
                String str2 = k0.j;
                c.n(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{a0.b()}, 1)), jSONObject, g0Var).d();
            } catch (JSONException unused) {
            }
        }
    }

    public static final void g(String str, String str2) {
        File fileB = b();
        if (fileB != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(fileB, str));
                byte[] bytes = str2.getBytes(er.a);
                bytes.getClass();
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
