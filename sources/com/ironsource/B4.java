package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class B4 {
    private static final String c = "B4";
    private static final String d = "setSharedSignal";
    private static final String e = "getSharedSignal";
    private static final String f = "functionName";
    private static final String g = "functionParams";
    private static final String h = "success";
    private static final String i = "fail";
    private final Context a;
    A4 b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        String a;
        JSONObject b;
        String c;
        String d;

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.a = jSONObject.optString("functionName");
            aVar.b = jSONObject.optJSONObject("functionParams");
            aVar.c = jSONObject.optString("success");
            aVar.d = jSONObject.optString("fail");
            return aVar;
        }

        private a() {
        }
    }

    private void b(Context context, a aVar, InterfaceC5010ua interfaceC5010ua) {
        C4871me c4871me = new C4871me();
        JSONObject jSONObject = aVar.b;
        this.b.a(context, EnumC5094z4.a(jSONObject.optString("source")), jSONObject.optString(C4664b4.i.W), jSONObject.optString("data"));
        interfaceC5010ua.a(true, aVar.c, c4871me);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    public void a(String str, InterfaceC5010ua interfaceC5010ua) throws Exception {
        byte b;
        a aVarA = a(str);
        try {
            String str2 = aVarA.a;
            int iHashCode = str2.hashCode();
            if (iHashCode != 576059875) {
                if (iHashCode == 1486812399 && str2.equals(d)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str2.equals(e)) {
                b = 1;
            } else {
                b = -1;
            }
            if (b == 0) {
                b(this.a, aVarA, interfaceC5010ua);
            } else if (b == 1) {
                a(this.a, aVarA, interfaceC5010ua);
            } else {
                throw new UnsupportedOperationException("unsupported API: " + str);
            }
        } catch (Exception e2) {
            a(aVarA, interfaceC5010ua, e2);
        }
    }

    public B4(Context context, A4 a4) {
        this.a = context;
        this.b = a4;
    }

    private a a(String str) throws JSONException {
        return a.a(IronSourceNetworkBridge.jsonObjectInit(str));
    }

    private void a(Context context, a aVar, InterfaceC5010ua interfaceC5010ua) {
        C4871me c4871me = new C4871me();
        JSONObject jSONObject = aVar.b;
        c4871me.b("data", this.b.a(context, EnumC5094z4.a(jSONObject.optString("source")), jSONObject.optString(C4664b4.i.W)));
        interfaceC5010ua.a(true, aVar.c, c4871me);
    }

    private void a(a aVar, InterfaceC5010ua interfaceC5010ua, Exception exc) {
        C4950r4.d().a(exc);
        String message = exc.getMessage();
        Logger.i(c, aVar.a + " exception " + message);
        C4871me c4871me = new C4871me();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        c4871me.b("error", message);
        interfaceC5010ua.a(false, aVar.d, c4871me);
    }
}
