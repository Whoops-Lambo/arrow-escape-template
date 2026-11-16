package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4679c1 {
    private NetworkSettings a;
    private JSONObject b;
    private IronSource.a c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;

    public String a() {
        return this.a.getAdSourceNameForEvents();
    }

    public IronSource.a b() {
        return this.c;
    }

    public JSONObject c() {
        return this.b;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }

    public String f() {
        return this.a.getProviderName();
    }

    public String g() {
        return this.a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.a;
    }

    public String i() {
        return this.a.getSubProviderId();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return this.e;
    }

    public C4679c1(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.a aVar) {
        boolean z;
        this.a = networkSettings;
        this.b = jSONObject;
        int iOptInt = jSONObject.optInt("instanceType");
        this.f = iOptInt;
        if (iOptInt == 2) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        this.e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.g = jSONObject.optInt("maxAdsPerSession", 99);
        this.c = aVar;
    }
}
