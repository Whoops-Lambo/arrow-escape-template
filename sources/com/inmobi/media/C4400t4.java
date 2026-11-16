package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.inmobi.media.t4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4400t4 extends C4513x8 {
    public final int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4400t4(AdConfig.ViewabilityConfig viewabilityConfig, Y9 y9) {
        super(viewabilityConfig, (byte) 1, y9);
        T7.k.getClass();
        this.n = 500;
    }

    @Override // com.inmobi.media.C4513x8, com.inmobi.media.AbstractC4060gq
    public final int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.l;
        return viewabilityConfig != null ? viewabilityConfig.getCompanionVisibilityThrottleMillis() : this.n;
    }
}
