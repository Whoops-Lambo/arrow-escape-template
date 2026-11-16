package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4972s8 implements InterfaceC4954r8, InterfaceC4954r8.a {

    @NotNull
    private JSONObject a = IronSourceNetworkBridge.jsonObjectInit();

    @NotNull
    private JSONObject b = IronSourceNetworkBridge.jsonObjectInit();

    @NotNull
    private JSONObject c = IronSourceNetworkBridge.jsonObjectInit();

    private final Object e(String str) {
        if (this.c.has(str)) {
            return this.c.get(str);
        }
        if (this.b.has(str)) {
            return this.b.get(str);
        }
        if (this.a.has(str)) {
            return this.a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4954r8.a
    public void a(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C4664b4.a.b);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        this.b = jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = this.a.optJSONObject(C4664b4.a.c);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = IronSourceNetworkBridge.jsonObjectInit();
        }
        this.c = jSONObjectOptJSONObject2;
    }

    @Override // com.ironsource.InterfaceC4954r8
    @Nullable
    public Integer b(@NotNull String str) {
        str.getClass();
        Object objE = e(str);
        if (objE instanceof Integer) {
            return (Integer) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4954r8
    @Nullable
    public Boolean c(@NotNull String str) {
        str.getClass();
        Object objE = e(str);
        if (objE instanceof Boolean) {
            return (Boolean) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4954r8
    @Nullable
    public String d(@NotNull String str) {
        str.getClass();
        Object objE = e(str);
        if (objE instanceof String) {
            return (String) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4954r8
    @Nullable
    public JSONObject a(@NotNull String str) {
        str.getClass();
        Object objE = e(str);
        if (objE instanceof JSONObject) {
            return (JSONObject) objE;
        }
        return null;
    }
}
