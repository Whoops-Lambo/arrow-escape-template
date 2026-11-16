package com.bytedance.sdk.openadsdk.uq.kgy.kgy;

import com.ironsource.C4664b4;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class noq {
    private static int kgy = -1;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public static kgy kgy = new kgy();
        private final HashSet<String> ahm;
        private int rz;

        public boolean kgy(String str) {
            boolean zContains = this.ahm.contains(str);
            int i = this.rz;
            if (i == 0 && zContains) {
                return true;
            }
            return 1 == i && !zContains;
        }

        public kgy(String str) {
            this.ahm = new HashSet<>();
            this.rz = 0;
            try {
                JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
                this.rz = jSONObjectJsonObjectInit.optInt(C4664b4.a.t, this.rz);
                JSONArray jSONArrayOptJSONArray = jSONObjectJsonObjectInit.optJSONArray("types");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        this.ahm.add(jSONArrayOptJSONArray.optString(i));
                    }
                }
            } catch (Exception unused) {
            }
        }

        public kgy() {
            this.ahm = new HashSet<>();
            this.rz = 0;
        }
    }

    public static boolean kgy(String str) {
        kgy kgyVar;
        if (str == null || (kgyVar = (kgy) com.bytedance.sdk.openadsdk.lqi.ct.kgy("stats_new_log", kgy.kgy, new com.bytedance.sdk.openadsdk.lqi.ahm.kgy<kgy>() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.noq.1
            @Override // com.bytedance.sdk.openadsdk.lqi.ahm.kgy
            /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
            public kgy ahm(String str2) {
                return new kgy(str2);
            }
        })) == null) {
            return false;
        }
        return kgyVar.kgy(str);
    }

    public static boolean ahm() {
        if (kgy() == 3) {
            return true;
        }
        return false;
    }

    public static int kgy() {
        if (kgy == -1) {
            kgy = com.bytedance.sdk.openadsdk.lqi.ct.kgy("send_log_type", 2);
        }
        return kgy;
    }
}
