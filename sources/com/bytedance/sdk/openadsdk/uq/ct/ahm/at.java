package com.bytedance.sdk.openadsdk.uq.ct.ahm;

import com.bytedance.sdk.component.utils.sx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class at extends rz {
    private long ahm;
    private boolean ct;
    private String kgy;
    private long rz;
    private long uq;

    public void ahm(long j) {
        this.rz = j;
    }

    @Override // com.bytedance.sdk.openadsdk.uq.ct.ahm.rz
    public void kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.kgy);
            jSONObject.put("preload_size", this.ahm);
            jSONObject.put("load_time", this.rz);
            jSONObject.put("local_cache", this.uq);
            jSONObject.put("use_global_cache", this.ct);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZPoDucB7lmiY1F01iA", "d+EskTW1bcKPecJejxSzO3bhKZAP", "WuopoQyWesiOZdVXiRK0", 65);
            sx.rz("LoadVideoSuccessModel", th.getMessage());
        }
    }

    public void rz(long j) {
        this.uq = j;
    }

    public void kgy(long j) {
        this.ahm = j;
    }

    public void kgy(String str) {
        this.kgy = str;
    }

    public void kgy(boolean z) {
        this.ct = z;
    }
}
