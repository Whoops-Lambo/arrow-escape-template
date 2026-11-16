package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class en0 implements Iterator, bc1 {
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object d;
    public final /* synthetic */ l92 e;

    public en0(tt0 tt0Var) {
        this.a = 2;
        this.e = tt0Var;
        this.b = ((l92) tt0Var.b).iterator();
        this.c = -1;
    }

    public void a() {
        Object next;
        fn0 fn0Var = (fn0) this.e;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) fn0Var.c.invoke(next)).booleanValue() != fn0Var.b);
        this.d = next;
        this.c = 1;
    }

    public void b() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((wr0) ((tt0) this.e).c).invoke(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    public boolean c() {
        Iterator it;
        Iterator it2 = (Iterator) this.d;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.c = 2;
                this.d = null;
                return false;
            }
            Object next = it3.next();
            an0 an0Var = (an0) this.e;
            it = (Iterator) ((wr0) an0Var.d).invoke(((wr0) an0Var.c).invoke(next));
        } while (!it.hasNext());
        this.d = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            case 1:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return c();
            default:
                if (this.c == -1) {
                    b();
                }
                return this.c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    d.v();
                    return null;
                }
                Object obj = this.d;
                this.d = null;
                this.c = -1;
                return obj;
            case 1:
                int i = this.c;
                if (i == 2) {
                    d.v();
                    return null;
                }
                if (i == 0 && !c()) {
                    d.v();
                    return null;
                }
                this.c = 0;
                Iterator it = (Iterator) this.d;
                it.getClass();
                return it.next();
            default:
                if (this.c == -1) {
                    b();
                }
                if (this.c == 0) {
                    d.v();
                    return null;
                }
                Object obj2 = this.d;
                this.d = null;
                this.c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public en0(an0 an0Var) {
        this.a = 1;
        this.e = an0Var;
        this.b = ((l92) an0Var.b).iterator();
    }

    public en0(fn0 fn0Var) {
        this.a = 0;
        this.e = fn0Var;
        this.b = fn0Var.a.iterator();
        this.c = -1;
    }
}
