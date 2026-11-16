package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class x1 extends a2 implements NavigableSet {
    public final /* synthetic */ vo1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(vo1 vo1Var, NavigableMap navigableMap) {
        super(vo1Var, navigableMap);
        this.e = vo1Var;
    }

    @Override // defpackage.a2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final NavigableMap c() {
        return (NavigableMap) ((SortedMap) this.b);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new x1(this.e, c().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new x1(this.e, c().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new x1(this.e, c().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new x1(this.e, c().tailMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return c().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((v1) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return c().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return c().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return c().lowerKey(obj);
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

    @Override // defpackage.a2, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // defpackage.a2, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.a2, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
