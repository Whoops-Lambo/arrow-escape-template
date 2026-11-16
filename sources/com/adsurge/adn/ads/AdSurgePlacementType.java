package com.adsurge.adn.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum AdSurgePlacementType {
    UNKNOWN(0),
    REWARDED_VIDEO(1),
    INTERSTITIAL(2),
    BANNER(3),
    NATIVE(4),
    APP_OPEN(5);

    public final int a;

    public int getValue() {
        return this.a;
    }

    AdSurgePlacementType(int i) {
        this.a = i;
    }
}
