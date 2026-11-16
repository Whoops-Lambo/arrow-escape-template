package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mq4 extends t1 implements ListIterator {
    public final /* synthetic */ c2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq4(c2 c2Var, int i) {
        super(c2Var, ((List) c2Var.c).listIterator(i), (byte) 0);
        this.e = c2Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        c2 c2Var = this.e;
        boolean zIsEmpty = c2Var.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        ((as4) c2Var.g).e++;
        if (zIsEmpty) {
            c2Var.h();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq4(c2 c2Var) {
        super(c2Var, (byte) 0);
        this.e = c2Var;
    }
}
