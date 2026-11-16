package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ct {
    private static long ahm;
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.ioy> kgy;
    private static boolean rz;

    private static void ahm(final long j) {
        com.bytedance.sdk.openadsdk.core.model.ioy ioyVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.ioy> weakReference = kgy;
        if (weakReference == null || j <= 0 || (ioyVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.uq.rz.kgy(System.currentTimeMillis(), ioyVar, ioyVar.ct(), "store_duration", new com.bytedance.sdk.openadsdk.dg.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.utils.ct.1
            @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
            public JSONObject ahm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                    return jSONObject;
                } catch (JSONException e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "ev49pheze8KvWtJTrhSoKU3nIoc3rmjEi0/FGd0=", "XOs5sBuoQ9SPRA==", 64);
                    return jSONObject;
                }
            }
        });
        kgy = null;
        rz = false;
    }

    public static void kgy() {
        if (kgy == null || rz) {
            return;
        }
        if (ahm > 0) {
            ahm(SystemClock.elapsedRealtime() - ahm);
        }
        kgy = null;
        ahm = 0L;
    }

    public static boolean rz() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.ioy> weakReference = kgy;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        rz = true;
        return true;
    }

    public static void kgy(long j) {
        ahm(j);
    }

    public static void kgy(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        com.bytedance.sdk.openadsdk.core.model.noq noqVarYv = ioyVar.yv();
        if (noqVarYv == null || TextUtils.isEmpty(noqVarYv.kgy())) {
            return;
        }
        kgy = new WeakReference<>(ioyVar);
    }

    public static void ahm() {
        if (kgy == null || rz) {
            return;
        }
        ahm = SystemClock.elapsedRealtime();
    }
}
