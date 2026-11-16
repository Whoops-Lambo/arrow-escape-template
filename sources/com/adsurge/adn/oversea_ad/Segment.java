package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Segment {
    public final byte[] a;
    public final String b;
    public final String c;
    public final int d;

    public final String toString() {
        return "symmetricAlgorithm : 1 randomKey : " + this.b + " sessionId : " + this.c + " expireTime : " + this.d;
    }

    public Segment(byte[] bArr, String str, String str2, int i) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
        this.d = i;
    }
}
