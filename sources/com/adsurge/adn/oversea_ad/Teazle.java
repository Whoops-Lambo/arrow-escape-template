package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Teazle {
    public final int a;
    public final int b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;

    public static Teazle a(int i) {
        return new Teazle(i, 100, -1L, "", -1, -2);
    }

    public final String toString() {
        return this.a + "_" + this.b + "_" + this.c + "_" + this.e + "_" + this.d + "_" + this.f;
    }

    public Teazle(int i, int i2, long j, String str, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        this.e = i3;
        this.f = i4;
    }
}
