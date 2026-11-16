package com.tiktok.appevents.edp;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class TTAppLaunchEvent {
    private JSONObject prop;
    private long ts;

    public JSONObject getProp() {
        return this.prop;
    }

    public long getTs() {
        return this.ts;
    }

    public void setProp(JSONObject jSONObject) {
        this.prop = jSONObject;
    }

    public void setTs(long j) {
        this.ts = j;
    }

    public TTAppLaunchEvent(JSONObject jSONObject, long j) {
        this.prop = jSONObject;
        this.ts = j;
    }
}
