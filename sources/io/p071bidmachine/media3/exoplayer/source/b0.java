package io.p071bidmachine.media3.exoplayer.source;

import io.p071bidmachine.media3.exoplayer.c1;
import io.p071bidmachine.media3.exoplayer.trackselection.q;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface b0 extends d1 {
    void b(a0 a0Var, long j);

    i1 getTrackGroups();

    long i(long j, c1 c1Var);

    void j(long j);

    long k(q[] qVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j);

    void maybeThrowPrepareError();

    long readDiscontinuity();

    long seekToUs(long j);
}
