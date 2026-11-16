package com.mbridge.msdk.tracker.network;

import android.util.Log;
import com.ironsource.C4664b4;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.h50;
import defpackage.nj;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class c0 {
    public static String a = "TrackManager_Volley";
    private static final String b = "com.mbridge.msdk.tracker.network.c0";

    public static void d(String str, Object... objArr) {
    }

    private static String a(String str, Object... objArr) {
        String string;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbQ = h50.q(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), UserDetailsUtils.UserDetailsLiterals.DOT);
                sbQ.append(stackTrace[i].getMethodName());
                string = sbQ.toString();
                Locale locale = Locale.US;
                long id = Thread.currentThread().getId();
                StringBuilder sb = new StringBuilder(C4664b4.j.d);
                sb.append(id);
                sb.append("] ");
                sb.append(string);
                return nj.q(sb, ": ", str);
            }
        }
        string = "<unknown>";
        Locale locale2 = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder(C4664b4.j.d);
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(string);
        return nj.q(sb2, ": ", str);
    }

    public static void b(String str, Object... objArr) {
        Log.d(a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(a, a(str, objArr));
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(a, a(str, objArr), th);
    }
}
