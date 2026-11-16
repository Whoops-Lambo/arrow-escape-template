package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm {
    private String ahm;
    private String ct;
    private String kgy;
    private String noq;
    private String rz;
    private String uq;
    private boolean yo;

    public String ahm() {
        return this.ahm;
    }

    public String ct() {
        return this.noq;
    }

    public JSONObject fi() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PRIVACY_URL, this.rz);
            jSONObject.put("iab_privacy_url", this.uq);
            jSONObject.put("privacy_title", this.ct);
            jSONObject.put("text", this.ahm);
            jSONObject.put("icon", this.kgy);
            return jSONObject;
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "euoBlAG5ZQ==", "T+EHhgyyRsWK", 82);
            return jSONObject;
        }
    }

    public void kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.kgy = jSONObject.optString("icon");
        this.ahm = jSONObject.optString("text");
        this.rz = jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL);
        this.uq = jSONObject.optString("iab_privacy_url");
        this.ct = jSONObject.optString("privacy_title");
        this.noq = jSONObject.optString("iab_privacy_bar_text");
    }

    public String noq() {
        return this.ct;
    }

    public String rz() {
        return this.rz;
    }

    public String uq() {
        return TextUtils.isEmpty(this.uq) ? this.rz : this.uq;
    }

    public boolean yo() {
        return this.yo;
    }

    public String kgy() {
        return this.kgy;
    }

    public void kgy(boolean z) {
        this.yo = z;
    }
}
