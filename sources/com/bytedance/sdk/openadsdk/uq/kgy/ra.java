package com.bytedance.sdk.openadsdk.uq.kgy;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ra implements com.bytedance.sdk.openadsdk.dg.ahm.ahm {
    private final com.bytedance.sdk.component.yo.kgy.noq.uq ahm;
    private final boolean kgy;

    @Override // com.bytedance.sdk.openadsdk.dg.ahm.ahm
    public JSONObject ahm() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.dg.ahm.ahm
    public JSONObject rz() {
        return null;
    }

    public static boolean uq() {
        return com.bytedance.sdk.openadsdk.lqi.ct.kgy("c2s_applog", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.dg.ahm.ahm
    public JSONObject kgy() {
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", this.kgy);
            jSONObject.put("url", this.ahm.ahm());
            int iUq = this.ahm.uq();
            if (iUq <= 0) {
                iUq = 0;
            }
            jSONObject.put("retry_times", iUq);
            jSONObject.put(CreativeInfo.c, this.ahm.noq());
            jSONObject.put("track_type", this.ahm.ct());
            if (!this.kgy) {
                i = 4;
            } else if (this.ahm.ra()) {
                i = 3;
            } else {
                i = this.ahm.uq() <= 0 ? 1 : 2;
            }
            jSONObject.put("upload_scene", i);
            String strYo = this.ahm.yo();
            if (!TextUtils.isEmpty(strYo)) {
                JSONArray jSONArray = new JSONArray();
                for (String str : strYo.split(",")) {
                    jSONArray.put(str);
                }
                jSONObject.put(t.d, jSONArray);
            }
            String strGf = this.ahm.gf();
            if (!TextUtils.isEmpty(strGf)) {
                JSONArray jSONArray2 = new JSONArray();
                for (String str2 : strGf.split(",")) {
                    jSONArray2.put(str2);
                }
                jSONObject.put("error_msg", jSONArray2);
            }
            jSONObject.put("use_new_upload", this.ahm.at());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public ra(boolean z, com.bytedance.sdk.component.yo.kgy.noq.uq uqVar) {
        this.kgy = z;
        this.ahm = uqVar;
    }
}
