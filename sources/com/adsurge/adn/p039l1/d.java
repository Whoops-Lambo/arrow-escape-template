package com.adsurge.adn.p039l1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class d extends Exception {
    public final String a;
    public final int b;

    public int a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public d(int i, String str) {
        super(str);
        this.b = i;
        this.a = str;
    }

    public d(int i, String str, Throwable th) {
        super(str, th);
        this.b = i;
        this.a = str;
    }
}
