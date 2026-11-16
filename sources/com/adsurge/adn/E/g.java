package com.adsurge.adn.E;

import com.ironsource.R6;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static void a(f fVar, JSONObject jSONObject) {
        if (fVar == null || jSONObject == null) {
            return;
        }
        Integer num = fVar.a;
        if (num != null) {
            fVar.a = Integer.valueOf(jSONObject.optInt(R6.F, num.intValue()));
        }
        if (jSONObject.has("osVersion") && !jSONObject.isNull("osVersion")) {
            fVar.b = jSONObject.optString("osVersion", fVar.b);
        }
        if (!jSONObject.has("sdkVersion") || jSONObject.isNull("sdkVersion")) {
            return;
        }
        fVar.c = jSONObject.optString("sdkVersion", fVar.c);
    }

    public static JSONObject b(f fVar) {
        JSONObject jSONObject = new JSONObject();
        if (fVar != null) {
            try {
                Integer num = fVar.a;
                if (num != null) {
                    jSONObject.put(R6.F, num);
                }
                String str = fVar.b;
                if (str != null) {
                    jSONObject.put("osVersion", str);
                }
                String str2 = fVar.c;
                if (str2 != null) {
                    jSONObject.put("sdkVersion", str2);
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static f a(f fVar) {
        if (fVar == null) {
            return null;
        }
        f fVar2 = new f();
        fVar2.a = fVar.a;
        fVar2.b = fVar.b;
        fVar2.c = fVar.c;
        return fVar2;
    }
}
