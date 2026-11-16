package com.bytedance.sdk.openadsdk.uq.ct.ahm;

import com.bytedance.sdk.component.utils.sx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class yo extends rz {
    private long ahm;
    private long kgy;

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
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZPoDucB7lmiY1F01iA", "fesokTO9fNSFZ9hZiR0=", "WuopoQyWesiOZdVXiRK0", 32);
            sx.rz("FeedPauseModel", th.getMessage());
        }
    }

    public void kgy(long j) {
        this.kgy = j;
    }
}
