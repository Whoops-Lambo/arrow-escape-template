package com.google.android.gms.internal.common;

import defpackage.hr3;
import defpackage.tr3;
import defpackage.wq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzam extends zzah implements List, RandomAccess {
    public static final wq3 b = new wq3(a.e, 0);

    @Override // com.google.android.gms.internal.common.zzah
    /* JADX INFO: renamed from: d */
    public final wq3 iterator() {
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

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final zzam n() {
        return this;
    }

    public static a A(int i, Object[] objArr) {
        return i == 0 ? a.e : new a(objArr, i);
    }

    public static zzam z(Collection collection) {
        if (!(collection instanceof zzah)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzan.a(length, array);
            return A(length, array);
        }
        zzam zzamVarN = ((zzah) collection).n();
        if (!zzamVarN.o()) {
            return zzamVarN;
        }
        Object[] array2 = zzamVarN.toArray(zzah.a);
        return A(array2.length, array2);
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

    public static zzam y(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return z((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return a.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Object[] objArr = {next};
            zzan.a(1, objArr);
            return A(1, objArr);
        }
        zzai zzaiVar = new zzai(0);
        zzaiVar.a(next);
        while (it.hasNext()) {
            zzaiVar.a(it.next());
        }
        zzaiVar.c = true;
        return A(zzaiVar.b, zzaiVar.a);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final wq3 listIterator(int i) {
        zzs.b(i, size());
        if (isEmpty()) {
            return b;
        }
        return new wq3(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
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

    @Override // com.google.android.gms.internal.common.zzah
    public void r(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
    }

    public zzam t() {
        if (size() <= 1) {
            return this;
        }
        return new hr3(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: x */
    public zzam subList(int i, int i2) {
        zzs.c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return a.e;
        }
        return new tr3(this, i, i3);
    }
}
