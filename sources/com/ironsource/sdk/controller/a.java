package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4871me;
import com.ironsource.C4937q8;
import com.ironsource.C4950r4;
import com.ironsource.Gg;
import com.ironsource.InterfaceC4847l8;
import com.ironsource.InterfaceC5010ua;
import com.ironsource.dh;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class a implements InterfaceC4847l8 {
    private static final String d = "loadWithUrl";
    private static final String e = "sendMessage";
    public static final String f = "removeAdView";
    public static final String g = "webviewAction";
    public static final String h = "handleGetViewVisibility";
    private static final String i = "functionName";
    private static final String j = "functionParams";
    private static final String k = "success";
    private static final String l = "fail";
    public static final String m = "errMsg";
    private static final String n = "%s | unsupported AdViews API";
    private dh a;
    private C4937q8 b = C4937q8.a();
    private Context c;

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C1379a {
        String a;
        JSONObject b;
        String c;
        String d;

        public /* synthetic */ C1379a(int i) {
            this();
        }

        private C1379a() {
        }
    }

    public a(Context context) {
        this.c = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(String str, InterfaceC5010ua interfaceC5010ua) throws Exception {
        a aVar;
        C1379a c1379aA = a(str);
        C4871me c4871me = new C4871me();
        try {
            String str2 = c1379aA.a;
            try {
                switch (str2.hashCode()) {
                    case -1384357108:
                        aVar = this;
                        if (str2.equals(f)) {
                            aVar.b.c(c1379aA.b, c1379aA.c, c1379aA.d);
                            return;
                        }
                        try {
                            try {
                                throw new IllegalArgumentException(c1379aA.a + " | unsupported AdViews API");
                            } catch (Exception e2) {
                                e = e2;
                                C4950r4.d().a(e);
                                c4871me.b("errMsg", e.getMessage());
                                String strC = aVar.b.c(c1379aA.b);
                                if (!TextUtils.isEmpty(strC)) {
                                    c4871me.b("adViewId", strC);
                                }
                                interfaceC5010ua.a(false, c1379aA.d, c4871me);
                                return;
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                        break;
                    case 691453791:
                        aVar = this;
                        if (str2.equals("sendMessage")) {
                            aVar.b.d(c1379aA.b, c1379aA.c, c1379aA.d);
                            return;
                        }
                        throw new IllegalArgumentException(c1379aA.a + " | unsupported AdViews API");
                    case 842351363:
                        if (str2.equals("loadWithUrl")) {
                            this.b.a(this, c1379aA.b, this.c, c1379aA.c, c1379aA.d);
                            return;
                        }
                        aVar = this;
                        throw new IllegalArgumentException(c1379aA.a + " | unsupported AdViews API");
                    case 1182065477:
                        if (str2.equals("handleGetViewVisibility")) {
                            this.b.a(c1379aA.b, c1379aA.c, c1379aA.d);
                            return;
                        }
                        aVar = this;
                        throw new IllegalArgumentException(c1379aA.a + " | unsupported AdViews API");
                    case 1491535759:
                        if (str2.equals(g)) {
                            this.b.b(c1379aA.b, c1379aA.c, c1379aA.d);
                            return;
                        }
                        aVar = this;
                        throw new IllegalArgumentException(c1379aA.a + " | unsupported AdViews API");
                    default:
                        aVar = this;
                        throw new IllegalArgumentException(c1379aA.a + " | unsupported AdViews API");
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e = e5;
            aVar = this;
        }
    }

    @Override // com.ironsource.InterfaceC4847l8
    public void a(String str, JSONObject jSONObject) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(str, jSONObject);
    }

    @Override // com.ironsource.InterfaceC4847l8
    public void a(String str, String str2, String str3) {
        a(str, Gg.a(str2, str3));
    }

    public void a(dh dhVar) {
        this.a = dhVar;
    }

    private C1379a a(String str) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
        C1379a c1379a = new C1379a(0);
        c1379a.a = jSONObjectJsonObjectInit.optString("functionName");
        c1379a.b = jSONObjectJsonObjectInit.optJSONObject("functionParams");
        c1379a.c = jSONObjectJsonObjectInit.optString("success");
        c1379a.d = jSONObjectJsonObjectInit.optString("fail");
        return c1379a;
    }
}
