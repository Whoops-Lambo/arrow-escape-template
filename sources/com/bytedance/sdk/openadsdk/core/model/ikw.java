package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ikw {
    private String ahm;
    private JSONObject ct;
    private String kgy;
    private kgy noq;
    private String rz;
    private String uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private JSONArray ahm;
        private JSONArray kgy;
        private JSONArray rz;

        public static kgy kgy(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            kgy kgyVar = new kgy();
            kgyVar.kgy(jSONArrayOptJSONArray);
            kgyVar.ahm(jSONObject.optJSONArray("fetch"));
            kgyVar.rz(jSONObject.optJSONArray("script"));
            return kgyVar;
        }

        public JSONArray ahm() {
            return this.ahm;
        }

        public JSONArray rz() {
            return this.rz;
        }

        public void ahm(JSONArray jSONArray) {
            this.ahm = jSONArray;
        }

        public void rz(JSONArray jSONArray) {
            this.rz = jSONArray;
        }

        public void kgy(JSONArray jSONArray) {
            this.kgy = jSONArray;
        }

        public JSONArray kgy() {
            return this.kgy;
        }
    }

    public static ikw kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ikw ikwVar = new ikw();
        ikwVar.kgy = jSONObject.optString("id");
        ikwVar.uq = jSONObject.optString("data");
        ikwVar.rz = jSONObject.optString("url");
        ikwVar.ahm = jSONObject.optString("md5");
        ikwVar.ct = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            ikwVar.noq = kgy.kgy(jSONObjectOptJSONObject);
        }
        return ikwVar;
    }

    public String ahm() {
        return this.ahm;
    }

    public JSONObject ct() {
        return this.ct;
    }

    public kgy noq() {
        return this.noq;
    }

    public String rz() {
        return this.rz;
    }

    public String uq() {
        return this.uq;
    }

    public String kgy() {
        return this.kgy;
    }
}
