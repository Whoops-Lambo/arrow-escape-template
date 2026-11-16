package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4664b4;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class sx {
    private static String ahm = "";
    private static boolean kgy;

    private static String ahm(String str) {
        return TextUtils.isEmpty(ahm) ? str : kgy(pv1.p(new StringBuilder(C4664b4.j.d), ahm, "]-[", str, C4664b4.j.e));
    }

    private static String kgy(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void rz(String str, Object... objArr) {
        if (kgy && objArr != null) {
            Log.e(ahm(str), kgy(objArr));
        }
    }

    public static void rz(String str, String str2) {
        if (kgy && str2 != null) {
            Log.e(ahm(str), str2);
        }
    }

    public static void ahm(String str, String str2) {
        if (kgy && str2 != null) {
            Log.i(ahm(str), str2);
        }
    }

    public static void ahm(String str, Object... objArr) {
        if (kgy && objArr != null) {
            Log.i(ahm(str), kgy(objArr));
        }
    }

    public static void ahm() {
        kgy = false;
    }

    public static void kgy(String str, String str2) {
        if (kgy && str2 != null) {
            Log.d(ahm(str), str2);
        }
    }

    public static void kgy(String str, Object... objArr) {
        if (kgy && objArr != null) {
            Log.d(ahm(str), kgy(objArr));
        }
    }

    public static void kgy(String str, String str2, Throwable th) {
        if (kgy) {
            if (str2 == null && th == null) {
                return;
            }
            Log.e(ahm(str), str2, th);
        }
    }

    public static void kgy(String str) {
        ahm = str;
    }

    public static void kgy() {
        kgy = true;
    }
}
