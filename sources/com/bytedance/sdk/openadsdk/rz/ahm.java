package com.bytedance.sdk.openadsdk.rz;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.ay;
import com.bytedance.sdk.openadsdk.core.xh;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm {
    private static volatile ahm kgy;
    private final ay<com.bytedance.sdk.openadsdk.uq.kgy> ahm = xh.rz();

    public static ahm kgy() {
        if (kgy == null) {
            synchronized (ahm.class) {
                try {
                    if (kgy == null) {
                        kgy = new ahm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    private ahm() {
    }

    public void kgy(@NonNull String str, List<FilterWord> list, String str2) {
        kgy(str, list, null, null, str2);
    }

    public void kgy(@NonNull String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.ahm.kgy(str, list, jSONObject, str2, str3);
    }
}
