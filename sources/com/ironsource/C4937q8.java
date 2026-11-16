package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.m93;
import defpackage.n30;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4937q8 implements InterfaceC4661b1 {
    private static final String b = "q8";
    private static C4937q8 c;
    private final Map<String, L8> a = n30.r();

    /* JADX INFO: renamed from: com.ironsource.q8$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ C4919p8 a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        public a(C4919p8 c4919p8, Context context, String str) {
            this.a = c4919p8;
            this.b = context;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4937q8.this.a.put(this.c, new C4829k8(this.a, this.b));
        }
    }

    public void a(InterfaceC4847l8 interfaceC4847l8, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "loadWithUrl fail - adViewId is empty");
            m93.j("adViewId is empty");
            return;
        }
        C4794i8 c4794i8B = b(jSONObject);
        if (this.a.containsKey(string)) {
            Logger.i(b, "sendMessageToAd fail - collection already contain adViewId");
            m93.j("collection already contain adViewId");
            return;
        }
        C4919p8 c4919p8 = new C4919p8(interfaceC4847l8, context, string, c4794i8B);
        c4919p8.e(IronSourceStorageUtils.getNetworkStorageDir(context));
        c4919p8.b(jSONObject, str, str2);
        if (d(jSONObject)) {
            V7.a.d(new a(c4919p8, context, string));
        } else {
            this.a.put(string, c4919p8);
        }
    }

    public void b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "performWebViewAction fail - adViewId is empty");
            m93.j("adViewId is empty");
        } else {
            if (!this.a.containsKey(string)) {
                Logger.i(b, "performWebViewAction fail - collection does not contain adViewId");
                m93.j("collection does not contain adViewId");
                return;
            }
            L8 l8 = this.a.get(string);
            String string2 = jSONObject.getString(C4664b4.i.v0);
            if (l8 != null) {
                l8.a(string2, str, str2);
            }
        }
    }

    public void c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.i(b, "removeAdView fail - adViewId is empty");
            m93.j("adViewId is empty");
        } else {
            if (!this.a.containsKey(string)) {
                Logger.i(b, "removeAdView fail - collection does not contain adViewId");
                m93.j("collection does not contain adViewId");
                return;
            }
            L8 l8 = this.a.get(string);
            this.a.remove(string);
            if (l8 != null) {
                l8.a(str, str2);
            }
        }
    }

    public void d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = IronSourceNetworkBridge.jsonObjectInit(jSONObject.getString("params")).getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                L8 l8 = this.a.get(string);
                if (l8 != null) {
                    l8.c(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "sendMessageToAd fail - collection does not contain adViewId");
            m93.j("collection does not contain adViewId");
            return;
        }
        Logger.i(b, "sendMessageToAd fail - adViewId is empty");
        m93.j("adViewId is empty");
    }

    public String c(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !jSONObject.has("adViewId")) {
            return (jSONObject == null || !jSONObject.has("params")) ? "" : IronSourceNetworkBridge.jsonObjectInit(jSONObject.getString("params")).getString("adViewId");
        }
        return jSONObject.getString("adViewId");
    }

    private C4794i8 b(JSONObject jSONObject) {
        C4794i8 c4794i8 = new C4794i8();
        try {
            return a(jSONObject);
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return c4794i8;
        }
    }

    private boolean d(JSONObject jSONObject) {
        return jSONObject.optBoolean(C4664b4.i.s0);
    }

    public static synchronized C4937q8 a() {
        try {
            if (c == null) {
                c = new C4937q8();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    private C4794i8 a(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(jSONObject.getString(C4664b4.i.O));
            String string = jSONObjectJsonObjectInit.get("height").toString();
            String string2 = jSONObjectJsonObjectInit.get("width").toString();
            return new C4794i8(Integer.parseInt(string2), Integer.parseInt(string), jSONObjectJsonObjectInit.get("label").toString());
        } catch (Exception e) {
            C4950r4.d().a(e);
            return new C4794i8();
        }
    }

    @Override // com.ironsource.InterfaceC4661b1
    @Nullable
    public L8 a(String str) {
        if (str.isEmpty() || !this.a.containsKey(str)) {
            return null;
        }
        return this.a.get(str);
    }

    public void a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (!string.isEmpty()) {
            if (this.a.containsKey(string)) {
                L8 l8 = this.a.get(string);
                if (l8 != null) {
                    l8.a(jSONObject, str, str2);
                    return;
                }
                return;
            }
            Logger.i(b, "removeAdView fail - collection does not contain adViewId");
            m93.j("collection does not contain adViewId");
            return;
        }
        Logger.i(b, "removeAdView fail - adViewId is empty");
        m93.j("adViewId is empty");
    }
}
