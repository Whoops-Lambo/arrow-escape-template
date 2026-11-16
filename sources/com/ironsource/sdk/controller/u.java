package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4871me;
import com.ironsource.C4891ng;
import com.ironsource.C4950r4;
import com.ironsource.C5012uc;
import com.ironsource.InterfaceC5010ua;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class u {
    private static final String d = "u";
    private static final String e = "updateToken";
    private static final String f = "getToken";
    private static final String g = "functionName";
    private static final String h = "functionParams";
    private static final String i = "success";
    private static final String j = "fail";
    private Context b;
    private C5012uc a = new C5012uc();
    private C4891ng c = new C4891ng();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
        }
    }

    private void a(a aVar, InterfaceC5010ua interfaceC5010ua) {
        try {
            JSONObject jSONObjectA = this.c.a();
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectA.get(next);
                if (obj instanceof String) {
                    jSONObjectA.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC5010ua.a(true, aVar.c, jSONObjectA);
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            interfaceC5010ua.a(false, aVar.d, e2.getMessage());
        }
    }

    public u(Context context) {
        this.b = context;
    }

    public void a(String str, InterfaceC5010ua interfaceC5010ua) throws Exception {
        a aVarA = a(str);
        if (e.equals(aVarA.a)) {
            a(aVarA.b, aVarA, interfaceC5010ua);
            return;
        }
        if (f.equals(aVarA.a)) {
            a(aVarA, interfaceC5010ua);
            return;
        }
        Logger.i(d, "unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC5010ua interfaceC5010ua) {
        C4871me c4871me = new C4871me();
        try {
            this.a.a(jSONObject);
            interfaceC5010ua.a(true, aVar.c, c4871me);
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(d, "updateToken exception " + e2.getMessage());
            interfaceC5010ua.a(false, aVar.d, c4871me);
        }
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
        a aVar = new a(0);
        aVar.a = jSONObjectJsonObjectInit.optString("functionName");
        aVar.b = jSONObjectJsonObjectInit.optJSONObject("functionParams");
        aVar.c = jSONObjectJsonObjectInit.optString("success");
        aVar.d = jSONObjectJsonObjectInit.optString("fail");
        return aVar;
    }
}
