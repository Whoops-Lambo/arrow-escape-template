package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class V6 {
    private static final String a = "adunit_data";

    public void a(@NotNull String str, @NotNull Object obj, @NotNull R6.a aVar) {
        try {
            String strName = aVar.name();
            S6 s6B = S6.b();
            JSONObject jSONObjectOptJSONObject = s6B.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(a);
            if (jSONObjectOptJSONObject == null) {
                s6B.b(a, IronSourceNetworkBridge.jsonObjectInit().put(strName, IronSourceNetworkBridge.jsonObjectInit().put(str, obj)));
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strName);
            if (jSONObjectOptJSONObject2 == null) {
                s6B.b(a, jSONObjectOptJSONObject.put(strName, IronSourceNetworkBridge.jsonObjectInit().put(str, obj)));
            } else {
                s6B.b(a, jSONObjectOptJSONObject.put(strName, jSONObjectOptJSONObject2.put(str, obj)));
            }
        } catch (JSONException e) {
            C4950r4.d().a(e);
        }
    }

    public void a(Map<String, Object> map) {
        S6.b().a(map);
    }

    public void a(String str, JSONArray jSONArray) {
        S6.b().a(str, jSONArray);
    }

    public void a(String str, JSONObject jSONObject) {
        S6.b().a(str, jSONObject);
    }

    public void a(Context context) {
        S6.b().c(context);
    }

    public void a(String str) {
        S6.b().b(str);
    }

    public void a(String str, Object obj) {
        S6.b().b(str, obj);
    }

    public void a(@NotNull String str, @NotNull R6.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        try {
            String strName = aVar.name();
            S6 s6B = S6.b();
            JSONObject jSONObjectOptJSONObject2 = s6B.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(a);
            if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(strName)) == null || jSONObjectOptJSONObject.remove(str) == null) {
                return;
            }
            s6B.b(a, jSONObjectOptJSONObject2.put(strName, jSONObjectOptJSONObject));
        } catch (JSONException e) {
            C4950r4.d().a(e);
        }
    }
}
