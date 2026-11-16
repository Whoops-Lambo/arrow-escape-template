package com.adsurge.adn.Z;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.adsurge.adn.I0.k;
import com.ironsource.C4664b4;
import com.ironsource.R6;
import com.safedk.android.analytics.events.CrashEvent;
import com.singular.sdk.internal.UserDetailsUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public JSONObject e() {
        return null;
    }

    public JSONObject a(JSONObject jSONObject, StackTraceElement[] stackTraceElementArr) throws JSONException {
        String fileName;
        JSONArray jSONArray = new JSONArray();
        if (stackTraceElementArr == null) {
            return jSONObject.put("stacktrace", jSONArray);
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            JSONObject jSONObject2 = new JSONObject();
            if (stackTraceElement.isNativeMethod()) {
                fileName = "Native Method";
            } else {
                fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "Unknown Source";
                }
            }
            jSONObject2.put("object_name", fileName);
            jSONObject2.put("symbol_name", stackTraceElement.getClassName() + UserDetailsUtils.UserDetailsLiterals.DOT + stackTraceElement.getMethodName());
            int lineNumber = stackTraceElement.getLineNumber();
            if (lineNumber >= 0) {
                jSONObject2.put("symbol_addr_offset", lineNumber);
            }
            jSONArray.put(jSONObject2);
        }
        return jSONObject.put("stacktrace", jSONArray);
    }

    public final JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdk", f());
        jSONObject.put("app", a());
        jSONObject.put(C4664b4.i.G, c());
        jSONObject.put("state", g());
        jSONObject.put("crash", b());
        JSONObject jSONObjectE = e();
        if (jSONObjectE != null && jSONObjectE.length() > 0) {
            jSONObject.put(CrashEvent.e, jSONObjectE);
        }
        a.a().e();
        return jSONObject;
    }

    public JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", com.adsurge.adn.D0.a.c().b().a());
        com.adsurge.adn.E0.d dVarE = com.adsurge.adn.D0.a.c().e();
        jSONObject.put("ver", dVarE.c());
        int iB = dVarE.b();
        if (iB > 0) {
            jSONObject.put("pv", iB);
            if (dVarE.d()) {
                jSONObject.put("np", 1);
            }
        }
        return jSONObject;
    }

    public JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (com.adsurge.adn.I0.a.a().b()) {
            jSONObject.put("foreground", 1);
        }
        jSONObject.put("it", a.e());
        jSONObject.put("net", com.adsurge.adn.D0.a.c().d().b().c());
        return jSONObject;
    }

    public JSONObject b() throws JSONException {
        com.adsurge.adn.E0.a aVarB = com.adsurge.adn.D0.a.c().b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lifeID", com.adsurge.adn.D0.a.c().e().a());
        jSONObject.put("process", aVarB.d());
        return jSONObject;
    }

    public JSONObject c() throws JSONException {
        Context contextA = com.adsurge.adn.D0.a.c().a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(R6.F, 2);
        jSONObject.put("osVer", Build.VERSION.SDK_INT);
        jSONObject.put("tgtVer", contextA.getApplicationInfo().targetSdkVersion);
        a.a().e();
        if (!TextUtils.isEmpty(null)) {
            jSONObject.put("name", (Object) null);
        }
        jSONObject.put("brand", Build.BRAND);
        jSONObject.put(R6.B, Build.MODEL);
        jSONObject.put("arch", k.a());
        jSONObject.put("freeStoreSize", com.adsurge.adn.I0.c.a());
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory();
        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        jSONObject.put("memorySize", jMaxMemory);
        jSONObject.put("freeMemorySize", jMaxMemory - jFreeMemory);
        jSONObject.put("usedMemorySize", jFreeMemory);
        return jSONObject;
    }

    public JSONObject a() throws JSONException {
        com.adsurge.adn.E0.a aVarB = com.adsurge.adn.D0.a.c().b();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pkg", aVarB.b());
        jSONObject.put("ver", aVarB.c());
        return jSONObject;
    }
}
