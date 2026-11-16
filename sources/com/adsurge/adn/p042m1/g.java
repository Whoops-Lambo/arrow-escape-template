package com.adsurge.adn.p042m1;

import com.adsurge.adn.p039l1.f;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class g implements d, f {
    public final long a;
    public final int b;
    public final c[] c;
    public f d;

    @Override // com.adsurge.adn.p042m1.d
    public long a() {
        long jA = 0;
        for (c cVar : this.c) {
            jA += cVar.a();
        }
        return jA;
    }

    public long b() {
        return this.a;
    }

    public g(long j, long[] jArr, long[] jArr2) {
        this.a = j;
        int length = jArr.length;
        this.b = length;
        this.c = new c[length];
        for (int i = 0; i < this.b; i++) {
            this.c[i] = new i(jArr[i], jArr2[i]);
            this.c[i].a(this);
        }
    }

    public c a(int i) {
        if (i < 0 || i >= this.b) {
            return null;
        }
        return this.c[i];
    }

    @Override // com.adsurge.adn.p039l1.f
    public void a(long j, long j2) {
        f fVar = this.d;
        if (fVar != null) {
            fVar.a(a(), b());
        }
    }

    @Override // com.adsurge.adn.p042m1.d
    public void a(f fVar) {
        this.d = fVar;
    }
}
