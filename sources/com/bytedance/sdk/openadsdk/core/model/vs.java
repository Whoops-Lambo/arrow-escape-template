package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class vs {
    private final int ahm;
    private final int kgy;

    public static boolean kgy(ioy ioyVar) {
        if (ioyVar == null || !ioyVar.ug() || ioyVar.kp() == null) {
            return false;
        }
        return ioyVar.kp().ahm();
    }

    public boolean ahm() {
        return this.ahm == 1;
    }

    public vs(JSONObject jSONObject) {
        this.kgy = jSONObject.optInt("auto_click", 0);
        this.ahm = jSONObject.optInt("hidden_bar", 0);
    }

    public int kgy() {
        return this.kgy;
    }
}
