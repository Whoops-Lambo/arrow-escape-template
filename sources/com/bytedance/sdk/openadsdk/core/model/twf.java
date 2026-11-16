package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import com.singular.sdk.internal.Constants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class twf {
    private String ahm;
    private String kgy;
    private int rz;

    public String ahm() {
        return this.ahm;
    }

    public String kgy() {
        return this.kgy;
    }

    public int rz() {
        return this.rz;
    }

    @Nullable
    public JSONObject uq() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, this.kgy);
            jSONObject.put("ft", this.rz);
            jSONObject.put("fu", this.ahm);
            return jSONObject;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "f+sohS+1Z8w=", "T+EHpiyS", 47);
            return null;
        }
    }

    public void ahm(String str) {
        this.ahm = str;
    }

    public void kgy(String str) {
        this.kgy = str;
    }

    public void kgy(int i) {
        this.rz = i;
    }
}
