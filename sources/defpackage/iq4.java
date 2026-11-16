package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class iq4 extends lq4 implements NavigableSet {
    public final /* synthetic */ as4 e;

    @Override // defpackage.lq4
    public final /* synthetic */ SortedMap c() {
        return (NavigableMap) ((SortedMap) this.b);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.b)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new iq4(this.e, ((NavigableMap) ((SortedMap) this.b)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.b)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new iq4(this.e, ((NavigableMap) ((SortedMap) this.b)).headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.b)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.b)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new iq4(this.e, ((NavigableMap) ((SortedMap) this.b)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new iq4(this.e, ((NavigableMap) ((SortedMap) this.b)).tailMap(obj, z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq4(as4 as4Var, NavigableMap navigableMap) {
        super(as4Var, navigableMap);
        Objects.requireNonNull(as4Var);
        this.e = as4Var;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((gq4) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        t1 t1Var = (t1) iterator();
        if (t1Var.hasNext()) {
            Object next = t1Var.next();
            t1Var.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (itDescendingIterator.hasNext()) {
            Object next = itDescendingIterator.next();
            itDescendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // defpackage.lq4, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // defpackage.lq4, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.lq4, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
