package com.adsurge.adn.Y0;

import defpackage.nj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class p implements o {
    public int a;
    public long b;
    public String c;

    @Override // com.adsurge.adn.Y0.o
    public int a() {
        return this.a;
    }

    @Override // com.adsurge.adn.Y0.o
    public long b() {
        return this.b;
    }

    @Override // com.adsurge.adn.Y0.o
    public String c() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("{id=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", content='");
        return nj.q(sb, this.c, "'}");
    }

    public p(int i, String str) {
        this.a = i;
        this.c = str;
        this.b = -1L;
    }

    public p(String str, long j) {
        this.a = -1;
        this.b = j;
        this.c = str;
    }
}
