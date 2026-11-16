package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class q81 extends d03 {
    public final Object a;
    public boolean b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            d.v();
            return null;
        }
        this.b = true;
        return this.a;
    }

    public q81(Object obj) {
        this.a = obj;
    }
}
