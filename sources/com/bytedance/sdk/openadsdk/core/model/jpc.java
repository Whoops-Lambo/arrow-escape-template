package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class jpc {
    private int ahm;
    private int kgy;
    private int rz;
    private String uq = "Next Ad";

    public static jpc kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        jpc jpcVar = new jpc();
        try {
            int iMax = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int iOptInt = jSONObject.optInt("is_allow_pause", 0);
            int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_KEY_LANDING_TYPE, 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            jpcVar.rz(iMax);
            jpcVar.ahm(iOptInt);
            jpcVar.kgy(strOptString);
            jpcVar.kgy(iOptInt2);
            return jpcVar;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "dvshgQqdbfSDT9lY", "WPwolBe5RNKMXt58iCKjLVXr", 75);
            return jpcVar;
        }
    }

    public int ahm() {
        return this.ahm;
    }

    public String rz() {
        return this.uq;
    }

    public int uq() {
        return this.kgy;
    }

    public void ahm(int i) {
        this.ahm = i;
    }

    public void rz(int i) {
        this.kgy = i;
    }

    public void kgy(int i) {
        this.rz = i;
    }

    public void kgy(String str) {
        this.uq = str;
    }

    public int kgy() {
        return this.rz;
    }
}
