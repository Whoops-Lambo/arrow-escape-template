package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    private static HashMap<String, d> a = new HashMap<>();
    private JSONObject b = null;
    private JSONObject c = null;
    private boolean d = false;
    private String e;

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    @Nullable
    public static JSONObject b(String str) {
        d dVar = a.get(str);
        if (dVar != null) {
            return dVar.b;
        }
        return null;
    }

    public static d c(String str) {
        return a.get(str);
    }

    public static long d(String str) {
        d dVar = a.get(str);
        if (dVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.a.a(dVar.b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean e(String str) {
        JSONObject jSONObject;
        d dVar = a.get(str);
        return (dVar == null || (jSONObject = dVar.b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean f(String str) {
        JSONObject jSONObject;
        d dVar = a.get(str);
        return (dVar == null || (jSONObject = dVar.b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean g(String str) {
        JSONObject jSONObject;
        d dVar = a.get(str);
        return (dVar == null || (jSONObject = dVar.b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    private d(JSONObject jSONObject, String str) {
        this.e = str;
        a(jSONObject);
        a.put(this.e, this);
        com.apm.insight.a.a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    public final boolean a() {
        if (this.b == null) {
            return false;
        }
        return this.d;
    }

    public static boolean a(String str) {
        return a.get(str) != null;
    }

    public static void a(String str, JSONObject jSONObject) {
        d dVar = a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new d(jSONObject, str);
        }
    }
}
