package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class g8 extends h2 {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b = d;
    public int c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        j1 j1Var = n1.Companion;
        int i2 = this.c;
        j1Var.getClass();
        j1.c(i, i2);
        if (i == this.c) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        y();
        n(this.c + 1);
        int iX = x(this.a + i);
        int i3 = this.c;
        if (i < ((i3 + 1) >> 1)) {
            if (iX == 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iX - 1;
            }
            int length2 = this.a;
            if (length2 == 0) {
                Object[] objArr2 = this.b;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.a;
            Object[] objArr3 = this.b;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                n8.P(i5, i5 + 1, length + 1, objArr3, objArr3);
            } else {
                n8.P(i5 - 1, i5, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.b;
                objArr4[objArr4.length - 1] = objArr4[0];
                n8.P(0, 1, length + 1, objArr4, objArr4);
            }
            this.b[length] = obj;
            this.a = i4;
        } else {
            int iX2 = x(i3 + this.a);
            Object[] objArr5 = this.b;
            if (iX < iX2) {
                n8.P(iX + 1, iX, iX2, objArr5, objArr5);
            } else {
                n8.P(1, 0, iX2, objArr5, objArr5);
                Object[] objArr6 = this.b;
                objArr6[0] = objArr6[objArr6.length - 1];
                n8.P(iX + 1, iX, objArr6.length - 1, objArr6, objArr6);
            }
            this.b[iX] = obj;
        }
        this.c++;
    }

    @Override // defpackage.h2
    public final int d() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        j1 j1Var = n1.Companion;
        int i2 = this.c;
        j1Var.getClass();
        j1.b(i, i2);
        return this.b[x(this.a + i)];
    }

    @Override // defpackage.h2
    public final Object h(int i) {
        j1 j1Var = n1.Companion;
        int i2 = this.c;
        j1Var.getClass();
        j1.b(i, i2);
        if (i == d() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        y();
        int iX = x(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[iX];
        int i3 = this.c >> 1;
        int i4 = this.a;
        if (i < i3) {
            if (iX >= i4) {
                n8.P(i4 + 1, i4, iX, objArr, objArr);
            } else {
                n8.P(1, 0, iX, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.a;
                n8.P(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i6 = this.a;
            objArr3[i6] = null;
            this.a = o(i6);
        } else {
            int iX2 = x((d() - 1) + i4);
            Object[] objArr4 = this.b;
            if (iX <= iX2) {
                n8.P(iX, iX + 1, iX2 + 1, objArr4, objArr4);
            } else {
                n8.P(iX, iX + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                n8.P(0, 1, iX2 + 1, objArr5, objArr5);
            }
            this.b[iX2] = null;
        }
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iX = x(d() + this.a);
        int length = this.a;
        if (length < iX) {
            while (length < iX) {
                if (s71.b(obj, this.b[length])) {
                    i = this.a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.a) < iX) {
            return -1;
        }
        int length2 = this.b.length;
        while (length < length2) {
            if (s71.b(obj, this.b[length])) {
                i = this.a;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iX; i2++) {
            if (s71.b(obj, this.b[i2])) {
                length = i2 + this.b.length;
                i = this.a;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iX = x(this.c + this.a);
        int i2 = this.a;
        if (i2 < iX) {
            length = iX - 1;
            if (i2 <= length) {
                while (!s71.b(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.a >= iX) {
            do {
                iX--;
                objArr = this.b;
                if (-1 >= iX) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.a;
                    if (i3 <= length) {
                        while (!s71.b(obj, this.b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.a;
                    }
                }
                return length - i;
            } while (!s71.b(obj, objArr[iX]));
            length = iX + this.b.length;
            i = this.a;
            return length - i;
        }
        return -1;
    }

    public final void n(int i) {
        if (i < 0) {
            e32.i("Deque is too big.");
            return;
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        j1 j1Var = n1.Companion;
        int length = objArr.length;
        j1Var.getClass();
        Object[] objArr2 = new Object[j1.e(length, i)];
        Object[] objArr3 = this.b;
        n8.P(0, this.a, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.b;
        int length2 = objArr4.length;
        int i2 = this.a;
        n8.P(length2 - i2, 0, i2, objArr4, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    public final int o(int i) {
        Object[] objArr = this.b;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int r(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        j1 j1Var = n1.Companion;
        int i3 = this.c;
        j1Var.getClass();
        j1.d(i, i2, i3);
        int i4 = i2 - i;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.c) {
            clear();
            return;
        }
        if (i4 == 1) {
            h(i);
            return;
        }
        y();
        int i5 = this.c - i2;
        int i6 = this.a;
        if (i < i5) {
            int iX = x((i - 1) + i6);
            int iX2 = x(this.a + (i2 - 1));
            while (i > 0) {
                int i7 = iX + 1;
                int iMin = Math.min(i, Math.min(i7, iX2 + 1));
                Object[] objArr = this.b;
                int i8 = iX2 - iMin;
                int i9 = iX - iMin;
                n8.P(i8 + 1, i9 + 1, i7, objArr, objArr);
                iX = r(i9);
                iX2 = r(i8);
                i -= iMin;
            }
            int iX3 = x(this.a + i4);
            t(this.a, iX3);
            this.a = iX3;
        } else {
            int iX4 = x(i6 + i2);
            int iX5 = x(this.a + i);
            int i10 = this.c;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i10, Math.min(objArr2.length - iX4, objArr2.length - iX5));
                Object[] objArr3 = this.b;
                int i11 = iX4 + i2;
                n8.P(iX5, iX4, i11, objArr3, objArr3);
                iX4 = x(i11);
                iX5 = x(iX5 + i2);
            }
            int iX6 = x(this.c + this.a);
            t(r(iX6 - i4), iX6);
        }
        this.c -= i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        j1 j1Var = n1.Companion;
        int i2 = this.c;
        j1Var.getClass();
        j1.b(i, i2);
        int iX = x(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[iX];
        objArr[iX] = obj;
        return obj2;
    }

    public final void t(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            n8.X(i, i2, null, objArr);
        } else {
            n8.X(i, objArr.length, null, objArr);
            n8.X(0, i2, null, this.b);
        }
    }

    public final int x(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void y() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        j1 j1Var = n1.Companion;
        int i2 = this.c;
        j1Var.getClass();
        j1.c(i, i2);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        y();
        n(collection.size() + this.c);
        int iX = x(this.c + this.a);
        int iX2 = x(this.a + i);
        int size = collection.size();
        if (i < ((this.c + 1) >> 1)) {
            int i3 = this.a;
            int length = i3 - size;
            Object[] objArr = this.b;
            if (iX2 >= i3) {
                if (length >= 0) {
                    n8.P(length, i3, iX2, objArr, objArr);
                } else {
                    length += objArr.length;
                    int i4 = iX2 - i3;
                    int length2 = objArr.length - length;
                    if (length2 >= i4) {
                        n8.P(length, i3, iX2, objArr, objArr);
                    } else {
                        n8.P(length, i3, i3 + length2, objArr, objArr);
                        Object[] objArr2 = this.b;
                        n8.P(0, this.a + length2, iX2, objArr2, objArr2);
                    }
                }
            } else {
                n8.P(length, i3, objArr.length, objArr, objArr);
                Object[] objArr3 = this.b;
                if (size >= iX2) {
                    n8.P(objArr3.length - size, 0, iX2, objArr3, objArr3);
                } else {
                    n8.P(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.b;
                    n8.P(0, size, iX2, objArr4, objArr4);
                }
            }
            this.a = length;
            k(r(iX2 - size), collection);
            return true;
        }
        int i5 = iX2 + size;
        Object[] objArr5 = this.b;
        if (iX2 < iX) {
            int i6 = size + iX;
            if (i6 <= objArr5.length) {
                n8.P(i5, iX2, iX, objArr5, objArr5);
            } else if (i5 >= objArr5.length) {
                n8.P(i5 - objArr5.length, iX2, iX, objArr5, objArr5);
            } else {
                int length3 = iX - (i6 - objArr5.length);
                n8.P(0, length3, iX, objArr5, objArr5);
                Object[] objArr6 = this.b;
                n8.P(i5, iX2, length3, objArr6, objArr6);
            }
        } else {
            n8.P(size, 0, iX, objArr5, objArr5);
            Object[] objArr7 = this.b;
            if (i5 >= objArr7.length) {
                n8.P(i5 - objArr7.length, iX2, objArr7.length, objArr7, objArr7);
            } else {
                n8.P(0, objArr7.length - size, objArr7.length, objArr7, objArr7);
                Object[] objArr8 = this.b;
                n8.P(i5, iX2, objArr8.length - size, objArr8, objArr8);
            }
        }
        k(iX2, collection);
        return true;
    }

    public final void addFirst(Object obj) {
        y();
        n(this.c + 1);
        int length = this.a;
        if (length == 0) {
            Object[] objArr = this.b;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.a = i;
        this.b[i] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        y();
        n(d() + 1);
        this.b[x(d() + this.a)] = obj;
        this.c = d() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            y();
            t(this.a, x(d() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (d() == 0) {
            return true;
        }
        return false;
    }

    public final void k(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        h(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iX;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iX2 = x(d() + this.a);
            int i = this.a;
            if (i < iX2) {
                iX = i;
                while (true) {
                    objArr = this.b;
                    if (i >= iX2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (!collection.contains(obj)) {
                        this.b[iX] = obj;
                        iX++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                n8.X(iX, iX2, null, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iX = x(i2);
                for (int i3 = 0; i3 < iX2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.b[iX] = obj3;
                        iX = o(iX);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                y();
                this.c = r(iX - this.a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            y();
            Object[] objArr = this.b;
            int i = this.a;
            Object obj = objArr[i];
            objArr[i] = null;
            this.a = o(i);
            this.c = d() - 1;
            return obj;
        }
        vq2.s("ArrayDeque is empty.");
        return null;
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            y();
            int iX = x((size() - 1) + this.a);
            Object[] objArr = this.b;
            Object obj = objArr[iX];
            objArr[iX] = null;
            this.c = d() - 1;
            return obj;
        }
        vq2.s("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iX;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iX2 = x(d() + this.a);
            int i = this.a;
            if (i < iX2) {
                iX = i;
                while (true) {
                    objArr = this.b;
                    if (i >= iX2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.b[iX] = obj;
                        iX++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                n8.X(iX, iX2, null, objArr);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.b;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iX = x(i2);
                for (int i3 = 0; i3 < iX2; i3++) {
                    Object[] objArr3 = this.b;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[iX] = obj3;
                        iX = o(iX);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                y();
                this.c = r(iX - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iX = x(this.c + this.a);
        int i2 = this.a;
        if (i2 < iX) {
            n8.S(i2, iX, 2, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            n8.P(0, this.a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            n8.P(objArr3.length - this.a, 0, iX, objArr3, objArr);
        }
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[d()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        y();
        n(collection.size() + d());
        k(x(d() + this.a), collection);
        return true;
    }
}
