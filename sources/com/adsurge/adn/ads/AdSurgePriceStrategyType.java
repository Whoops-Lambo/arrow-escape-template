package com.adsurge.adn.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum AdSurgePriceStrategyType {
    UNKNOWN(0),
    NO_BID_FLOOR(1),
    BID_FLOOR(2),
    BIDDING(3);

    public final int a;

    public int getValue() {
        return this.a;
    }

    AdSurgePriceStrategyType(int i) {
        this.a = i;
    }
}
