package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.sx;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface ct {
    public static final ahm<JSONObject> kgy = new ahm<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.ct.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.ct.ahm
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public JSONObject ahm(String str) {
            try {
                return PangleNetworkBridge.jsonObjectInit(str);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "ct0ogRe1Z8CTbtZJjSOlOFT9JIEMrnCD0Q==", "WPwolBe5", 18);
                sx.kgy("ISettingsDataRepository", "", e);
                return null;
            }
        }
    };
    public static final ahm<Set<String>> ahm = new ahm<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.ct.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.ct.ahm
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public Set<String> ahm(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
                return hashSet;
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "ct0ogRe1Z8CTbtZJjSOlOFT9JIEMrnCD0g==", "WPwolBe5", 34);
                sx.kgy("ISettingsDataRepository", "", e);
                return hashSet;
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm<T> {
        T ahm(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        kgy kgy(String str);

        kgy kgy(String str, float f);

        kgy kgy(String str, int i);

        kgy kgy(String str, long j);

        kgy kgy(String str, String str2);

        kgy kgy(String str, boolean z);

        void kgy();
    }

    void kgy(JSONObject jSONObject);
}
