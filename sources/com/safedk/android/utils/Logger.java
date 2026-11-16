package com.safedk.android.utils;

import android.util.Log;
import com.ironsource.C4664b4;

/* JADX INFO: loaded from: classes7.dex */
public final class Logger {
    private static final String TAG = "ApplovinQualityService";
    private static boolean debugMode = false;

    public enum FeatureTag {
        RESOURCES("__RESOURCES__"),
        JS_RESOURCES("__JS__ __RESOURCES__"),
        NW_RESOURCES("__NW__ __RESOURCES__"),
        MEMORY_LOAD("__MEMORY_LOAD__"),
        AD_CAPTURE("__AD_CAPTURE__"),
        REDIRECTS("__REDIRECTS__"),
        CI_MATCHING("__CI_MATCHING__"),
        PREFETCH("__PREFETCH__");

        private final String i;

        FeatureTag(String value) {
            this.i = value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.i;
        }
    }

    private Logger() {
    }

    public static void setDebugMode(boolean debug) {
        debugMode = debug;
    }

    public static boolean getDebugMode() {
        return debugMode;
    }

    private static String buildMessage(String tag, FeatureTag feature, Object... msg) {
        try {
            StringBuilder sb = new StringBuilder(C4664b4.j.d);
            sb.append(tag);
            sb.append("] ");
            if (feature != null) {
                sb.append(feature);
                sb.append(" ");
            }
            for (Object obj : msg) {
                if (!(obj instanceof Throwable)) {
                    sb.append(obj);
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            d(tag, feature, "failed to build message: ", th.getMessage());
            return "";
        }
    }

    public static int v(String tag, FeatureTag feature, Object... msg) {
        if (debugMode && msg != null && msg.length > 0) {
            String strBuildMessage = buildMessage(tag, feature, msg);
            Object obj = msg[msg.length - 1];
            if (obj instanceof Throwable) {
                return Log.v(TAG, strBuildMessage, (Throwable) obj);
            }
            return Log.v(TAG, strBuildMessage);
        }
        return 0;
    }

    public static int v(String tag, Object... msg) {
        return v(tag, null, msg);
    }

    public static int d(String tag, FeatureTag feature, Object... msg) {
        if (debugMode && msg != null && msg.length > 0) {
            String strBuildMessage = buildMessage(tag, feature, msg);
            Object obj = msg[msg.length - 1];
            if (obj instanceof Throwable) {
                return Log.d(TAG, strBuildMessage, (Throwable) obj);
            }
            return Log.d(TAG, strBuildMessage);
        }
        return 0;
    }

    public static int d(String tag, Object... msg) {
        return d(tag, null, msg);
    }

    public static int d(String tag_msg) {
        if (debugMode) {
            String[] strArrSplit = tag_msg.split("\\|");
            if (strArrSplit.length > 1) {
                return d(strArrSplit[0], null, strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return d("UnknownClass", null, strArrSplit[0]);
            }
        }
        return 0;
    }

    public static int i(String tag, FeatureTag feature, Object... msg) {
        if (msg != null && msg.length > 0) {
            String strBuildMessage = buildMessage(tag, feature, msg);
            Object obj = msg[msg.length - 1];
            if (obj instanceof Throwable) {
                return Log.i(TAG, strBuildMessage, (Throwable) obj);
            }
            return Log.i(TAG, strBuildMessage);
        }
        return 0;
    }

    public static int i(String tag, Object... msg) {
        return i(tag, null, msg);
    }

    public static int w(String tag, FeatureTag feature, Object... msg) {
        if (msg != null && msg.length > 0) {
            String strBuildMessage = buildMessage(tag, feature, msg);
            Object obj = msg[msg.length - 1];
            if (obj instanceof Throwable) {
                return Log.w(TAG, strBuildMessage, (Throwable) obj);
            }
            return Log.w(TAG, strBuildMessage);
        }
        return 0;
    }

    public static int w(String tag, Object... msg) {
        return w(tag, null, msg);
    }

    public static int e(String tag, FeatureTag feature, Object... msg) {
        if (msg != null && msg.length > 0) {
            String strBuildMessage = buildMessage(tag, feature, msg);
            Object obj = msg[msg.length - 1];
            if (obj instanceof Throwable) {
                return Log.e(TAG, strBuildMessage, (Throwable) obj);
            }
            return Log.e(TAG, strBuildMessage);
        }
        return 0;
    }

    public static int e(String tag, Object... msg) {
        return e(tag, null, msg);
    }

    public static void printStackTrace() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            d("StackTrace", null, stackTraceElement);
        }
    }

    public static void printStackTrace(String tag) {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            d(tag, null, "printStackTrace " + stackTraceElement);
        }
    }

    public static void printFullVerboseLog(String tag, FeatureTag feature, Object... msg) {
        if (debugMode && msg != null && msg.length > 0) {
            StringBuilder sb = new StringBuilder();
            try {
                for (Object obj : msg) {
                    if (!(obj instanceof Throwable)) {
                        sb.append(obj);
                    }
                }
                int length = sb.length() / 3500;
                int i = 0;
                while (i <= length) {
                    int i2 = i + 1;
                    int length2 = i2 * 3500;
                    if (length2 >= sb.length()) {
                        length2 = sb.length();
                    }
                    v(tag, feature, "(", Integer.valueOf(i2), "/", Integer.valueOf(length + 1), ") ", sb.substring(i * 3500, length2));
                    i = i2;
                }
            } catch (Throwable th) {
                v(tag, feature, "failed to print full verbose log: ", th.getMessage());
            }
        }
    }

    public static void printFullVerboseLog(String tag, Object... msg) {
        printFullVerboseLog(tag, null, msg);
    }
}
