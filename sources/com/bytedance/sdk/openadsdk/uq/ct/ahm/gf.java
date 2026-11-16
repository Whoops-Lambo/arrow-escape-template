package com.bytedance.sdk.openadsdk.uq.ct.ahm;

import com.bytedance.sdk.component.utils.sx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class gf extends rz {
    private final long ahm;
    private final String kgy;

    @Override // com.bytedance.sdk.openadsdk.uq.ct.ahm.rz
    public void kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.kgy);
            jSONObject.put("preload_size", this.ahm);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZPoDucB7lmiY1F01iA", "d+EskTW1bcKPadZTjxSsBVTqKJk=", "WuopoQyWesiOZdVXiRK0", 29);
            sx.rz("LoadVideoCancelModel", th.getMessage());
        }
    }

    public gf(String str, long j) {
        this.kgy = str;
        this.ahm = j;
    }
}
