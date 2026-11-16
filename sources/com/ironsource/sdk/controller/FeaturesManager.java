package com.ironsource.sdk.controller;

import com.ironsource.C4664b4;
import com.ironsource.C4667b7;
import com.ironsource.C4693cf;
import com.ironsource.C4950r4;
import com.ironsource.InterfaceC4954r8;
import com.ironsource.O3;
import com.ironsource.P3;
import com.ironsource.Pb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class FeaturesManager {
    private static volatile FeaturesManager d = null;
    private static final String e = "debugMode";
    private Map<String, ?> a;
    private final ArrayList<String> b = new a();
    private InterfaceC4954r8 c = Pb.k0().t();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a extends ArrayList<String> {
        public a() {
            add(C4664b4.d.f);
            add(C4664b4.d.e);
            add(C4664b4.d.g);
            add(C4664b4.d.h);
            add(C4664b4.d.i);
            add(C4664b4.d.j);
            add(C4664b4.d.k);
            add(C4664b4.d.l);
            add(C4664b4.d.m);
        }
    }

    public static FeaturesManager getInstance() {
        if (d == null) {
            synchronized (FeaturesManager.class) {
                try {
                    if (d == null) {
                        d = new FeaturesManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public ArrayList<String> a() {
        return new ArrayList<>(this.b);
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.a.containsKey("debugMode")) {
                num = (Integer) this.a.get("debugMode");
            }
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public C4667b7 getFeatureFlagHealthCheck() {
        JSONObject jSONObjectA = this.c.a(C4664b4.a.r);
        return jSONObjectA != null ? new C4667b7(jSONObjectA) : new C4667b7(null);
    }

    public boolean getStopUseOnResumeAndPause() {
        return Boolean.TRUE.equals(this.c.c(C4664b4.a.u));
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.a = map;
    }

    private FeaturesManager() {
        if (d == null) {
            this.a = new HashMap();
        } else {
            y.j("Use getInstance() method to get the single instance of this class.");
            throw null;
        }
    }

    public JSONObject getDataManagerConfig() {
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        if (networkConfiguration.has(C4664b4.a.d)) {
            return networkConfiguration.optJSONObject(C4664b4.a.d);
        }
        return IronSourceNetworkBridge.jsonObjectInit();
    }

    public O3 getFeatureFlagCatchUrlError() {
        return new O3(SDKUtils.getNetworkConfiguration().optJSONObject(O3.a.c));
    }

    public P3 getFeatureFlagClickCheck() {
        return new P3(SDKUtils.getNetworkConfiguration());
    }

    public boolean getFeatureFlagLoadControllerAndPlayerFromBundle() {
        return SDKUtils.getNetworkFeatureConfiguration().optBoolean(C4664b4.a.w, false);
    }

    public int getInitRecoverTrials() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject("init");
        if (jSONObjectOptJSONObject == null) {
            return 0;
        }
        return jSONObjectOptJSONObject.optInt(C4664b4.a.e, 0);
    }

    public C4693cf getSessionHistoryConfig() {
        JSONObject jSONObjectJsonObjectInit;
        JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
        if (networkConfiguration.has(C4664b4.a.s)) {
            jSONObjectJsonObjectInit = networkConfiguration.optJSONObject(C4664b4.a.s);
        } else {
            jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        }
        return new C4693cf(jSONObjectJsonObjectInit);
    }
}
