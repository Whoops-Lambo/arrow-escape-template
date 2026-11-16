package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cb0 implements Iterator, bc1 {
    public final /* synthetic */ int a = 1;
    public final Iterator b;
    public final /* synthetic */ Object c;

    public cb0(db0 db0Var) {
        this.c = db0Var;
        this.b = db0Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((db0) obj).b.invoke(it.next());
            default:
                return ((ar2) obj).b.invoke(it.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public cb0(ar2 ar2Var) {
        this.c = ar2Var;
        this.b = ar2Var.a.iterator();
    }
}
