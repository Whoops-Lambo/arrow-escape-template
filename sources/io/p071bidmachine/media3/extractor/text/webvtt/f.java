package io.p071bidmachine.media3.extractor.text.webvtt;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements Comparable {
    public final int a;
    public final b b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((f) obj).a);
    }

    public f(int i, b bVar) {
        this.a = i;
        this.b = bVar;
    }
}
