package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ct {
    private uq ahm;
    private ArrayList<kgy> kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private final String ahm;
        private final String kgy;
        private com.bytedance.sdk.openadsdk.core.twf.uq rz;
        private Set<com.bytedance.sdk.openadsdk.core.twf.ra> uq;

        public Set<com.bytedance.sdk.openadsdk.core.twf.ra> ahm() {
            return this.uq;
        }

        public com.bytedance.sdk.openadsdk.core.twf.uq kgy() {
            return this.rz;
        }

        public String rz() {
            return this.kgy;
        }

        public String uq() {
            return this.ahm;
        }

        public kgy(JSONObject jSONObject) {
            this.kgy = jSONObject.optString("vast_url");
            this.ahm = jSONObject.optString("vast_content");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoTrackers");
            if (jSONObjectOptJSONObject != null) {
                com.bytedance.sdk.openadsdk.core.twf.uq uqVar = new com.bytedance.sdk.openadsdk.core.twf.uq();
                this.rz = uqVar;
                uqVar.kgy(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("viewabilityVendor");
            if (jSONArrayOptJSONArray != null) {
                this.uq = com.bytedance.sdk.openadsdk.core.twf.ra.kgy(jSONArrayOptJSONArray);
            }
        }

        public void kgy(com.bytedance.sdk.openadsdk.core.twf.uq uqVar) {
            this.rz = uqVar;
        }

        public void kgy(Set<com.bytedance.sdk.openadsdk.core.twf.ra> set) {
            this.uq = set;
        }
    }

    public static boolean kgy(ioy ioyVar) {
        if (ioyVar == null || ioyVar.bmz()) {
            return false;
        }
        int iUju = ioyVar.uju();
        int iRdw = ioyVar.rdw();
        return (iUju == 3 || iUju == 7 || iUju == 8) && (iRdw == 5 || iRdw == 15 || iRdw == 50);
    }

    @Nullable
    public uq ahm() {
        if (this.ahm == null) {
            this.ahm = new uq();
            ArrayList<kgy> arrayList = this.kgy;
            if (arrayList != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    kgy kgyVar = arrayList.get(i);
                    i++;
                    kgy kgyVar2 = kgyVar;
                    com.bytedance.sdk.openadsdk.core.twf.uq uqVarKgy = kgyVar2.kgy();
                    Set<com.bytedance.sdk.openadsdk.core.twf.ra> setAhm = kgyVar2.ahm();
                    if (uqVarKgy != null) {
                        this.ahm.kgy().kgy(uqVarKgy);
                    }
                    if (setAhm != null) {
                        this.ahm.ahm().addAll(setAhm);
                    }
                }
            }
        }
        return this.ahm;
    }

    public boolean rz() {
        ArrayList<kgy> arrayList = this.kgy;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public ct(JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                kgy kgyVar = new kgy(jSONArray.optJSONObject(i));
                if (this.kgy == null) {
                    this.kgy = new ArrayList<>();
                }
                this.kgy.add(kgyVar);
            }
        }
    }

    public ArrayList<kgy> kgy() {
        return this.kgy;
    }
}
