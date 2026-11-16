package androidx.work;

import android.util.Log;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RestrictTo
public abstract class Logger {
    public static final Object a = new Object();
    public static volatile LogcatLogger b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LogcatLogger extends Logger {
        public final int c;

        @Override // androidx.work.Logger
        public final void a(String str, String str2) {
            if (this.c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public final void b(String str, String str2, Throwable th) {
            if (this.c <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // androidx.work.Logger
        public final void c(String str, String str2) {
            if (this.c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public final void d(String str, String str2, Throwable th) {
            if (this.c <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // androidx.work.Logger
        public final void f(String str, String str2) {
            if (this.c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public final void h(String str, String str2) {
            if (this.c <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.Logger
        public final void i(String str, String str2, RuntimeException runtimeException) {
            if (this.c <= 5) {
                Log.w(str, str2, runtimeException);
            }
        }

        public LogcatLogger(int i) {
            this.c = i;
        }
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void h(String str, String str2);

    public abstract void i(String str, String str2, RuntimeException runtimeException);

    public static Logger e() {
        LogcatLogger logcatLogger;
        synchronized (a) {
            try {
                if (b == null) {
                    b = new LogcatLogger(3);
                }
                logcatLogger = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return logcatLogger;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
