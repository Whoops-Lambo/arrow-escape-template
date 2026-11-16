package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class noq {
    public boolean ct;
    public boolean noq;
    public String rz;
    public boolean uq;
    public static final noq kgy = new noq(null);
    public static String ahm = "";

    public noq(String str) {
        this.rz = "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js";
        this.uq = true;
        this.ct = true;
        this.noq = true;
        try {
            JSONObject jSONObjectOptJSONObject = PangleNetworkBridge.jsonObjectInit(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.rz = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
            this.uq = arrayList.contains("load_finish");
            this.noq = arrayList.contains("load_fail");
            this.ct = arrayList.contains("load");
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "cf0Omg26YMCMY9lbgw==", "B+cjnBfi", 35);
        }
    }
}
