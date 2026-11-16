package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n81 extends d03 {
    public int a;
    public Object b;
    public final /* synthetic */ int c;
    public final Iterator d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n81(gc2 gc2Var) {
        this();
        this.c = 1;
        this.e = gc2Var;
        this.d = gc2Var.a.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        fs1.p(this.a != 4);
        int iC = h50.C(this.a);
        if (iC == 0) {
            return true;
        }
        if (iC != 2) {
            this.a = 4;
            int i = this.c;
            Object obj = null;
            Object obj2 = this.e;
            Iterator it = this.d;
            switch (i) {
                case 0:
                    while (true) {
                        if (!it.hasNext()) {
                            this.a = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((ly1) obj2).apply(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
                default:
                    while (true) {
                        if (!it.hasNext()) {
                            this.a = 3;
                            break;
                        } else {
                            next = it.next();
                            if (((gc2) obj2).b.contains(next)) {
                                obj = next;
                                break;
                            }
                        }
                    }
                    break;
            }
            this.b = obj;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.a = 2;
            Object obj = this.b;
            this.b = null;
            return obj;
        }
        d.v();
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n81(Iterator it, ly1 ly1Var) {
        this();
        this.c = 0;
        this.d = it;
        this.e = ly1Var;
    }

    public n81() {
        this.a = 2;
    }
}
