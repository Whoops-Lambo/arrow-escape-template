package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ye1 extends AbstractList {
    public final List a;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.a.add(c(i), obj);
    }

    public final int c(int i) {
        int size = this.a.size();
        fs1.l(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.a;
        int size = list.size();
        fs1.i(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.a;
        int size = list.size();
        fs1.i(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        List list = this.a;
        int size = list.size();
        fs1.i(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        List list = this.a;
        fs1.m(i, i2, list.size());
        return l7.A(list.subList(c(i2), c(i)));
    }

    public ye1(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new xe1(this, this.a.listIterator(c(i)));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }
}
