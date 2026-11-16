package com.adsurge.adn.E0;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum c {
    UNKNOWN(0, 1, "unknown"),
    WIFI(1, 2, "wifi"),
    NET_2G(2, 4, "2g"),
    NET_3G(3, 8, X3.a),
    NET_4G(4, 16, "4g"),
    NET_5G(5, 32, "5g");

    public final int a;
    public final int b;
    public final String c;

    public int b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public int d() {
        return this.b;
    }

    c(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }
}
