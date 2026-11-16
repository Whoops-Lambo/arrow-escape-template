package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.a.equals(rVar.a) && this.b.equals(rVar.b)) {
                return true;
            }
        }
        return false;
    }

    public static r a(JSONObject jSONObject) {
        r rVar = new r();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObjectOptJSONObject.optString(next, null);
                if (strOptString != null) {
                    rVar.a.put(next, strOptString);
                }
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("overrides");
        if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
            Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(next2);
                if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.length() > 0) {
                    rVar.b.put(next2, new p(jSONObjectOptJSONObject3));
                }
            }
        }
        return rVar;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int b(String str, int i, int i2) {
        int i3;
        try {
            i3 = Integer.parseInt(a(str, Integer.toString(i)));
        } catch (Throwable unused) {
            i3 = i;
        }
        if (i3 >= i2 && i3 <= 30) {
            return i3;
        }
        return i;
    }

    public final String a(String str, String str2) {
        return this.a.containsKey(str) ? (String) this.a.get(str) : str2;
    }

    public final int a(String str, int i, int i2) {
        try {
            i = Integer.parseInt(a(str, Integer.toString(i)));
        } catch (Throwable unused) {
        }
        return Math.max(i, i2);
    }

    public final boolean a(boolean z, String str) {
        try {
            return Boolean.parseBoolean(a(str, Boolean.toString(z)));
        } catch (Throwable unused) {
            return z;
        }
    }

    public final o a(String str) {
        p pVar;
        String str2 = IAConfigManager.Q.d;
        if (this.b.containsKey(str2)) {
            pVar = (p) this.b.get(str2);
        } else {
            pVar = new p();
        }
        pVar.getClass();
        return pVar.a.containsKey(str) ? (o) pVar.a.get(str) : new o();
    }
}
