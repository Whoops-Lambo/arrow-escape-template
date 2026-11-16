package com.bytedance.sdk.openadsdk.uq.ct.ahm;

import com.bytedance.sdk.component.utils.sx;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ra extends rz {
    private long ahm;
    private String ct;
    private String kgy;
    private String noq;
    private long rz;
    private int uq;

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
            jSONObject.put(t.d, this.uq);
            jSONObject.put("error_message", this.ct);
            jSONObject.put("error_message_server", this.noq);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZPoDucB7lmiY1F01iA", "d+EskTW1bcKPb8VPgwONJ1/rIQ==", "WuopoQyWesiOZdVXiRK0", 57);
            sx.rz("LoadVideoErrorModel", th.getMessage());
        }
    }

    public void rz(String str) {
        this.noq = str;
    }

    public void ahm(String str) {
        this.ct = str;
    }

    public void kgy(long j) {
        this.ahm = j;
    }

    public void kgy(int i) {
        this.uq = i;
    }

    public void kgy(String str) {
        this.kgy = str;
    }
}
