package com.ironsource;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class S9 {
    private String a;
    private String e;
    private Map<String, String> f;
    private final Oc g;
    private boolean h;
    private boolean b = false;
    private boolean c = false;
    private C4794i8 d = null;
    protected boolean i = false;
    protected String j = null;

    public S9 c() {
        this.b = true;
        return this;
    }

    public R9 a() {
        return new R9(b(), this.a, this.b, this.c, this.h, this.i, this.j, this.f, this.g, this.d);
    }

    public String b() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("name", this.a);
            jSONObjectJsonObjectInit.put("rewarded", this.b);
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return (this.c || this.h) ? C4706da.a() : C4706da.a(jSONObjectJsonObjectInit);
    }

    public S9(String str, Oc oc) throws NullPointerException {
        this.a = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.g = (Oc) SDKUtils.requireNonNull(oc, "AdListener name can't be null");
    }

    public S9 c(boolean z) {
        this.h = z;
        return this;
    }

    public S9 a(C4794i8 c4794i8) {
        this.d = c4794i8;
        return this;
    }

    public S9 a(String str) {
        this.e = str;
        return this;
    }

    public S9 a(Map<String, String> map) {
        this.f = map;
        return this;
    }

    public S9 a(boolean z) {
        this.c = z;
        return this;
    }

    public S9 b(@Nullable String str) {
        this.j = str;
        return this;
    }

    public S9 b(boolean z) {
        this.i = z;
        return this;
    }
}
