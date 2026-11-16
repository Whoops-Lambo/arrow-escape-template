package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class noq {
    private int yo;
    private String kgy = "";
    private String ahm = "";
    private String rz = "";
    private String uq = "";
    private double ct = -1.0d;
    private int noq = -1;

    public String ahm() {
        return this.ahm;
    }

    public int ct() {
        return this.noq;
    }

    public JSONObject fi() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", ahm());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, noq());
            jSONObject.put("comment_num", ct());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, kgy());
            jSONObject.put("package_name", rz());
            jSONObject.put("score", uq());
            jSONObject.put("app_category", yo());
            return jSONObject;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "ev49vA26Zg==", "T+EHpiySRsWKT9RJ", 101);
            com.bytedance.sdk.component.utils.sx.rz(e.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public void kgy(double d) {
        if (d < 1.0d || d > 5.0d) {
            this.ct = -1.0d;
        } else {
            this.ct = d;
        }
    }

    public int noq() {
        return this.yo;
    }

    public String rz() {
        return this.rz;
    }

    public double uq() {
        return this.ct;
    }

    public String yo() {
        return this.uq;
    }

    public void ahm(String str) {
        this.ahm = str;
    }

    public void rz(String str) {
        this.rz = str;
    }

    public void uq(String str) {
        this.uq = str;
    }

    public void ahm(int i) {
        this.yo = i;
    }

    public void kgy(String str) {
        this.kgy = str;
    }

    public String kgy() {
        return this.kgy;
    }

    public void kgy(int i) {
        if (i <= 0) {
            this.noq = -1;
        } else {
            this.noq = i;
        }
    }
}
