package com.bytedance.sdk.component.adexpress.dynamic.uq;

import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class uq {
    public String ahm;
    public List<kgy> kgy;
    public String rz;
    public String uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public JSONObject ahm;
        public int kgy;
    }

    public static uq kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        uq uqVar = new uq();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    kgy kgyVar = new kgy();
                    kgyVar.kgy = jSONObjectOptJSONObject.optInt("id");
                    kgyVar.ahm = PangleNetworkBridge.jsonObjectInit(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(kgyVar);
                }
            }
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX60nX+sh", "f/cjlA61auOJTNFtgASnIVU=", "S+8/hgaYYMGGettIixiu", 40);
        }
        uqVar.kgy = arrayList;
        uqVar.ahm = jSONObject.optString("diff_data");
        uqVar.rz = jSONObject.optString("style_diff");
        uqVar.uq = jSONObject.optString("tag_diff");
        return uqVar;
    }
}
