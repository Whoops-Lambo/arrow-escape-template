package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p52 implements ListIterator, bc1 {
    public final ListIterator a;
    public final /* synthetic */ th1 b;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return (this.b.size() - 1) - this.a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.b.size() - 1) - this.a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public p52(th1 th1Var, int i) {
        this.b = th1Var;
        List list = (List) th1Var.b;
        if (i >= 0 && i <= th1Var.size()) {
            this.a = list.listIterator(th1Var.size() - i);
            return;
        }
        StringBuilder sbS = jc1.s(i, "Position index ", " must be in range [");
        sbS.append(new j71(0, th1Var.size(), 1));
        sbS.append("].");
        throw new IndexOutOfBoundsException(sbS.toString());
    }
}
