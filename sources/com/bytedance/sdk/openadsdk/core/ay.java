package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface ay<T> {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm {
        void kgy(int i, String str);

        void kgy(ioy.ahm ahmVar);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        void kgy(int i, String str);

        void kgy(com.bytedance.sdk.openadsdk.core.model.kgy kgyVar, com.bytedance.sdk.openadsdk.core.model.rz rzVar);
    }

    com.bytedance.sdk.openadsdk.uq.ct ahm(JSONObject jSONObject);

    com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgy();

    com.bytedance.sdk.openadsdk.uq.ct kgy(JSONObject jSONObject, String str, List<String> list, boolean z);

    JSONObject kgy(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ft ftVar, int i) throws JSONException;

    JSONObject kgy(JSONObject jSONObject);

    void kgy(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ft ftVar, int i, sx sxVar);

    void kgy(String str);

    void kgy(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3);

    void kgy(JSONObject jSONObject, ahm ahmVar);

    void kgy(JSONObject jSONObject, String str);
}
