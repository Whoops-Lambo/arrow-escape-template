package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.inmobi.media.x8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4513x8 extends Ph {
    public final int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4513x8(AdConfig.ViewabilityConfig viewabilityConfig, byte b, Y9 y9) {
        super(viewabilityConfig, b, y9);
        T7.k.getClass();
        this.m = 1000;
    }

    @Override // com.inmobi.media.AbstractC4060gq
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.l;
        return viewabilityConfig != null ? viewabilityConfig.getWebVisibilityThrottleMillis() : this.m;
    }
}
