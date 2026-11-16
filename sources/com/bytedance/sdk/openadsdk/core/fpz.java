package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.ironsource.R6;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class fpz {
    private static final AtomicInteger ahm;
    private static final AtomicInteger kgy;
    private static final AtomicInteger rz;
    private static final AtomicInteger uq;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        kgy = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        ahm = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        rz = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        uq = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    public static synchronized void ahm(boolean z) {
        try {
            if (z) {
                com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(kgy.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(ahm.incrementAndGet()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void kgy() {
        try {
            long jKgy = com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("encrypt_statistics_file", "upload_time_key", 0L);
            if (jKgy <= 0 || System.currentTimeMillis() - jKgy < 86400000) {
                if (jKgy > 0 && jKgy <= System.currentTimeMillis()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            ahm();
            synchronized (fpz.class) {
                kgy.set(0);
                ahm.set(0);
                rz.set(0);
                uq.set(0);
                com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "a+khsA2/e96QXuRJjQWpO0/nLoYruWXXhVg=", "Ses9mhGo", 63);
        }
    }

    private static void ahm() {
        final int i = kgy.get();
        final int i2 = ahm.get();
        final int i3 = rz.get();
        final int i4 = uq.get();
        com.bytedance.sdk.openadsdk.dg.uq.kgy("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.dg.ahm() { // from class: com.bytedance.sdk.openadsdk.core.fpz.1
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            @Nullable
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i);
                    jSONObject.put("encrypt_fail_count", i2);
                    jSONObject.put("decrypt_success_count", i3);
                    jSONObject.put("decrypt_fail_count", i4);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "a+khsA2/e96QXuRJjQWpO0/nLoYruWXXhViTDA==", "XOs5uQy7WtOBXsQ=", 84);
                }
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("crypt_v4_statistics").ahm(jSONObject.toString());
            }
        });
    }

    public static void kgy(final int i, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i2) {
        com.bytedance.sdk.openadsdk.dg.uq.kgy("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.dg.ahm() { // from class: com.bytedance.sdk.openadsdk.core.fpz.2
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            @Nullable
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i2);
                    if (i2 == 6) {
                        jSONObject.put(R6.B, Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0=", "a+khsA2/e96QXuRJjQWpO0/nLoYruWXXhViTDw==", "XOs5uQy7WtOBXsQ=", 108);
                }
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("crypt_v4_fail").ahm(jSONObject.toString());
            }
        });
    }

    public static synchronized void kgy(boolean z) {
        try {
            if (z) {
                com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(rz.incrementAndGet()));
            } else {
                com.bytedance.sdk.openadsdk.fpp.uq.kgy.kgy("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(rz.incrementAndGet()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void kgy(JSONObject jSONObject) {
        ahm(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}
