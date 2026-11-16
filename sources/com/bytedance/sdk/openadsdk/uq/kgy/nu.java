package com.bytedance.sdk.openadsdk.uq.kgy;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class nu implements com.bytedance.sdk.openadsdk.dg.ahm {
    private final boolean ahm;
    private final com.bytedance.sdk.component.yo.kgy.noq.uq kgy;

    @Override // com.bytedance.sdk.openadsdk.dg.ahm
    @Nullable
    public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
        int i;
        if (this.kgy == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.ahm);
        jSONObject.put("url", this.kgy.ahm());
        int iUq = this.kgy.uq();
        if (iUq <= 0) {
            iUq = 0;
        }
        jSONObject.put("retry_times", iUq);
        jSONObject.put(CreativeInfo.c, this.kgy.noq());
        jSONObject.put("track_type", this.kgy.ct());
        if (!this.ahm) {
            i = 4;
        } else if (this.kgy.ra()) {
            i = 3;
        } else {
            i = this.kgy.uq() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i);
        String strYo = this.kgy.yo();
        if (!TextUtils.isEmpty(strYo)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strYo.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put(t.d, jSONArray);
        }
        String strGf = this.kgy.gf();
        if (!TextUtils.isEmpty(strGf)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strGf.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        jSONObject.put("use_new_upload", this.kgy.at());
        return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("track_link_result").ahm(jSONObject.toString());
    }

    public nu(boolean z, com.bytedance.sdk.component.yo.kgy.noq.uq uqVar) {
        this.kgy = uqVar;
        this.ahm = z;
    }
}
