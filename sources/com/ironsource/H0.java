package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.dk2;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class H0 implements InterfaceC4926pf<JSONObject>, InterfaceC4890nf<F0> {

    @NotNull
    private final Map<String, C5102zc> a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC4890nf
    public void a(@NotNull F0 f0) {
        f0.getClass();
        String strD = f0.d();
        Map<String, C5102zc> map = this.a;
        C5102zc c5102zc = map.get(strD);
        if (c5102zc == null) {
            c5102zc = new C5102zc();
            map.put(strD, c5102zc);
        }
        c5102zc.a(f0.a(new G0()));
    }

    @Override // com.ironsource.InterfaceC4757g7
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a(@NotNull EnumC4908of enumC4908of) throws JSONException {
        enumC4908of.getClass();
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        for (Map.Entry<String, C5102zc> entry : this.a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectA = entry.getValue().a(enumC4908of);
            if (jSONObjectA.length() > 0) {
                jSONObjectJsonObjectInit.put(dk2.s0(key, "_"), jSONObjectA);
            }
        }
        return jSONObjectJsonObjectInit;
    }
}
