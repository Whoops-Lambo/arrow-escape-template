package com.adsurge.adn.O0;

import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class b extends com.adsurge.adn.R0.a {
    public void c(int i) {
        a((byte) (i & 255));
        a((byte) ((i >> 8) & 255));
        a((byte) ((i >> 16) & 255));
        a((byte) ((i >> 24) & 255));
    }

    public void d(int i) {
        a((byte) ((i >> 24) & 255));
        a((byte) ((i >> 16) & 255));
        a((byte) ((i >> 8) & 255));
        a((byte) (i & 255));
    }

    @Override // com.adsurge.adn.R0.a
    public void a(int i) {
        super.a(i);
        this.a.order(ByteOrder.BIG_ENDIAN);
    }
}
