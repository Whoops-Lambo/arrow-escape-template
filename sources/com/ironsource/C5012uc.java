package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.uc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class C5012uc {
    private final B7 b = Pb.k0().a();
    V6 a = new V6();

    public void c() {
        this.a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.a.a(R6.V, "9.6.1");
    }

    public void e() {
        HashMap map = new HashMap();
        map.put(R6.E, Nc.f);
        map.put(R6.D, Nc.e);
        this.a.a(map);
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.a.a(R6.i, IronSourceNetworkBridge.jsonObjectInit(controllerConfig).opt(C4664b4.a.q));
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.a.a("debug", jSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        this.a.a(R6.l, jSONObject);
    }

    public void a(C4990t8.c cVar) {
        this.a.a(R6.y1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.a.a(R6.n, Boolean.valueOf(this.b.a((Activity) context)));
        }
    }

    public void a(List<String> list) {
        this.a.a(R6.B1, list);
    }

    public void a(boolean z) {
        this.a.a(R6.U0, Boolean.valueOf(z));
    }
}
