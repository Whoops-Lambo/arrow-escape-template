package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ll4 implements Comparable {
    public final Runnable a;
    public final long b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.b, ((ll4) obj).b);
    }

    public ll4(long j, Runnable runnable) {
        this.a = runnable;
        this.b = j;
    }
}
