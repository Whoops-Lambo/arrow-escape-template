package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import defpackage.rh1;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class H1 {

    @NotNull
    private final Map<LevelPlay.AdFormat, C4910p> a;

    @NotNull
    public final Map<LevelPlay.AdFormat, C4910p> a() {
        return this.a;
    }

    public H1(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        int iU = rh1.U(adFormatArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU < 16 ? 16 : iU);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(If.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = IronSourceNetworkBridge.jsonObjectInit();
            }
            linkedHashMap.put(adFormat, new C4910p(jSONObjectOptJSONObject));
        }
        this.a = linkedHashMap;
    }
}
