package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import defpackage.pv1;
import java.net.UnknownHostException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzeh {
    public static final Object a = new Object();

    public static void a(String str, String str2) {
        synchronized (a) {
            Log.d(str, g(str2, null));
        }
    }

    public static void b(String str, String str2) {
        synchronized (a) {
            Log.i(str, g(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (a) {
            Log.w(str, g(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (a) {
            Log.w(str, g(str2, th));
        }
    }

    public static void e(String str, String str2) {
        synchronized (a) {
            Log.e(str, g(str2, null));
        }
    }

    public static void f(String str, String str2, Throwable th) {
        synchronized (a) {
            Log.e(str, g(str2, th));
        }
    }

    public static String g(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (a) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        int length = str.length();
        return pv1.p(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, "\n");
    }
}
