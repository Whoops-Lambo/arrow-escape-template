package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4871me;
import com.ironsource.C4950r4;
import com.ironsource.InterfaceC5010ua;
import com.ironsource.Nc;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class o {
    private static final String c = "o";
    private static final String d = "activate";
    private static final String e = "startSession";
    private static final String f = "finishSession";
    private static final String g = "impressionOccurred";
    private static final String h = "getOmidData";
    private static final String i = "omidFunction";
    private static final String j = "omidParams";
    private static final String k = "success";
    private static final String l = "fail";
    private static final String m = "%s | unsupported OMID API";
    private final Context a;
    private final Nc b = new Nc();

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

    public o(Context context) {
        this.a = context;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(String str, InterfaceC5010ua interfaceC5010ua) throws Exception {
        C4871me c4871meA;
        a aVarA = a(str);
        C4871me c4871me = new C4871me();
        JSONObject jSONObject = aVarA.b;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                c4871me.b("adViewId", strOptString);
            }
        }
        try {
            String str2 = aVarA.a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals(d)) {
                        this.b.a(this.a);
                        c4871meA = this.b.a();
                        c4871me = c4871meA;
                        interfaceC5010ua.a(true, aVarA.c, c4871me);
                        return;
                    }
                    throw new IllegalArgumentException(aVarA.a + " | unsupported OMID API");
                case -984459207:
                    if (str2.equals(h)) {
                        c4871meA = this.b.a();
                        c4871me = c4871meA;
                        interfaceC5010ua.a(true, aVarA.c, c4871me);
                        return;
                    }
                    throw new IllegalArgumentException(aVarA.a + " | unsupported OMID API");
                case 70701699:
                    if (str2.equals(f)) {
                        this.b.b(aVarA.b);
                        interfaceC5010ua.a(true, aVarA.c, c4871me);
                        return;
                    }
                    throw new IllegalArgumentException(aVarA.a + " | unsupported OMID API");
                case 1208109646:
                    if (str2.equals(g)) {
                        this.b.c(aVarA.b);
                        interfaceC5010ua.a(true, aVarA.c, c4871me);
                        return;
                    }
                    throw new IllegalArgumentException(aVarA.a + " | unsupported OMID API");
                case 1850541012:
                    if (str2.equals(e)) {
                        this.b.d(aVarA.b);
                        interfaceC5010ua.a(true, aVarA.c, c4871me);
                        return;
                    }
                    throw new IllegalArgumentException(aVarA.a + " | unsupported OMID API");
                default:
                    throw new IllegalArgumentException(aVarA.a + " | unsupported OMID API");
            }
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            c4871me.b("errMsg", e2.getMessage());
            Logger.i(c, "OMIDJSAdapter " + aVarA.a + " Exception: " + e2.getMessage());
            interfaceC5010ua.a(false, aVarA.d, c4871me);
        }
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
        a aVar = new a(0);
        aVar.a = jSONObjectJsonObjectInit.optString(i);
        aVar.b = jSONObjectJsonObjectInit.optJSONObject(j);
        aVar.c = jSONObjectJsonObjectInit.optString("success");
        aVar.d = jSONObjectJsonObjectInit.optString("fail");
        return aVar;
    }
}
