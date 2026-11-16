package com.iab.omid.library.vungle.utils;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static void a(String str, Exception exc) {
        if ((!com.iab.omid.library.vungle.a.a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }

    public static void b(String str) {
        if (!com.iab.omid.library.vungle.a.a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.e("OMIDLIB", str);
    }

    public static void c(String str) {
        if (!com.iab.omid.library.vungle.a.a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    public static void d(String str) {
        if (!com.iab.omid.library.vungle.a.a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w("OMIDLIB", str);
    }

    public static void a(String str) {
        if (!com.iab.omid.library.vungle.a.a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.d("OMIDLIB", str);
    }
}
