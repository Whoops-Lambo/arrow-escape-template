package com.adsurge.adn.p042m1;

import com.adsurge.adn.p039l1.f;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class i implements c {
    public final long a;
    public volatile long b;
    public f c;

    @Override // com.adsurge.adn.p042m1.c
    public void a(long j) {
        this.b = j;
        f fVar = this.c;
        if (fVar != null) {
            fVar.a(a(), b());
        }
    }

    public long b() {
        return this.a;
    }

    public i(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // com.adsurge.adn.p042m1.d
    public void a(f fVar) {
        this.c = fVar;
    }

    @Override // com.adsurge.adn.p042m1.d
    public long a() {
        return this.b;
    }
}
