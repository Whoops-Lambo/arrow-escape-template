package com.google.android.gms.internal.ads;

import android.util.Log;
import com.ironsource.C4664b4;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.jc1;
import defpackage.nj;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaum {
    public static final boolean a = Log.isLoggable("Volley", 2);
    public static final String b = zzaum.class.getName();

    public static void a(String str, Object... objArr) {
        if (a) {
            Log.v("Volley", d(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        Log.d("Volley", d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e("Volley", d(str, objArr));
    }

    public static String d(String str, Object... objArr) {
        String strO;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                strO = jc1.o(strSubstring2, UserDetailsUtils.UserDetailsLiterals.DOT, new StringBuilder(strSubstring2.length() + 1 + String.valueOf(methodName).length()), methodName);
                Locale locale = Locale.US;
                long id = Thread.currentThread().getId();
                StringBuilder sb = new StringBuilder(C4664b4.j.d);
                sb.append(id);
                sb.append("] ");
                sb.append(strO);
                return nj.q(sb, ": ", str2);
            }
        }
        strO = "<unknown>";
        Locale locale2 = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder(C4664b4.j.d);
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(strO);
        return nj.q(sb2, ": ", str2);
    }
}
