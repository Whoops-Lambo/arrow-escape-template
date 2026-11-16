package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d31 extends u21 implements List, RandomAccess {
    public static final z21 b = new z21(0, y32.e);

    public static y32 B(Object[] objArr) {
        if (objArr.length == 0) {
            return y32.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        tb5.d(objArr2.length, objArr2);
        return t(objArr2.length, objArr2);
    }

    @Override // defpackage.u21
    public final d31 d() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && uu.p(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (uu.p(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.u21, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.u21
    /* JADX INFO: renamed from: r */
    public final d03 iterator() {
        return listIterator(0);
    }

    public static d31 A(Collection collection) {
        if (!(collection instanceof u21)) {
            Object[] array = collection.toArray();
            tb5.d(array.length, array);
            return t(array.length, array);
        }
        d31 d31VarD = ((u21) collection).d();
        if (!d31VarD.o()) {
            return d31VarD;
        }
        Object[] array2 = d31VarD.toArray(u21.a);
        return t(array2.length, array2);
    }

    public static y32 H(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        fs1.f("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        tb5.d(length, objArr2);
        return t(length, objArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static y32 t(int i, Object[] objArr) {
        return i == 0 ? y32.e : new y32(objArr, i);
    }

    public static y21 x() {
        return new y21(4);
    }

    public static y21 y(int i) {
        l93.i(i, "expectedSize");
        return new y21(i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.u21
    public Object writeReplace() {
        return new b31(toArray(u21.a));
    }

    public static y32 D(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        tb5.d(5, objArr);
        return t(5, objArr);
    }

    public static y32 E(Object obj) {
        Object[] objArr = {obj};
        tb5.d(1, objArr);
        return t(1, objArr);
    }

    public static y32 F(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        tb5.d(2, objArr);
        return t(2, objArr);
    }

    public static y32 G(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        tb5.d(3, objArr);
        return t(3, objArr);
    }

    public static y32 J(ss1 ss1Var, List list) {
        List list2;
        ss1Var.getClass();
        if (list instanceof Collection) {
            list2 = list;
        } else {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list2 = arrayList;
        }
        Object[] array = list2.toArray();
        tb5.d(array.length, array);
        Arrays.sort(array, ss1Var);
        return t(array.length, array);
    }

    public static d31 z(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return A((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return y32.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return E(next);
        }
        y21 y21Var = new y21(4);
        y21Var.a(next);
        while (it.hasNext()) {
            y21Var.a(it.next());
        }
        return y21Var.g();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final z21 listIterator(int i) {
        fs1.l(i, size());
        if (isEmpty()) {
            return b;
        }
        return new z21(i, this);
    }

    public d31 I() {
        if (size() <= 1) {
            return this;
        }
        return new a31(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public d31 subList(int i, int i2) {
        fs1.m(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return y32.e;
        }
        return new c31(this, i, i3);
    }

    @Override // defpackage.u21, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.u21
    public int h(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }
}
