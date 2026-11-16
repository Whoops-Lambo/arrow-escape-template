package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class T6 {
    private static final String a = "adunit_data";

    private JSONObject a(Context context, @NotNull R6.a aVar) throws JSONException {
        String strName = aVar.name();
        JSONObject jSONObjectB = S6.b().b(context);
        JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(a);
        JSONObject jSONObjectA = a(jSONObjectB);
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optJSONObject(strName) != null) {
            JSONObject jSONObject = jSONObjectOptJSONObject.getJSONObject(strName);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectA.putOpt(next, jSONObject.opt(next));
            }
        }
        return jSONObjectA;
    }

    public JSONObject a(Context context, String[] strArr) throws JSONException {
        return a(a(S6.b().b(context)), strArr);
    }

    public JSONObject a(List<String> list, R6.a aVar) throws JSONException {
        return a(a(ContextProvider.getInstance().getApplicationContext(), aVar), (String[]) list.toArray(new String[list.size()]));
    }

    private JSONObject a(Context context, List<String> list) throws JSONException {
        return a(a(S6.b().b(context)), (String[]) list.toArray(new String[list.size()]));
    }

    public JSONObject a(String[] strArr) throws JSONException {
        return a(a(S6.b().b(ContextProvider.getInstance().getApplicationContext())), strArr);
    }

    public JSONObject a(List<String> list) throws JSONException {
        return a(ContextProvider.getInstance().getApplicationContext(), list);
    }

    private JSONObject a(JSONObject jSONObject, String[] strArr) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (String str : strArr) {
            if (jSONObject.has(str)) {
                jSONObjectJsonObjectInit.put(str, jSONObject.opt(str));
            }
        }
        return jSONObjectJsonObjectInit;
    }

    private JSONObject a(JSONObject jSONObject) {
        jSONObject.remove(a);
        return jSONObject;
    }
}
