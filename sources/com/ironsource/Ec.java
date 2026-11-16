package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import defpackage.cm2;
import defpackage.eu;
import defpackage.gd1;
import defpackage.rh1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Ec {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @NotNull
    private final String d;

    @Nullable
    private final String e;

    @Nullable
    private final JSONObject f;

    @NotNull
    private final Map<String, JSONObject> g;

    @NotNull
    private final String h;

    @NotNull
    private final String i;
    private final boolean j;

    @Nullable
    private Ec k;

    @NotNull
    private final gd1 l;

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkSettings a(Ec ec) {
        String str = ec.a;
        String str2 = ec.c;
        String str3 = ec.d;
        String str4 = ec.e;
        JSONObject jSONObject = ec.f;
        Ec ec2 = ec.k;
        JSONObject jSONObjectB = IronSourceUtils.b(jSONObject, ec2 != null ? ec2.f : null);
        JSONObject jSONObjectM = ec.m();
        Ec ec3 = ec.k;
        JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectM, ec3 != null ? ec3.m() : null);
        JSONObject jSONObjectE = ec.e();
        Ec ec4 = ec.k;
        JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectE, ec4 != null ? ec4.e() : null);
        JSONObject jSONObjectD = ec.d();
        Ec ec5 = ec.k;
        JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectD, ec5 != null ? ec5.d() : null);
        JSONObject jSONObjectG = ec.g();
        Ec ec6 = ec.k;
        NetworkSettings networkSettings = new NetworkSettings(str, str2, str3, str4, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4, IronSourceUtils.b(jSONObjectG, ec6 != null ? ec6.g() : null));
        networkSettings.setIsMultipleInstances(ec.j);
        networkSettings.setSubProviderId(ec.h);
        networkSettings.setAdSourceNameForEvents(ec.i);
        return networkSettings;
    }

    @NotNull
    public final String b() {
        return this.i;
    }

    @NotNull
    public final JSONObject d() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.g.get("banner"), this.f);
        jSONObjectB.getClass();
        return jSONObjectB;
    }

    @NotNull
    public final JSONObject e() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.g.get("interstitial"), this.f);
        jSONObjectB.getClass();
        return jSONObjectB;
    }

    @NotNull
    public final NetworkSettings f() {
        return (NetworkSettings) this.l.getValue();
    }

    @NotNull
    public final JSONObject g() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.g.get("nativeAd"), this.f);
        jSONObjectB.getClass();
        return jSONObjectB;
    }

    @NotNull
    public final String h() {
        return this.d;
    }

    @NotNull
    public final String i() {
        return this.b;
    }

    @NotNull
    public final String j() {
        return this.a;
    }

    @Nullable
    public final String k() {
        return this.e;
    }

    @NotNull
    public final String l() {
        return this.c;
    }

    @NotNull
    public final JSONObject m() {
        JSONObject jSONObjectB = IronSourceUtils.b(this.g.get("rewarded"), this.f);
        jSONObjectB.getClass();
        return jSONObjectB;
    }

    @NotNull
    public final String n() {
        return this.h;
    }

    public final boolean o() {
        return this.j;
    }

    public Ec(@NotNull String str, @NotNull JSONObject jSONObject) {
        String str2;
        JSONObject jSONObjectJsonObjectInit;
        str.getClass();
        jSONObject.getClass();
        this.a = str;
        this.b = str;
        String strOptString = jSONObject.optString(Fc.d, str);
        strOptString.getClass();
        this.c = strOptString;
        String strOptString2 = jSONObject.optString(Fc.f, strOptString);
        strOptString2.getClass();
        this.d = strOptString2;
        Object objOpt = jSONObject.opt("providerNetworkKey");
        if (objOpt instanceof String) {
            str2 = (String) objOpt;
        } else {
            str2 = null;
        }
        this.e = str2;
        this.f = jSONObject.optJSONObject("application");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(adFormatArrValues.length);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            arrayList.add(If.a(adFormat));
        }
        int iU = rh1.U(eu.f(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU < 16 ? 16 : iU);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str3 = (String) obj;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adFormats");
            if (jSONObjectOptJSONObject == null || (jSONObjectJsonObjectInit = jSONObjectOptJSONObject.optJSONObject(str3)) == null) {
                jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            }
            linkedHashMap.put(obj, jSONObjectJsonObjectInit);
        }
        this.g = linkedHashMap;
        String strOptString3 = jSONObject.optString("spId", "0");
        strOptString3.getClass();
        this.h = strOptString3;
        String strOptString4 = jSONObject.optString(Fc.a);
        strOptString4.getClass();
        this.i = strOptString4;
        this.j = jSONObject.optBoolean(Fc.c, false);
        this.l = new cm2(new defpackage.s5(this, 20));
    }

    public final void b(@Nullable Ec ec) {
        this.k = ec;
    }

    @Nullable
    public final JSONObject c() {
        return this.f;
    }

    @NotNull
    public final Map<String, JSONObject> a() {
        return this.g;
    }
}
