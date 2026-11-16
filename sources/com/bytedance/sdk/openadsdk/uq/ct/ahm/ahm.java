package com.bytedance.sdk.openadsdk.uq.ct.ahm;

import com.bytedance.sdk.component.utils.sx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm extends rz {
    private long ahm;
    private long kgy;
    private int rz;
    private int uq;

    public void ahm(long j) {
        this.ahm = j;
    }

    @Override // com.bytedance.sdk.openadsdk.uq.ct.ahm.rz
    public void kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.kgy);
            jSONObject.put("total_duration", this.ahm);
            jSONObject.put("vbtt_skip_type", this.rz);
            jSONObject.put("skip_reason", this.uq);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZPoDucB7lmiY1F01iA", "fuAplgKubfSLQ8dwgxWlJA==", "WuopoQyWesiOZdVXiRK0", 46);
            sx.rz("EndcardSkipModel", th.getMessage());
        }
    }

    public void ahm(int i) {
        this.uq = i;
    }

    public void kgy(int i) {
        this.rz = i;
    }

    public void kgy(long j) {
        this.kgy = j;
    }
}
