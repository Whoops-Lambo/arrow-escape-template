package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class eg1 extends f71 {
    public final long b;
    public final long c;
    public boolean d;
    public long e;

    public eg1(long j, long j2, long j3) {
        super(1);
        this.b = j3;
        this.c = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.d = z;
        this.e = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }

    @Override // defpackage.f71
    public final long nextLong() {
        long j = this.e;
        if (j != this.c) {
            this.e = this.b + j;
            return j;
        }
        if (this.d) {
            this.d = false;
            return j;
        }
        d.v();
        return 0L;
    }
}
