package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f42 extends t31 {
    public static final f42 h;
    public final transient d31 g;

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iG = G(obj, true);
        d31 d31Var = this.g;
        if (iG == d31Var.size()) {
            return null;
        }
        return d31Var.get(iG);
    }

    @Override // defpackage.u21, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.g, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iF = F(obj, true) - 1;
        if (iF == -1) {
            return null;
        }
        return this.g.get(iF);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iG = G(obj, false);
        d31 d31Var = this.g;
        if (iG == d31Var.size()) {
            return null;
        }
        return d31Var.get(iG);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iF = F(obj, false) - 1;
        if (iF == -1) {
            return null;
        }
        return this.g.get(iF);
    }

    static {
        z21 z21Var = d31.b;
        h = new f42(y32.e, gq1.a);
    }

    public final f42 E(int i, int i2) {
        d31 d31Var = this.g;
        if (i == 0 && i2 == d31Var.size()) {
            return this;
        }
        Comparator comparator = this.d;
        if (i < i2) {
            return new f42(d31Var.subList(i, i2), comparator);
        }
        return gq1.a != comparator ? new f42(y32.e, comparator) : h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof cp1) {
            collection = ((cp1) collection).elementSet();
        }
        Comparator comparator = this.d;
        if (!ns1.s(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        d03 it = iterator();
        Iterator it2 = collection.iterator();
        e1 e1Var = (e1) it;
        if (!e1Var.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = e1Var.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!e1Var.hasNext()) {
                        return false;
                    }
                    next2 = e1Var.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // defpackage.q31, defpackage.u21
    public final d31 d() {
        return this.g;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.g.I().listIterator(0);
    }

    @Override // defpackage.q31, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.g.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.d;
        if (!ns1.s(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            d03 it2 = iterator();
            do {
                e1 e1Var = (e1) it2;
                if (!e1Var.hasNext()) {
                    return true;
                }
                next = e1Var.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.u21
    public final int h(int i, Object[] objArr) {
        return this.g.h(i, objArr);
    }

    @Override // defpackage.u21
    public final Object[] i() {
        return this.g.i();
    }

    @Override // defpackage.u21
    public final int k() {
        return this.g.k();
    }

    @Override // defpackage.u21
    public final int n() {
        return this.g.n();
    }

    @Override // defpackage.u21
    public final boolean o() {
        return this.g.o();
    }

    @Override // defpackage.u21
    /* JADX INFO: renamed from: r */
    public final d03 iterator() {
        return this.g.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g.size();
    }

    public f42(d31 d31Var, Comparator comparator) {
        super(comparator);
        this.g = d31Var;
    }

    public final int F(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.g, obj, this.d);
        if (iBinarySearch >= 0) {
            if (z) {
                return iBinarySearch + 1;
            }
            return iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int G(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.g, obj, this.d);
        if (iBinarySearch >= 0) {
            if (z) {
                return iBinarySearch;
            }
            return iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.g.get(0);
        }
        d.v();
        return null;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            d31 d31Var = this.g;
            return d31Var.get(d31Var.size() - 1);
        }
        d.v();
        return null;
    }

    @Override // defpackage.t31, defpackage.q31, defpackage.u21
    public Object writeReplace() {
        return super.writeReplace();
    }
}
