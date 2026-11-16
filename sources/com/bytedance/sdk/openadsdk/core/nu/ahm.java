package com.bytedance.sdk.openadsdk.core.nu;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class ahm {
    private static com.bytedance.sdk.openadsdk.core.nu.kgy kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private static final ahm kgy = new ahm();
    }

    public String ct() {
        com.bytedance.sdk.openadsdk.core.nu.kgy kgyVar = kgy;
        return kgyVar != null ? kgyVar.ct() : "";
    }

    public long noq() {
        com.bytedance.sdk.openadsdk.core.nu.kgy kgyVar = kgy;
        if (kgyVar != null) {
            return kgyVar.noq();
        }
        return 0L;
    }

    public boolean rz() {
        com.bytedance.sdk.openadsdk.core.nu.kgy kgyVar = kgy;
        if (kgyVar == null) {
            return false;
        }
        return kgyVar.ahm();
    }

    public String uq() {
        String strUq;
        com.bytedance.sdk.openadsdk.core.nu.kgy kgyVar = kgy;
        return (kgyVar == null || (strUq = kgyVar.uq()) == null) ? "" : strUq;
    }

    public int yo() {
        com.bytedance.sdk.openadsdk.core.nu.kgy kgyVar = kgy;
        if (kgyVar != null) {
            return kgyVar.yo();
        }
        return 1;
    }

    private ahm() {
        kgy = new com.bytedance.sdk.openadsdk.core.nu.kgy();
    }

    public void ahm(String str) {
        com.bytedance.sdk.openadsdk.core.nu.kgy kgyVar;
        if (!TextUtils.isEmpty(str) && (kgyVar = kgy) != null) {
            kgyVar.ahm(str);
        }
    }

    public void kgy(String str) {
        com.bytedance.sdk.openadsdk.core.nu.kgy kgyVar;
        if (!TextUtils.isEmpty(str) && (kgyVar = kgy) != null) {
            kgyVar.kgy(str);
        }
    }

    public static ahm ahm() {
        return kgy.kgy;
    }

    public void kgy(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.nu.kgy kgyVar = kgy;
        if (kgyVar != null) {
            kgyVar.kgy(map);
        }
    }

    public void kgy() {
        com.bytedance.sdk.openadsdk.core.nu.kgy kgyVar = kgy;
        if (kgyVar != null) {
            kgyVar.rz();
        }
    }

    public void kgy(@NonNull String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.nu.kgy kgyVar = kgy;
        if (kgyVar != null) {
            kgyVar.kgy(str, map);
        }
    }

    public Map<String, String> kgy(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.nu.kgy kgyVar = kgy;
        if (kgyVar != null) {
            return kgyVar.kgy(str, bArr);
        }
        return new HashMap();
    }

    public void kgy(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.nu.kgy kgyVar = kgy;
        if (kgyVar != null) {
            kgyVar.kgy(motionEvent);
        }
    }
}
