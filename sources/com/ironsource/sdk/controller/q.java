package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4871me;
import com.ironsource.C4950r4;
import com.ironsource.InterfaceC5010ua;
import com.ironsource.M1;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class q {
    private static final String b = "q";
    private static final String c = "getPermissions";
    private static final String d = "isPermissionGranted";
    private static final String e = "permissions";
    private static final String f = "permission";
    private static final String g = "status";
    private static final String h = "functionName";
    private static final String i = "functionParams";
    private static final String j = "success";
    private static final String k = "fail";
    private static final String l = "unhandledPermission";
    private Context a;

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

    public void a(JSONObject jSONObject, a aVar, InterfaceC5010ua interfaceC5010ua) {
        C4871me c4871me = new C4871me();
        try {
            c4871me.a(e, M1.a(this.a, jSONObject.getJSONArray(e)));
            interfaceC5010ua.a(true, aVar.c, c4871me);
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            Logger.i(b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
            c4871me.b("errMsg", e2.getMessage());
            interfaceC5010ua.a(false, aVar.d, c4871me);
        }
    }

    public void b(JSONObject jSONObject, a aVar, InterfaceC5010ua interfaceC5010ua) {
        C4871me c4871me = new C4871me();
        try {
            String string = jSONObject.getString(f);
            c4871me.b(f, string);
            if (M1.d(this.a, string)) {
                c4871me.b("status", String.valueOf(M1.c(this.a, string)));
                interfaceC5010ua.a(true, aVar.c, c4871me);
            } else {
                c4871me.b("status", l);
                interfaceC5010ua.a(false, aVar.d, c4871me);
            }
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            c4871me.b("errMsg", e2.getMessage());
            interfaceC5010ua.a(false, aVar.d, c4871me);
        }
    }

    public q(Context context) {
        this.a = context;
    }

    public void a(String str, InterfaceC5010ua interfaceC5010ua) throws Exception {
        a aVarA = a(str);
        if (c.equals(aVarA.a)) {
            a(aVarA.b, aVarA, interfaceC5010ua);
            return;
        }
        if (d.equals(aVarA.a)) {
            b(aVarA.b, aVarA, interfaceC5010ua);
            return;
        }
        Logger.i(b, "PermissionsJSAdapter unhandled API request " + str);
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
