package com.bytedance.sdk.openadsdk.utils;

import com.inmobi.media.core.config.models.AdConfig;
import java.security.SecureRandom;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ft {
    private static final ThreadLocal<SecureRandom> kgy = new ThreadLocal<>();

    public static String kgy() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = kgy;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return new UUID(j2, j).toString();
    }
}
