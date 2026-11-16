package com.adsurge.adn.Z;

import android.text.TextUtils;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static long a;
    public static String b;
    public static long[] c;
    public static long d;
    public static File e;
    public static String f;
    public static String[] g;
    public static volatile e h;

    public static void a(e eVar) {
        h = eVar;
        a = eVar.currentTimeMillis();
        b = h.h();
        JSONObject jSONObjectA = new com.adsurge.adn.I0.e(h.c()).a();
        c = a(jSONObjectA.optString("jcc"));
        d = ((long) jSONObjectA.optInt("crd", 30)) * 1000;
        f = jSONObjectA.optString("cru", h.a());
        String strOptString = jSONObjectA.optString("spp", h.i());
        if (TextUtils.isEmpty(strOptString)) {
            g = new String[0];
        } else {
            g = strOptString.split(",");
        }
    }

    public static File b() {
        if (e == null) {
            e = new File(b, "cd");
        }
        e.mkdirs();
        return e;
    }

    public static long c() {
        return d;
    }

    public static String d() {
        return f;
    }

    public static long e() {
        return a;
    }

    public static long[] f() {
        return c;
    }

    public static String[] g() {
        return g;
    }

    public static e a() {
        return h;
    }

    public static long[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new long[]{10000};
        }
        String[] strArrSplit = str.split(",");
        int length = strArrSplit.length;
        if (length % 2 == 0) {
            return new long[]{10000};
        }
        long[] jArr = new long[length];
        int i = length - 1;
        jArr[i] = Long.parseLong(strArrSplit[i]);
        for (int i2 = 0; i2 < i; i2++) {
            long j = Long.parseLong(strArrSplit[i2]);
            if (i2 % 2 == 0) {
                jArr[i2] = j + a;
            } else {
                jArr[i2] = j;
            }
        }
        return jArr;
    }
}
