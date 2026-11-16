package com.vungle.ads.internal.util;

import android.util.Log;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class t {
    public static void a(String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        th.getClass();
        if (!u.a) {
            return;
        }
        Log.e(str, u.b.d(str2, "xxx.xxx.xxx.xxx") + "; error: " + th.getLocalizedMessage());
    }

    public static void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (!u.a) {
            return;
        }
        Log.e(str, u.b.d(str2, "xxx.xxx.xxx.xxx"));
    }

    public static void c(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (!u.a) {
            return;
        }
        Log.w(str, u.b.d(str2, "xxx.xxx.xxx.xxx"));
    }

    public static int a(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (u.a) {
            return Log.d(str, u.b.d(str2, "xxx.xxx.xxx.xxx"));
        }
        return -1;
    }

    public static void a(String str, sr0 sr0Var) {
        str.getClass();
        sr0Var.getClass();
        if (u.a) {
            String str2 = (String) sr0Var.invoke();
            str2.getClass();
            Log.w(str, u.b.d(str2, "xxx.xxx.xxx.xxx"));
        }
    }
}
