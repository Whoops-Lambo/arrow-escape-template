package io.p071bidmachine.media3.extractor.ts;

import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.extractor.o;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface h {
    void c(q qVar);

    void d(o oVar, f0 f0Var);

    void packetFinished(boolean z);

    void packetStarted(long j, int i);

    void seek();
}
