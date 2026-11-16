package io.p071bidmachine.media3.exoplayer.source;

import io.p071bidmachine.media3.extractor.s;
import io.p071bidmachine.media3.extractor.z;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class o0 extends s {
    public final /* synthetic */ s0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(s0 s0Var, z zVar) {
        super(zVar);
        this.b = s0Var;
    }

    @Override // io.p071bidmachine.media3.extractor.s, io.p071bidmachine.media3.extractor.z
    public final long getDurationUs() {
        return this.b.B;
    }
}
