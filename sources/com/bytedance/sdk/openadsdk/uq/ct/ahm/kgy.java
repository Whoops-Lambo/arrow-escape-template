package com.bytedance.sdk.openadsdk.uq.ct.ahm;

import com.bytedance.sdk.openadsdk.core.model.ioy;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy {
    private String ahm;
    private rz ct;
    private ioy kgy;
    private boolean noq = false;
    private JSONObject rz;
    private JSONObject uq;

    public String ahm() {
        return this.ahm;
    }

    public rz ct() {
        return this.ct;
    }

    public ioy kgy() {
        return this.kgy;
    }

    public boolean noq() {
        return this.noq;
    }

    public JSONObject rz() {
        if (this.rz == null) {
            this.rz = new JSONObject();
        }
        return this.rz;
    }

    public JSONObject uq() {
        if (this.uq == null) {
            this.uq = new JSONObject();
        }
        return this.uq;
    }

    public void yo() {
        rz rzVar = this.ct;
        if (rzVar != null) {
            rzVar.kgy(this);
        }
    }

    public kgy(ioy ioyVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        this.kgy = ioyVar;
        this.ahm = str;
        this.rz = jSONObject;
        this.uq = jSONObject2;
    }

    public void kgy(rz rzVar) {
        this.ct = rzVar;
    }

    public void kgy(boolean z) {
        this.noq = z;
    }
}
