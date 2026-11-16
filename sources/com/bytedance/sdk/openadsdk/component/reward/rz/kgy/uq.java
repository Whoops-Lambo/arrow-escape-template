package com.bytedance.sdk.openadsdk.component.reward.rz.kgy;

import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.gbb;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class uq {
    private boolean ahm = true;
    private float ct;
    private String fi;
    private JSONObject gf;
    private int kgy;
    private float noq;
    private int nu;
    private String ra;
    private String rz;
    private float uq;
    private float yo;

    public static uq ahm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        uq uqVar = new uq();
        uqVar.ahm(jSONObject.optString("url"));
        uqVar.kgy(jSONObject.optInt("materialPosition"));
        uqVar.ahm(jSONObject.optInt("showType"));
        uqVar.kgy(jSONObject.optBoolean("lpClickable", true));
        float fAhm = gbb.ahm(xh.kgy(), (float) jSONObject.optDouble("x"));
        float fAhm2 = gbb.ahm(xh.kgy(), (float) jSONObject.optDouble("y"));
        float fAhm3 = gbb.ahm(xh.kgy(), (float) jSONObject.optDouble("width"));
        float fAhm4 = gbb.ahm(xh.kgy(), (float) jSONObject.optDouble("height"));
        uqVar.kgy(fAhm);
        uqVar.ahm(fAhm2);
        uqVar.rz(fAhm3);
        uqVar.uq(fAhm4);
        uqVar.rz(jSONObject.optString("tag"));
        uqVar.kgy(jSONObject.optString("sessionID"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("materialDict");
        if (jSONObjectOptJSONObject != null) {
            uqVar.kgy(jSONObjectOptJSONObject);
        }
        return uqVar;
    }

    public String ct() {
        return this.rz;
    }

    public float fi() {
        return this.noq;
    }

    public float gf() {
        return this.yo;
    }

    public float noq() {
        return this.uq;
    }

    public String ra() {
        return this.fi;
    }

    public int rz() {
        return this.kgy;
    }

    public boolean uq() {
        return this.ahm;
    }

    public float yo() {
        return this.ct;
    }

    public boolean kgy(float f, float f2) {
        if (f >= noq()) {
            if (f <= fi() + noq() && f2 >= yo()) {
                if (f2 <= gf() + yo()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void rz(float f) {
        this.noq = f;
    }

    public void uq(float f) {
        this.yo = f;
    }

    public void rz(String str) {
        this.fi = str;
    }

    public void kgy(int i) {
        this.nu = i;
    }

    public void kgy(String str) {
        this.ra = str;
    }

    public void kgy(boolean z) {
        this.ahm = z;
    }

    public void kgy(float f) {
        this.uq = f;
    }

    public void kgy(JSONObject jSONObject) {
        this.gf = jSONObject;
    }

    public int kgy() {
        return this.nu;
    }

    public void ahm(int i) {
        this.kgy = i;
    }

    public void ahm(String str) {
        this.rz = str;
    }

    public void ahm(float f) {
        this.ct = f;
    }

    public String ahm() {
        return this.ra;
    }
}
