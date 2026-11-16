package androidx.tracing;

import android.os.Build;
import android.util.Log;
import defpackage.dr0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class Trace {
    public static long a;
    public static Method b;

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return TraceApi29Impl.a();
        }
        try {
            if (b == null) {
                a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            dr0.m(cause);
            return false;
        }
    }

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        android.os.Trace.beginSection(str);
    }
}
