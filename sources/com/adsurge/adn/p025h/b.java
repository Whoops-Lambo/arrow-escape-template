package com.adsurge.adn.p025h;

import com.adsurge.adn.N.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class b {
    public final String a;
    public final d b;
    public final long c;
    public final long d;
    public volatile boolean e;

    public d a() {
        return this.b;
    }

    public long b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public long d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public b(String str, d dVar, long j) {
        this(str, dVar, j, d.b().a());
    }

    public void a(boolean z) {
        this.e = z;
    }

    public b(String str, d dVar, long j, long j2) {
        this.a = str;
        this.b = dVar;
        this.c = j2;
        this.d = j;
        this.e = false;
    }
}
