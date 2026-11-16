package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n31 extends u21 {
    public final transient e31 b;

    @Override // defpackage.u21, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.b.a(obj);
    }

    @Override // defpackage.u21
    public final int h(int i, Object[] objArr) {
        this.b.getClass();
        z21 z21VarListIterator = ((d31) d42.g.values()).listIterator(0);
        while (z21VarListIterator.hasNext()) {
            i = ((u21) z21VarListIterator.next()).h(i, objArr);
        }
        return i;
    }

    @Override // defpackage.u21
    /* JADX INFO: renamed from: r */
    public final d03 iterator() {
        e31 e31Var = this.b;
        e31Var.getClass();
        return new k31(e31Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        this.b.getClass();
        return 0;
    }

    public n31(e31 e31Var) {
        this.b = e31Var;
    }

    @Override // defpackage.u21
    public Object writeReplace() {
        return super.writeReplace();
    }
}
