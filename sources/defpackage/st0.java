package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class st0 implements Iterator, bc1 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ l92 d;

    public st0(wk2 wk2Var) {
        this.a = 1;
        this.d = wk2Var;
        this.c = wk2Var.a.iterator();
    }

    public void a() {
        Object objInvoke;
        int i = this.b;
        tt0 tt0Var = (tt0) this.d;
        if (i == -2) {
            objInvoke = ((sr0) tt0Var.b).invoke();
        } else {
            wr0 wr0Var = (wr0) tt0Var.c;
            Object obj = this.c;
            obj.getClass();
            objInvoke = wr0Var.invoke(obj);
        }
        this.c = objInvoke;
        this.b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                return this.b == 1;
            default:
                wk2 wk2Var = (wk2) this.d;
                Iterator it = (Iterator) this.c;
                while (this.b < wk2Var.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                return this.b < wk2Var.c && it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 0) {
                    d.v();
                    return null;
                }
                Object obj = this.c;
                obj.getClass();
                this.b = -1;
                return obj;
            default:
                wk2 wk2Var = (wk2) this.d;
                Iterator it = (Iterator) this.c;
                while (this.b < wk2Var.b && it.hasNext()) {
                    it.next();
                    this.b++;
                }
                int i = this.b;
                if (i < wk2Var.c) {
                    this.b = i + 1;
                    return it.next();
                }
                d.v();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public st0(tt0 tt0Var) {
        this.a = 0;
        this.d = tt0Var;
        this.b = -2;
    }
}
