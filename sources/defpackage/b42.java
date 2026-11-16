package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class b42 extends q31 {
    public final transient i31 d;
    public final transient c42 e;

    @Override // defpackage.u21
    public final boolean o() {
        return true;
    }

    @Override // defpackage.u21, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // defpackage.q31, defpackage.u21
    public final d31 d() {
        return this.e;
    }

    @Override // defpackage.u21
    public final int h(int i, Object[] objArr) {
        return this.e.h(i, objArr);
    }

    @Override // defpackage.u21
    /* JADX INFO: renamed from: r */
    public final d03 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((d42) this.d).f;
    }

    public b42(i31 i31Var, c42 c42Var) {
        this.d = i31Var;
        this.e = c42Var;
    }

    @Override // defpackage.q31, defpackage.u21
    public Object writeReplace() {
        return super.writeReplace();
    }
}
