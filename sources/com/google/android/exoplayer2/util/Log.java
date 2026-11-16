package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import defpackage.h50;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;

    @GuardedBy
    private static int logLevel = 0;

    @GuardedBy
    private static boolean logStackTraces = true;
    private static final Object lock = new Object();

    @GuardedBy
    private static Logger logger = Logger.DEFAULT;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Logger {
        public static final Logger DEFAULT = new e();

        void d(String str, String str2);

        void e(String str, String str2);

        void i(String str, String str2);

        void w(String str, String str2);
    }

    public static void d(@androidx.annotation.Size String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel == 0) {
                    logger.d(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(@androidx.annotation.Size String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 3) {
                    logger.e(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int getLogLevel() {
        int i;
        synchronized (lock) {
            i = logLevel;
        }
        return i;
    }

    @Nullable
    public static String getThrowableString(@Nullable Throwable th) {
        synchronized (lock) {
            try {
                if (th == null) {
                    return null;
                }
                if (isCausedByUnknownHostException(th)) {
                    return "UnknownHostException (no network)";
                }
                if (logStackTraces) {
                    return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void i(@androidx.annotation.Size String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 1) {
                    logger.i(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean isCausedByUnknownHostException(@Nullable Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void setLogLevel(int i) {
        synchronized (lock) {
            logLevel = i;
        }
    }

    public static void setLogStackTraces(boolean z) {
        synchronized (lock) {
            logStackTraces = z;
        }
    }

    public static void setLogger(Logger logger2) {
        synchronized (lock) {
            logger = logger2;
        }
    }

    public static void w(@androidx.annotation.Size String str, String str2) {
        synchronized (lock) {
            try {
                if (logLevel <= 2) {
                    logger.w(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Log() {
    }

    private static String appendThrowableString(String str, @Nullable Throwable th) {
        String throwableString = getThrowableString(th);
        if (!TextUtils.isEmpty(throwableString)) {
            StringBuilder sbQ = h50.q(str, "\n  ");
            sbQ.append(throwableString.replace("\n", "\n  "));
            sbQ.append('\n');
            return sbQ.toString();
        }
        return str;
    }

    public static void d(@androidx.annotation.Size String str, String str2, @Nullable Throwable th) {
        d(str, appendThrowableString(str2, th));
    }

    public static void e(@androidx.annotation.Size String str, String str2, @Nullable Throwable th) {
        e(str, appendThrowableString(str2, th));
    }

    public static void i(@androidx.annotation.Size String str, String str2, @Nullable Throwable th) {
        i(str, appendThrowableString(str2, th));
    }

    public static void w(@androidx.annotation.Size String str, String str2, @Nullable Throwable th) {
        w(str, appendThrowableString(str2, th));
    }
}
