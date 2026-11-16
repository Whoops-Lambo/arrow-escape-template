package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ay {
    private String kgy = "horizontal";
    private int ahm = 1;
    private int rz = 1;
    private int uq = 0;
    private int ct = 0;
    private int noq = 0;
    private int yo = 0;
    private int fi = 5000;
    private int gf = 500;
    private int ra = 0;

    public static ay kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new ay();
        }
        ay ayVar = new ay();
        ayVar.kgy = jSONObject.optString("direction", "horizontal");
        ayVar.ahm = jSONObject.optInt("auto_loop", 1);
        ayVar.rz = jSONObject.optInt("allow_manual_loop", 1);
        ayVar.uq = jSONObject.optInt("unlimited_loop", 0);
        ayVar.ct = jSONObject.optInt("left_margin", 0);
        ayVar.noq = jSONObject.optInt("right_margin", 0);
        ayVar.yo = jSONObject.optInt("ad_margin", 0);
        ayVar.fi = jSONObject.optInt("loop_interval_time", 5000);
        ayVar.gf = jSONObject.optInt("flip_speed", 500);
        ayVar.ra = jSONObject.optInt("stop_auto_loop", 0);
        return ayVar;
    }

    public int ahm() {
        return this.ahm;
    }

    public int ct() {
        return this.ct;
    }

    public int fi() {
        return this.fi;
    }

    public int gf() {
        return this.gf;
    }

    public int noq() {
        return this.noq;
    }

    public int ra() {
        return this.ra;
    }

    public int rz() {
        return this.rz;
    }

    public int uq() {
        return this.uq;
    }

    public int yo() {
        return this.yo;
    }

    public String kgy() {
        return this.kgy;
    }
}
