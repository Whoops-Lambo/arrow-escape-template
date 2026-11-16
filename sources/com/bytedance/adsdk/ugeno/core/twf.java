package com.bytedance.adsdk.ugeno.core;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class twf {
    private int ahm;
    private twf ct;
    private com.bytedance.adsdk.ugeno.ahm.rz kgy;
    private JSONObject rz;
    private twf uq;

    public int ahm() {
        return this.ahm;
    }

    public com.bytedance.adsdk.ugeno.ahm.rz kgy() {
        return this.kgy;
    }

    public JSONObject rz() {
        return this.rz;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.kgy + ", mEventType=" + this.ahm + ", mEvent=" + this.rz + '}';
    }

    public twf uq() {
        return this.uq;
    }

    public void ahm(twf twfVar) {
        this.ct = twfVar;
    }

    public void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        this.kgy = rzVar;
    }

    public void kgy(int i) {
        this.ahm = i;
    }

    public void kgy(JSONObject jSONObject) {
        this.rz = jSONObject;
    }

    public void kgy(twf twfVar) {
        this.uq = twfVar;
    }
}
