package com.bytedance.sdk.openadsdk.at.kgy;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class vs extends com.bytedance.sdk.component.kgy.uq<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.ra.fi> kgy;

    @Override // com.bytedance.sdk.component.kgy.uq
    public JSONObject kgy(String str, JSONObject jSONObject, com.bytedance.sdk.component.kgy.ct ctVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.ra.fi fiVar = this.kgy.get();
            if (fiVar == null) {
                jSONObject2.put("success", false);
                return jSONObject2;
            }
            fiVar.setIsPreventTouchEvent(zOptBoolean);
            jSONObject2.put("success", true);
            return jSONObject2;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4YCojpS6iqQUfJkwpRC2Fk=", "a/wogwayffOPX9RVqQelJk/DKIELs20=", "UuA7mgi5", 40);
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }

    public vs(com.bytedance.sdk.component.ra.fi fiVar) {
        this.kgy = new WeakReference<>(fiVar);
    }

    public static void kgy(com.bytedance.sdk.component.kgy.vs vsVar, com.bytedance.sdk.component.ra.fi fiVar) {
        vsVar.kgy("preventTouchEvent", new vs(fiVar));
    }
}
