package io.p071bidmachine.media3.exoplayer.source.chunk;

import io.p071bidmachine.media3.common.n;
import io.p071bidmachine.media3.datasource.h;
import io.p071bidmachine.media3.datasource.k;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j extends e {
    public final long j;

    public j(h hVar, k kVar, n nVar, int i, Object obj, long j, long j2, long j3) {
        super(hVar, kVar, 1, nVar, i, obj, j, j2);
        nVar.getClass();
        this.j = j3;
    }

    public abstract boolean b();

    public long a() {
        long j = this.j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }
}
