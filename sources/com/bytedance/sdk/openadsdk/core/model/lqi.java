package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class lqi {
    private final int ahm;
    private final int kgy;
    private final int rz;
    private final int uq;

    public int ahm() {
        return this.rz;
    }

    public int kgy() {
        return this.kgy;
    }

    public int rz() {
        return this.uq;
    }

    public lqi(JSONObject jSONObject) {
        this.kgy = jSONObject.optInt("max_time", 0);
        this.ahm = jSONObject.optInt("auto_skip_time", -1);
        this.rz = jSONObject.optInt("show_after_inactivity", 10);
        this.uq = jSONObject.optInt("user_wait_time", 10);
    }
}
