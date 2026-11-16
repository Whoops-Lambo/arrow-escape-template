package com.bytedance.sdk.openadsdk.uq.ct.ahm;

import com.bytedance.sdk.component.utils.sx;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import defpackage.le3;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kus extends rz {
    private long ahm;
    private final String ct;
    private long kgy;
    private final int rz;
    private final int uq;

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
            jSONObject.put(t.d, this.rz);
            jSONObject.put("extra_error_code", this.uq);
            jSONObject.put("error_message", this.ct);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZPoDucB7lmiY1F01iA", "a+IsjCaue8iSZ9hZiR0=", "WuopoQyWesiOZdVXiRK0", 49);
            sx.rz("PlayErrorModel", th.getMessage());
        }
    }

    public kus(le3 le3Var) {
        this.rz = le3Var.a;
        this.uq = le3Var.b;
        this.ct = le3Var.c;
    }

    public void kgy(long j) {
        this.kgy = j;
    }
}
