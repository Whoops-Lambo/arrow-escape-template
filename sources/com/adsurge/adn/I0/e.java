package com.adsurge.adn.I0;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class e {
    public static final String b;
    public JSONObject a;

    static {
        b = com.adsurge.adn.J0.a.a ? "JSONBuilder" : e.class.getCanonicalName();
    }

    public String toString() {
        return this.a.toString();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[Catch: JSONException -> 0x0021, TryCatch #0 {JSONException -> 0x0021, blocks: (B:4:0x0005, B:6:0x000f, B:8:0x001b, B:12:0x0028, B:11:0x0023), top: B:16:0x0005 }] */
    public e(String str) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                if (!str.trim().isEmpty() && !str.toLowerCase().equals("null")) {
                    jSONObject = new JSONObject(str);
                } else {
                    jSONObject = new JSONObject();
                }
            } catch (JSONException e) {
                com.adsurge.adn.J0.a.a(b, e.getMessage(), e);
                this.a = new JSONObject();
                return;
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.a = jSONObject;
    }

    public e a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.a.put(str, str2);
                return this;
            }
            return this;
        } catch (JSONException e) {
            com.adsurge.adn.J0.a.a(b, e.getMessage(), e);
            return this;
        }
    }

    public e a(String str, long j) {
        try {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            this.a.put(str, j);
            return this;
        } catch (JSONException e) {
            com.adsurge.adn.J0.a.a(b, e.getMessage(), e);
            return this;
        }
    }

    public e a(String str, double d) {
        try {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            this.a.put(str, d);
            return this;
        } catch (JSONException e) {
            com.adsurge.adn.J0.a.a(b, e.getMessage(), e);
            return this;
        }
    }

    public e a(String str, boolean z) {
        try {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            this.a.put(str, z);
            return this;
        } catch (JSONException e) {
            com.adsurge.adn.J0.a.a(b, e.getMessage(), e);
            return this;
        }
    }

    public e a(String str, int i) {
        try {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            this.a.put(str, i);
            return this;
        } catch (JSONException e) {
            com.adsurge.adn.J0.a.a(b, e.getMessage(), e);
            return this;
        }
    }

    public e a(String str, Object obj) {
        try {
            if (TextUtils.isEmpty(str) || obj == null) {
                return this;
            }
            this.a.put(str, obj);
            return this;
        } catch (JSONException e) {
            com.adsurge.adn.J0.a.a(b, e.getMessage(), e);
            return this;
        }
    }

    public JSONObject a() {
        return this.a;
    }

    public e() {
        this.a = new JSONObject();
    }

    public e(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.a = new JSONObject();
        } else {
            this.a = jSONObject;
        }
    }

    public e(Map map) {
        try {
            this.a = new JSONObject(map);
        } catch (Exception e) {
            com.adsurge.adn.J0.a.a(b, e.getMessage(), e);
            this.a = new JSONObject();
        }
    }
}
