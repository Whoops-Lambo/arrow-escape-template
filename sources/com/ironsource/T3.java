package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import defpackage.dt1;
import defpackage.qh1;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class T3 {

    @NotNull
    private final C4981t a;

    @NotNull
    private final C4981t b;

    @NotNull
    private final C4589a3 c;

    @NotNull
    private final Xb d;

    @NotNull
    private final J1 e;

    @NotNull
    private final Map<LevelPlay.AdFormat, C4981t> f;

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("adFormats");
        return (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(str)) == null) ? IronSourceNetworkBridge.jsonObjectInit() : jSONObjectOptJSONObject;
    }

    @NotNull
    public final J1 b() {
        return this.e;
    }

    @NotNull
    public final C4589a3 c() {
        return this.c;
    }

    @NotNull
    public final Xb d() {
        return this.d;
    }

    public T3(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        C4981t c4981t = new C4981t(a(jSONObject, "rewarded"));
        this.a = c4981t;
        C4981t c4981t2 = new C4981t(a(jSONObject, "interstitial"));
        this.b = c4981t2;
        this.c = new C4589a3(a(jSONObject, "banner"));
        this.d = new Xb(a(jSONObject, "nativeAd"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("application");
        this.e = new J1(jSONObjectOptJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObjectOptJSONObject);
        this.f = qh1.Y(new dt1(LevelPlay.AdFormat.INTERSTITIAL, c4981t2), new dt1(LevelPlay.AdFormat.REWARDED, c4981t));
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, C4981t> a() {
        return this.f;
    }
}
