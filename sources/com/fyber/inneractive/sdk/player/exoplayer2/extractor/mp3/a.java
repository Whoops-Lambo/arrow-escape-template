package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements b {
    public final long a;
    public final int b;
    public final long c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j) {
        long j2 = this.c;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        int i = z.a;
        long jMax = Math.max(0L, Math.min(j, j2));
        return ((jMax * ((long) this.b)) / 8000000) + this.a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j) {
        return (Math.max(0L, j - this.a) * 8000000) / ((long) this.b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.c;
    }

    public a(int i, long j, long j2) {
        long jB;
        this.a = j;
        this.b = i;
        if (j2 == -1) {
            jB = -9223372036854775807L;
        } else {
            jB = b(j2);
        }
        this.c = jB;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.c != -9223372036854775807L;
    }
}
