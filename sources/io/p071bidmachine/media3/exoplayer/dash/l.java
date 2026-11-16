package io.p071bidmachine.media3.exoplayer.dash;

import io.p071bidmachine.media3.exoplayer.source.chunk.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class l extends b {
    public final k d;

    public l(k kVar, long j, long j2) {
        super(j, j2);
        this.d = kVar;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.chunk.k
    public final long getChunkEndTimeUs() {
        a();
        return this.d.e(this.c);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.chunk.k
    public final long getChunkStartTimeUs() {
        a();
        return this.d.f(this.c);
    }
}
