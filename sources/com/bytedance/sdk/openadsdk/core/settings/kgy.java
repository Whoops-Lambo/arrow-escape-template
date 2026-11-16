package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.gm;
import com.bytedance.sdk.openadsdk.core.xh;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kgy extends ra {
    public kgy() {
        super(new ra.kgy() { // from class: com.bytedance.sdk.openadsdk.core.settings.kgy.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.ra.kgy
            public void ahm() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.ra.kgy
            public void kgy() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ct
    public void kgy(JSONObject jSONObject) {
        ct.kgy kgyVarAhm = ahm();
        if (jSONObject.has("apm_url")) {
            kgyVarAhm.kgy("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    kgyVarAhm.kgy("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "et4Apgaofc6OTcQ=", "SO87kDC5e9GFWPNcmBA=", 63);
            }
        }
        kgyVarAhm.kgy();
        ct();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.ra
    public String kgy() {
        try {
            if (xh.kgy() == null || gm.kgy(xh.kgy())) {
                return "tt_set_apm.prop";
            }
            return "tt_set_apm_" + gm.rz(xh.kgy()) + ".prop";
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "et4Apgaofc6OTcQ=", "XOs5uQy/aMumQ9tYohCtLQ==", 38);
            return "tt_set_apm";
        }
    }
}
