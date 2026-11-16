package io.p071bidmachine.media3.exoplayer.dash.manifest;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class o extends n {
    public final List j;

    @Override // io.p071bidmachine.media3.exoplayer.dash.manifest.n
    public final boolean i() {
        return true;
    }

    public o(j jVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(jVar, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.manifest.n
    public final long d(long j) {
        return this.j.size();
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.manifest.n
    public final j h(k kVar, long j) {
        return (j) this.j.get((int) (j - this.d));
    }
}
