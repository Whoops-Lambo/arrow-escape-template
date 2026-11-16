package com.adsurge.adn.Y0;

import android.text.TextUtils;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class s {
    public static final String a;

    static {
        a = com.adsurge.adn.J0.a.a ? "StatReporter" : s.class.getCanonicalName();
    }

    public static Future a(String str, JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        return com.adsurge.adn.G0.a.a().a(j.f().a().a(str, jSONObject.toString()), com.adsurge.adn.G0.c.a.Low);
    }

    public static Future b(JSONObject jSONObject) {
        String strD = j.f().a().d();
        if (TextUtils.isEmpty(strD)) {
            com.adsurge.adn.J0.a.b(a, "performance url is empty");
            return null;
        }
        return a(strD, jSONObject);
    }

    public static Future a(JSONObject jSONObject) {
        String strB = j.f().a().b();
        if (TextUtils.isEmpty(strB)) {
            com.adsurge.adn.J0.a.b(a, "event url is empty");
            return null;
        }
        return a(strB, jSONObject);
    }
}
