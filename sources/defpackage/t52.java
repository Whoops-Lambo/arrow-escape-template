package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class t52 extends n1 implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public final void c(int i) {
        if (i < 0) {
            ak1.n(pv1.k(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > size()) {
            vq2.e(size(), jc1.s(i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.c = i4;
            this.d = size() - i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        j1 j1Var = n1.Companion;
        int size = size();
        j1Var.getClass();
        j1.b(i, size);
        return this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.i0
    public final int getSize() {
        return this.d;
    }

    @Override // defpackage.n1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new s52(this);
    }

    public t52(Object[] objArr, int i) {
        this.a = objArr;
        if (i >= 0) {
            if (i <= objArr.length) {
                this.b = objArr.length;
                this.d = i;
                return;
            } else {
                vq2.e(objArr.length, jc1.s(i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
                throw null;
            }
        }
        ak1.n(pv1.k(i, "ring buffer filled size should not be negative but it is "));
        throw null;
    }

    @Override // defpackage.i0, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
        }
        int size = size();
        int i = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            objArr2 = this.a;
            if (i3 >= size || i >= this.b) {
                break;
            }
            objArr[i3] = objArr2[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            objArr[i3] = objArr2[i2];
            i3++;
            i2++;
        }
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // defpackage.i0, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
