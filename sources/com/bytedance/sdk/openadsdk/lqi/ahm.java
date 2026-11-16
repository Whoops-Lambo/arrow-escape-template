package com.bytedance.sdk.openadsdk.lqi;

import com.safedk.android.internal.partials.PangleNetworkBridge;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface ahm {
    public static final kgy<JSONObject> kgy = new kgy<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.lqi.ahm.1
        @Override // com.bytedance.sdk.openadsdk.lqi.ahm.kgy
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public JSONObject ahm(String str) {
            try {
                return PangleNetworkBridge.jsonObjectInit(str);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "ct05hwKobMCZeNJNgwKpPFT8NNFS", "WPwolBe5", 18);
                return null;
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy<T> {
        T ahm(String str);
    }
}
