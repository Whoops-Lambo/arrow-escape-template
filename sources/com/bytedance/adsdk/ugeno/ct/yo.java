package com.bytedance.adsdk.ugeno.ct;

import defpackage.jc1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class yo {
    private List<kgy> ahm;
    private kgy kgy;
    private boolean rz = false;
    private int uq = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private String ahm;
        private Map<String, Object> ct;
        private String kgy;
        private Map<String, Object> noq;
        private String rz = "global";
        private String uq;

        public String ahm() {
            return this.uq;
        }

        public String ct() {
            return this.ahm;
        }

        public String kgy() {
            return this.rz;
        }

        public Map<String, Object> rz() {
            return this.ct;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Action{scheme='");
            sb.append(this.rz);
            sb.append("', name='");
            sb.append(this.uq);
            sb.append("', params=");
            sb.append(this.ct);
            sb.append(", host='");
            sb.append(this.ahm);
            sb.append("', origin='");
            sb.append(this.kgy);
            sb.append("', extra=");
            return jc1.r(sb, this.noq, '}');
        }

        public String uq() {
            return this.kgy;
        }

        public void ahm(String str) {
            this.uq = str;
        }

        public void kgy(String str) {
            this.rz = str;
        }

        public void rz(String str) {
            this.kgy = str;
        }

        public void uq(String str) {
            this.ahm = str;
        }

        public void ahm(Map<String, Object> map) {
            this.noq = map;
        }

        public void kgy(Map<String, Object> map) {
            this.ct = map;
        }
    }

    public static yo kgy(JSONObject jSONObject, JSONObject jSONObject2) {
        kgy kgyVarKgy;
        if (jSONObject == null) {
            return null;
        }
        yo yoVar = new yo();
        Object objOpt = jSONObject.opt("on");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        kgy kgyVarKgy2 = objOpt instanceof String ? twf.kgy((String) objOpt, jSONObject2) : objOpt instanceof JSONObject ? twf.kgy((JSONObject) objOpt, jSONObject2) : null;
        if (kgyVarKgy2 != null) {
            yoVar.kgy = kgyVarKgy2;
        }
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            Object objOpt2 = jSONArrayOptJSONArray.opt(i);
            if (objOpt2 instanceof String) {
                kgy kgyVarKgy3 = twf.kgy((String) objOpt2, jSONObject2);
                if (kgyVarKgy3 != null) {
                    arrayList.add(kgyVarKgy3);
                }
            } else if ((objOpt2 instanceof JSONObject) && (kgyVarKgy = twf.kgy((JSONObject) objOpt2, jSONObject2)) != null) {
                arrayList.add(kgyVarKgy);
            }
        }
        yoVar.ahm = arrayList;
        if (jSONObject.has("delay")) {
            yoVar.uq = com.bytedance.adsdk.ugeno.fi.rz.kgy(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("delay"), jSONObject2), 0);
        }
        if (jSONObject.has("disable")) {
            yoVar.rz = com.bytedance.adsdk.ugeno.fi.rz.kgy(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("disable"), jSONObject2), false);
        }
        return yoVar;
    }

    public List<kgy> ahm() {
        return this.ahm;
    }

    public boolean rz() {
        return this.rz;
    }

    public int uq() {
        return this.uq;
    }

    public kgy kgy() {
        return this.kgy;
    }
}
