package com.bytedance.sdk.component.kgy;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class twf {
    private final Map<String, Object> kgy = new ConcurrentHashMap();

    public String ahm() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.kgy.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VqjtZ", "ce87lFGWeuqTTQ==", "T+EHhgyyWtOSQ9la", 37);
            return "";
        }
    }

    private twf() {
    }

    public twf kgy(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.kgy.put(str, obj);
        }
        return this;
    }

    public static twf kgy() {
        return new twf();
    }
}
