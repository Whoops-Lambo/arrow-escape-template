package io.p071bidmachine.media3.extractor.text;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class g implements Comparable {
    public final long a;
    public final byte[] b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((g) obj).a);
    }

    public g(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }
}
