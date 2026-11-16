package io.p071bidmachine.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements z {
    @Override // io.p071bidmachine.media3.extractor.z
    public final boolean isSeekable() {
        return true;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final y getSeekPoints(long j) {
        a0 a0Var = new a0(j, 0L);
        return new y(a0Var, a0Var);
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final long getDurationUs() {
        return -9223372036854775807L;
    }
}
