package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Phoenix {
    public final int a;
    public final byte[] b;

    public Phoenix(int i, byte[] bArr) {
        if (i != 0 && (i > -1000 || i < -9999)) {
            i = -9999;
        }
        this.a = i;
        this.b = bArr;
    }
}
