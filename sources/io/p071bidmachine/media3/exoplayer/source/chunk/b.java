package io.p071bidmachine.media3.exoplayer.source.chunk;

import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b implements k {
    public final long a;
    public final long b;
    public long c;

    public final void a() {
        long j = this.c;
        if (j < this.a || j > this.b) {
            d.v();
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.chunk.k
    public final boolean next() {
        long j = this.c + 1;
        this.c = j;
        return !(j > this.b);
    }

    public b(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }
}
