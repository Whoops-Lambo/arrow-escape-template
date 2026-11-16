package io.p071bidmachine.media3.exoplayer.hls;

import io.p071bidmachine.media3.exoplayer.hls.playlist.i;
import io.p071bidmachine.media3.exoplayer.source.chunk.b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class f extends b {
    public final List d;
    public final long e;

    public f(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.chunk.k
    public final long getChunkEndTimeUs() {
        a();
        i iVar = (i) this.d.get((int) this.c);
        return this.e + iVar.e + iVar.c;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.chunk.k
    public final long getChunkStartTimeUs() {
        a();
        return this.e + ((i) this.d.get((int) this.c)).e;
    }
}
