package com.bytedance.sdk.openadsdk.dg.kgy;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ct {
    public static void ahm(final String str, final String str2, final int i, final String str3, final String str4, final List<String> list) {
        com.bytedance.sdk.openadsdk.dg.uq.kgy(str, false, new com.bytedance.sdk.openadsdk.dg.ahm() { // from class: com.bytedance.sdk.openadsdk.dg.kgy.ct.2
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                String str5 = str2;
                String string = "";
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject.put("url", str5);
                String str6 = str4;
                if (str6 == null) {
                    str6 = "";
                }
                jSONObject.put("web_sence", str6);
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    string = new JSONArray((Collection) list).toString();
                }
                jSONObject.put("back_up_url", string);
                jSONObject.put(t.d, i);
                jSONObject.put("error_msg", str3);
                return uq.ahm().kgy(str).ahm(jSONObject.toString());
            }
        });
    }

    public static void kgy(final String str, final String str2, final int i, final String str3, final String str4, final List<String> list) {
        com.bytedance.sdk.openadsdk.dg.uq.kgy(str, false, new com.bytedance.sdk.openadsdk.dg.ahm() { // from class: com.bytedance.sdk.openadsdk.dg.kgy.ct.1
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("error_url", str4);
                }
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    jSONObject.put("back_up_url", list.toString());
                }
                jSONObject.put(t.d, i);
                jSONObject.put("error_msg", str3);
                return uq.ahm().kgy(str).ahm(jSONObject.toString());
            }
        });
    }
}
