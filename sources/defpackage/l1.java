package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends k1 implements ListIterator {
    public final /* synthetic */ n1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(n1 n1Var, int i) {
        super(n1Var, 0);
        this.d = n1Var;
        j1 j1Var = n1.Companion;
        int size = n1Var.size();
        j1Var.getClass();
        j1.c(i, size);
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return this.d.get(i);
        }
        d.v();
        return null;
    }
}
