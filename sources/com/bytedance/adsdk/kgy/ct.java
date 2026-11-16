package com.bytedance.adsdk.kgy;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ct implements com.bytedance.adsdk.ugeno.uq.kgy {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy implements com.bytedance.adsdk.ugeno.uq.kgy.InterfaceC0197kgy {
        private String ahm;
        private com.bytedance.adsdk.kgy.ahm.kgy kgy;

        @Override // com.bytedance.adsdk.ugeno.uq.kgy.InterfaceC0197kgy
        public Object kgy(JSONObject jSONObject) {
            com.bytedance.adsdk.kgy.ahm.kgy kgyVar = this.kgy;
            if (kgyVar == null) {
                return this.ahm;
            }
            Object objKgy = kgyVar.kgy(jSONObject);
            if (objKgy instanceof String) {
                return objKgy;
            }
            if (objKgy instanceof com.bytedance.adsdk.kgy.ahm.kgy.kgy) {
                return String.valueOf(lqi.kgy((com.bytedance.adsdk.kgy.ahm.kgy.kgy) objKgy));
            }
            if (objKgy == null || !objKgy.getClass().isArray()) {
                return String.valueOf(objKgy);
            }
            try {
                return new JSONArray(objKgy).toString();
            } catch (JSONException unused) {
                return String.valueOf(objKgy);
            }
        }

        private kgy(String str) {
            this.ahm = str;
            this.kgy = com.bytedance.adsdk.kgy.ahm.kgy.kgy(str);
        }

        public static kgy kgy(String str) {
            return new kgy(str);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.uq.kgy
    public com.bytedance.adsdk.ugeno.uq.kgy.InterfaceC0197kgy kgy(String str) {
        return kgy.kgy(str);
    }
}
