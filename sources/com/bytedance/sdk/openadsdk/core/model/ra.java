package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class ra {
    private List<String> ahm;
    private String kgy;

    public List<String> ahm() {
        return this.ahm;
    }

    public ra(String str) {
        HashMap<String, Object> mapKgy;
        this.kgy = "";
        this.ahm = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            mapKgy = new HashMap<>();
        } else {
            mapKgy = kgy(str);
        }
        try {
            this.kgy = (String) mapKgy.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) mapKgy.get("auto_test_hosts"));
            this.ahm = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.ahm.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "evs5mje5etOtRdNYgA==", "B+cjnBfi", 45);
            com.bytedance.sdk.component.utils.sx.rz("AutoTestModel", e.getMessage());
        }
    }

    private static final HashMap<String, Object> kgy(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                map.put(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("value"));
            }
            return map;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "evs5mje5etOtRdNYgA==", "Uf0imzezRMaQ", 71);
            return new HashMap<>();
        }
    }

    public String kgy() {
        return this.kgy;
    }
}
