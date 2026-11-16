package com.bytedance.sdk.openadsdk.uq.ct.ahm;

import com.bytedance.sdk.component.utils.sx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class twf extends rz {
    public int ahm;
    public long kgy;
    public long rz;

    public void ahm(long j) {
        this.rz = j;
    }

    @Override // com.bytedance.sdk.openadsdk.uq.ct.ahm.rz
    public void kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.kgy);
            jSONObject.put("buffers_count", this.ahm);
            jSONObject.put("total_duration", this.rz);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZPoDucB7lmiY1F01iA", "a+IsjCGpb8GFWPpSiBSs", "WuopoQyWesiOZdVXiRK0", 39);
            sx.rz("PlayBufferModel", th.getMessage());
        }
    }

    public void kgy(int i) {
        this.ahm = i;
    }

    public void kgy(long j) {
        this.kgy = j;
    }
}
