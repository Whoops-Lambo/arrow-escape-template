package io.p071bidmachine.media3.extractor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class s implements z {
    public final z a;

    @Override // io.p071bidmachine.media3.extractor.z
    public long getDurationUs() {
        return this.a.getDurationUs();
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public y getSeekPoints(long j) {
        return this.a.getSeekPoints(j);
    }

    @Override // io.p071bidmachine.media3.extractor.z
    public final boolean isSeekable() {
        return this.a.isSeekable();
    }

    public s(z zVar) {
        this.a = zVar;
    }
}
