package com.adsurge.adn.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum AdSurgeLossReason {
    UNKNOWN(0),
    OVER_TIME(2),
    INVALID_BIDDING(3),
    NO_PRICE(4),
    LOSS_TO_OTHER_BIDDER(102);

    public final int a;

    public int getValue() {
        return this.a;
    }

    AdSurgeLossReason(int i) {
        this.a = i;
    }
}
