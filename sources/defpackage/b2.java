package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends t1 implements ListIterator {
    public final /* synthetic */ c2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, int i) {
        super(c2Var, ((List) c2Var.c).listIterator(i));
        this.e = c2Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        c2 c2Var = this.e;
        boolean zIsEmpty = c2Var.isEmpty();
        c().add(obj);
        ((o1) c2Var.g).f++;
        if (zIsEmpty) {
            c2Var.c();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var) {
        super(c2Var);
        this.e = c2Var;
    }
}
