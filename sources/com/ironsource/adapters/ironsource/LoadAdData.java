package com.ironsource.adapters.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class LoadAdData {

    @NotNull
    private final JSONObject localAdData;

    @Nullable
    public final String adUnitId() {
        String strOptString = this.localAdData.optString("adUnitId");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }

    public LoadAdData(@Nullable JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : jSONObject;
    }

    public LoadAdData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ LoadAdData(JSONObject jSONObject, int i, e80 e80Var) {
        this((i & 1) != 0 ? null : jSONObject);
    }
}
