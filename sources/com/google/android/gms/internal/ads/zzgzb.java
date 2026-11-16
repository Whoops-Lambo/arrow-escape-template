package com.google.android.gms.internal.ads;

import defpackage.ar4;
import defpackage.dr4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgzb extends zzgyx implements List, RandomAccess {
    public static final ar4 b = new ar4(w.e, 0);

    public static w C(Object[] objArr) {
        if (objArr.length == 0) {
            return w.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzhau.a(length, objArr2);
        return D(length, objArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    /* JADX INFO: renamed from: d */
    public final zzhbp iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!Objects.equals(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
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

    @Override // com.google.android.gms.internal.ads.zzgyx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final zzgzb n() {
        return this;
    }

    public static w A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzhau.a(i, objArr2);
        return D(i, objArr2);
    }

    public static zzgzb B(Collection collection) {
        if (!(collection instanceof zzgyx)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzhau.a(length, array);
            return D(length, array);
        }
        zzgzb zzgzbVarN = ((zzgyx) collection).n();
        if (!zzgzbVarN.o()) {
            return zzgzbVarN;
        }
        Object[] array2 = zzgzbVarN.toArray(zzgyx.a);
        return D(array2.length, array2);
    }

    public static w D(int i, Object[] objArr) {
        return i == 0 ? w.e : new w(objArr, i);
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

    public static w x(Object obj) {
        Object[] objArr = {obj};
        zzhau.a(1, objArr);
        return D(1, objArr);
    }

    public static w y(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzhau.a(2, objArr);
        return D(2, objArr);
    }

    public static w z(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        zzhau.a(5, objArr);
        return D(5, objArr);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final ar4 listIterator(int i) {
        zzgvz.j(i, size());
        if (isEmpty()) {
            return b;
        }
        return new ar4(this, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgyx, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public int r(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public zzgzb subList(int i, int i2) {
        zzgvz.k(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return w.e;
        }
        return new dr4(this, i, i3);
    }
}
