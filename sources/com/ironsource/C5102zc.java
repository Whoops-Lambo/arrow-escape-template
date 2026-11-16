package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.zc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5102zc implements InterfaceC4926pf<JSONObject>, InterfaceC4890nf<C5066xc> {

    @NotNull
    private final Map<String, C4787i1> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4890nf
    public void a(@NotNull C5066xc c5066xc) {
        c5066xc.getClass();
        String strC = c5066xc.c();
        Map<String, C4787i1> map = this.a;
        C4787i1 c4787i1 = map.get(strC);
        if (c4787i1 == null) {
            c4787i1 = new C4787i1();
            map.put(strC, c4787i1);
        }
        c4787i1.a(c5066xc.a(new C5084yc()));
    }

    @Override // com.ironsource.InterfaceC4757g7
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull EnumC4908of enumC4908of) throws JSONException {
        enumC4908of.getClass();
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (Map.Entry<String, C4787i1> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArrayA = entry.getValue().a(enumC4908of);
            if (jSONArrayA.length() > 0) {
                jSONObjectJsonObjectInit.put(key, jSONArrayA);
            }
        }
        return jSONObjectJsonObjectInit;
    }
}
