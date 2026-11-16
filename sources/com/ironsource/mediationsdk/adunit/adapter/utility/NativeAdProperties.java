package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C4950r4;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class NativeAdProperties {

    @NotNull
    private final AdOptionsPosition adOptionsPosition;

    @NotNull
    private final AdOptionsPosition defaultAdOptionPosition;

    private final AdOptionsPosition getAdOptionsPosition(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            strOptString.getClass();
            return AdOptionsPosition.valueOf(strOptString);
        } catch (Exception e) {
            C4950r4.d().a(e);
            return this.defaultAdOptionPosition;
        }
    }

    public NativeAdProperties(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.defaultAdOptionPosition = AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(jSONObject);
    }

    @NotNull
    public final AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }
}
