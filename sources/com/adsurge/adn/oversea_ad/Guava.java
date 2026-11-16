package com.adsurge.adn.oversea_ad;

import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class Guava {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final int e;

    public final String toString() {
        String str = String.format("% 6d", Integer.valueOf(this.a));
        String str2 = String.format("% 6d", Integer.valueOf(this.b));
        String str3 = String.format("% 6d", Integer.valueOf(this.c));
        StringBuilder sbR = pv1.r("", str, "    ", str2, "    ");
        sbR.append(str3);
        sbR.append("    ");
        sbR.append(this.d);
        return sbR.toString();
    }

    public Guava(int i, int i2, String str, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.d = str;
        this.c = i3;
        this.e = i4;
    }
}
