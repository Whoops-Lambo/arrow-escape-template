package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.jg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4819jg {
    protected long a;
    protected long b;
    protected long c;

    public long a() {
        return Math.max(0L, this.a - System.currentTimeMillis());
    }

    public void b(long j) {
        this.c = j;
        this.a = (j - this.b) + this.a;
    }

    public void c(long j) {
        this.b = j;
        this.c = 0L;
    }

    public void b() {
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
    }

    public void a(long j) {
        this.a = System.currentTimeMillis() + j;
    }
}
