package com.adsurge.adn.M;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    public final int a;
    public final String b;
    public final int c;

    public boolean a() {
        String str;
        return (this.c != 0 || (str = this.b) == null || str.isEmpty()) ? false : true;
    }

    public c(int i, String str) {
        this.a = i;
        this.b = str;
        this.c = 0;
    }

    public c(int i, int i2) {
        this.a = i;
        this.b = null;
        this.c = i2;
    }

    public static c a(int i, int i2) {
        return new c(i, i2);
    }
}
