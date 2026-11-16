package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class dh1 implements Iterator, bc1 {
    public final fh1 a;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ int e;

    public dh1(fh1 fh1Var, int i) {
        this.e = i;
        fh1Var.getClass();
        this.a = fh1Var;
        this.c = -1;
        this.d = fh1Var.h;
        b();
    }

    public final void a() {
        if (this.a.h == this.d) {
            return;
        }
        d.o();
    }

    public final void b() {
        while (true) {
            int i = this.b;
            fh1 fh1Var = this.a;
            if (i >= fh1Var.f || fh1Var.c[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        fh1 fh1Var = this.a;
        switch (i) {
            case 0:
                a();
                int i2 = this.b;
                if (i2 >= fh1Var.f) {
                    d.v();
                    return null;
                }
                this.b = i2 + 1;
                this.c = i2;
                eh1 eh1Var = new eh1(fh1Var, i2);
                b();
                return eh1Var;
            case 1:
                a();
                int i3 = this.b;
                if (i3 >= fh1Var.f) {
                    d.v();
                    return null;
                }
                this.b = i3 + 1;
                this.c = i3;
                Object obj = fh1Var.a[i3];
                b();
                return obj;
            default:
                a();
                int i4 = this.b;
                if (i4 >= fh1Var.f) {
                    d.v();
                    return null;
                }
                this.b = i4 + 1;
                this.c = i4;
                Object[] objArr = fh1Var.b;
                objArr.getClass();
                Object obj2 = objArr[this.c];
                b();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        if (this.c != -1) {
            fh1 fh1Var = this.a;
            fh1Var.f();
            fh1Var.r(this.c);
            this.c = -1;
            this.d = fh1Var.h;
            return;
        }
        e32.i("Call next() before removing element from the iterator.");
    }
}
