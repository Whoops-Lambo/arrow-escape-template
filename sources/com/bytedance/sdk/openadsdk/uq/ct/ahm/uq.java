package com.bytedance.sdk.openadsdk.uq.ct.ahm;

import com.bytedance.sdk.component.utils.sx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class uq extends rz {
    public long ahm;
    public long kgy;
    public int rz;
    public int uq = 0;

    public void ahm(long j) {
        this.ahm = j;
    }

    @Override // com.bytedance.sdk.openadsdk.uq.ct.ahm.rz
    public void kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.kgy);
            jSONObject.put("buffers_time", this.ahm);
            jSONObject.put("break_reason", this.rz);
            jSONObject.put("video_backup", this.uq);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZPoDucB7lmiY1F01iA", "fesokSGubMaLZ9hZiR0=", "WuopoQyWesiOZdVXiRK0", 45);
            sx.rz("FeedBreakModel", th.getMessage());
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
