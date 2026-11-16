package com.adsurge.adn.oversea_ad;

import java.net.URL;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Lichee {
    public final URL a;
    public final HashMap b;
    public int c;
    public int d;
    public final boolean e;

    public Lichee(String str) {
        HashMap map = new HashMap();
        this.b = map;
        this.c = 10000;
        this.d = 10000;
        this.e = true;
        this.a = new URL(str);
        map.put("Content-Type", "application/json; charset=utf-8");
    }
}
