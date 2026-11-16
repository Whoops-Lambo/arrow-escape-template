package com.bytedance.sdk.component.adexpress.dynamic.ct;

import com.bytedance.sdk.component.adexpress.ahm.twf;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class yo implements fi {
    private com.bytedance.sdk.component.adexpress.dynamic.noq.ahm kgy;

    /* JADX INFO: Access modifiers changed from: private */
    public void ahm(twf twfVar) {
        try {
            JSONObject jSONObjectRz = twfVar.rz();
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(jSONObjectRz.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectRz.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.uq.fi fiVarKgy = new noq(jSONObjectJsonObjectInit, jSONObjectOptJSONObject, jSONObjectRz.optJSONObject("AdSize"), PangleNetworkBridge.jsonObjectInit(jSONObjectRz.optString("diff_template_Plugin"))).kgy(twfVar.ahm(), twfVar.ra(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), twfVar);
            try {
                JSONObject jSONObjectJsonObjectInit2 = PangleNetworkBridge.jsonObjectInit(jSONObjectOptJSONObject.optString("dynamic_creative"));
                fiVarKgy.kgy(jSONObjectJsonObjectInit2.optString("color"));
                fiVarKgy.kgy(jSONObjectJsonObjectInit2.optJSONArray("material_center"));
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "f/cjlA61aumBXt5LiSGhOkjrPw==", "S+8/hgaVZ9OFWNlcgA==", 66);
            }
            this.kgy.kgy(fiVarKgy);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "f/cjlA61aumBXt5LiSGhOkjrPw==", "S+8/hgaVZ9OFWNlcgA==", 70);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ct.fi
    public void kgy(final twf twfVar) {
        if (twfVar.at() == 1) {
            ahm(twfVar);
        } else {
            com.bytedance.sdk.component.adexpress.uq.uq.kgy(new com.bytedance.sdk.component.gf.ahm.rz("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.ct.yo.1
                @Override // java.lang.Runnable
                public void run() {
                    yo.this.ahm(twfVar);
                }
            }, 5);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ct.fi
    public void kgy(com.bytedance.sdk.component.adexpress.dynamic.noq.ahm ahmVar) {
        this.kgy = ahmVar;
    }
}
