package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.C4950r4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class g {
    private static final String c = "com.ironsource.sdk.controller.g";
    private static final String d = "functionName";
    private static final String e = "params";
    private static final String f = "hash";
    private final b a;
    private final s b;

    private void b(String str, String str2, String str3) {
        this.a.a(a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            Logger.i(c, "messageHandler(" + str + " " + str3 + ")");
            if (this.b.a(str, str2, str3)) {
                a(str, str2);
            } else {
                b(str, str2, str3);
            }
        } catch (Exception e2) {
            a(e2);
        }
    }

    public g(b bVar, s sVar) {
        this.a = bVar;
        this.b = sVar;
    }

    private String a(String str, String str2, String str3) {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("functionName", SDKUtils.encodeString(str));
            jSONObjectJsonObjectInit.put("params", SDKUtils.encodeString(str2));
            jSONObjectJsonObjectInit.put(f, SDKUtils.encodeString(str3));
        } catch (JSONException e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObjectJsonObjectInit.toString();
    }

    private void a(String str, String str2) throws Exception {
        this.a.a(str, str2);
    }

    private void a(String str) {
        this.a.b(str);
    }

    private void a(Exception exc) {
        if (exc instanceof NoSuchMethodException) {
            IronLog.INTERNAL.error(exc.toString());
            Logger.i(c, "messageHandler failed with exception " + exc.getMessage());
            return;
        }
        a(exc.getLocalizedMessage());
    }
}
