package com.google.android.gms.internal.games_v2;

import defpackage.e32;
import defpackage.ur4;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzhl extends zzhk implements NavigableSet, Iterable {
    public final transient Comparator c;
    public transient zzhl d;

    public abstract c A();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: B */
    public abstract ur4 descendingIterator();

    public abstract c x(Object obj, boolean z);

    public abstract zzhl y(Object obj, boolean z, Object obj2, boolean z2);

    public abstract c z(Object obj, boolean z);

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.c;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        zzhl zzhlVar = this.d;
        if (zzhlVar != null) {
            return zzhlVar;
        }
        c cVarA = A();
        this.d = cVarA;
        cVarA.d = this;
        return cVarA;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    public zzhl(Comparator comparator) {
        this.c = comparator;
    }

    public Object ceiling(Object obj) {
        obj.getClass();
        ur4 ur4VarListIterator = z(obj, true).e.listIterator(0);
        if (ur4VarListIterator.hasNext()) {
            return ur4VarListIterator.next();
        }
        return null;
    }

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        obj.getClass();
        ur4 ur4VarDescendingIterator = x(obj, true).descendingIterator();
        if (ur4VarDescendingIterator.hasNext()) {
            return ur4VarDescendingIterator.next();
        }
        return null;
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return x(obj, false);
    }

    public Object higher(Object obj) {
        obj.getClass();
        ur4 ur4VarListIterator = z(obj, false).e.listIterator(0);
        if (ur4VarListIterator.hasNext()) {
            return ur4VarListIterator.next();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.games_v2.zzhk, com.google.android.gms.internal.games_v2.zzgy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        obj.getClass();
        ur4 ur4VarDescendingIterator = x(obj, false).descendingIterator();
        if (ur4VarDescendingIterator.hasNext()) {
            return ur4VarDescendingIterator.next();
        }
        return null;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.compare(obj, obj2) <= 0) {
            return y(obj, true, obj2, false);
        }
        e32.a();
        return null;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return z(obj, true);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return x(obj, z);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return z(obj, z);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.compare(obj, obj2) <= 0) {
            return y(obj, z, obj2, z2);
        }
        e32.a();
        return null;
    }
}
