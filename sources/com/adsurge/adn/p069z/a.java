package com.adsurge.adn.p069z;

import android.text.TextUtils;
import defpackage.n30;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static String a;
    public static String b;
    public static String c;
    public static String d;
    public static String e;
    public static String f;
    public static String g;
    public static String h;
    public static String i;

    static {
        a(null);
    }

    public static void a(JSONObject jSONObject) {
        String strOptString = jSONObject == null ? null : jSONObject.optString("skmde");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = "https://mi.adsurge.com";
        }
        String str = b;
        if (str == null || !str.startsWith(strOptString)) {
            b = n30.m(strOptString, "/v1/config");
            a = n30.m(strOptString, "/v1/ads");
            i = n30.m(strOptString, "/v1/localt");
        }
        String strOptString2 = jSONObject != null ? jSONObject.optString("skrde") : null;
        if (TextUtils.isEmpty(strOptString2)) {
            strOptString2 = "https://report-us.adsurge.com";
        }
        String str2 = c;
        if (str2 == null || !str2.startsWith(strOptString2)) {
            c = n30.m(strOptString2, "/v1/report");
            d = n30.m(strOptString2, "/v1/ad_feedback_report");
            e = n30.m(strOptString2, "/v1/sdk_event_report");
            f = n30.m(strOptString2, "/v1/sdk_launch_init_report");
            g = n30.m(strOptString2, "/v1/profile/crash/upload");
            h = n30.m(strOptString2, "/v1/sdk_log_report");
        }
    }

    public static String b() {
        return c;
    }

    public static String c() {
        return b;
    }

    public static String d() {
        return g;
    }

    public static String e() {
        return d;
    }

    public static String f() {
        return "https://mi.adsurge.com/v1/config";
    }

    public static String g() {
        return f;
    }

    public static String h() {
        return i;
    }

    public static String i() {
        return h;
    }

    public static String j() {
        return e;
    }

    public static String a() {
        return a;
    }
}
