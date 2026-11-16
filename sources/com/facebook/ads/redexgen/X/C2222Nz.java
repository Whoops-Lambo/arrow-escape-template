package com.facebook.ads.redexgen.X;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2222Nz extends AbstractC2473Yo {
    public C2222Nz(C2189Ms c2189Ms, long j, long j2) {
        super(new QK(), new O0(c2189Ms), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    public static int A00(byte[] bArr, int i) {
        return ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }
}
