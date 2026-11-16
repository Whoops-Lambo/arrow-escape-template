package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.me, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4871me {
    private JSONObject a;

    private Object a(Object obj) throws JSONException {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return b((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static Object b(Object obj) throws JSONException {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof Iterable)) {
                return obj;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            return jSONArray;
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            if (obj2 != null) {
                jSONObjectJsonObjectInit.put(obj2.toString(), b(map.get(obj2)));
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public boolean c(String str) {
        return this.a.optBoolean(str);
    }

    public String d(String str) {
        return this.a.optString(str, null);
    }

    public String toString() {
        JSONObject jSONObject = this.a;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public C4871me() {
        this.a = IronSourceNetworkBridge.jsonObjectInit();
    }

    public boolean e(String str) {
        return a().isNull(str);
    }

    private void f(String str) {
        try {
            this.a = IronSourceNetworkBridge.jsonObjectInit(str);
        } catch (Exception e) {
            C4950r4.d().a(e);
            this.a = IronSourceNetworkBridge.jsonObjectInit();
        }
    }

    public C4871me(String str) {
        f(str);
    }

    public boolean a(String str) {
        return a().has(str);
    }

    public String a(String str, String str2) {
        return this.a.optString(str, str2);
    }

    public int a(String str, int i) {
        return this.a.optInt(str, i);
    }

    public static boolean a(JSONObject jSONObject) {
        return jSONObject.names() == null;
    }

    public List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.get(i)));
        }
        return arrayList;
    }

    public void a(String str, JSONObject jSONObject) {
        try {
            this.a.put(str, jSONObject);
        } catch (Exception e) {
            C4950r4.d().a(e);
        }
    }

    public JSONObject a() {
        return this.a;
    }

    public Object b(String str) {
        try {
            return a().get(str);
        } catch (JSONException e) {
            C4950r4.d().a(e);
            return null;
        }
    }

    public void b(String str, String str2) {
        try {
            this.a.put(str, str2);
        } catch (Exception e) {
            C4950r4.d().a(e);
        }
    }

    private Map<String, Object> b(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, a(jSONObject.get(next)));
        }
        return map;
    }
}
