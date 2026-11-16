package io.p071bidmachine.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements z {
    public final f a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    @Override // io.p071bidmachine.media3.extractor.z
    public final boolean isSeekable() {
        return true;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final long getDurationUs() {
        return this.b;
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final y getSeekPoints(long j) {
        a0 a0Var = new a0(j, e.a(this.a.timeUsToTargetTime(j), 0L, this.c, this.d, this.e, this.f));
        return new y(a0Var, a0Var);
    }

    public d(f fVar, long j, long j2, long j3, long j4, long j5) {
        this.a = fVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }
}
