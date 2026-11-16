package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k31 extends d03 {
    public final d03 a;
    public d03 b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((u21) this.a.next()).iterator();
        }
        return this.b.next();
    }

    public k31(e31 e31Var) {
        e31Var.getClass();
        this.a = ((d31) d42.g.values()).listIterator(0);
        this.b = o81.d;
    }
}
