package com.google.android.gms.internal.games_v2;

import defpackage.d;
import defpackage.qw4;
import defpackage.ur4;
import defpackage.wz2;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends zzhl {
    public static final c f;
    public final transient zzhd e;

    @Override // com.google.android.gms.internal.games_v2.zzhl, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iD = D(obj, true);
        zzhd zzhdVar = this.e;
        if (iD == zzhdVar.size()) {
            return null;
        }
        return zzhdVar.get(iD);
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.e, obj, this.c) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.games_v2.zzhl, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iC = C(obj, true) - 1;
        if (iC == -1) {
            return null;
        }
        return this.e.get(iC);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhl, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iD = D(obj, false);
        zzhd zzhdVar = this.e;
        if (iD == zzhdVar.size()) {
            return null;
        }
        return zzhdVar.get(iD);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhl, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iC = C(obj, false) - 1;
        if (iC == -1) {
            return null;
        }
        return this.e.get(iC);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhl
    public final c x(Object obj, boolean z) {
        return E(0, C(obj, z));
    }

    static {
        ur4 ur4Var = zzhd.b;
        f = new c(a.e, qw4.a);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhl
    public final c A() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.c);
        if (!isEmpty()) {
            return new c(this.e.o(), comparatorReverseOrder);
        }
        if (qw4.a.equals(comparatorReverseOrder)) {
            return f;
        }
        ur4 ur4Var = zzhd.b;
        return new c(a.e, comparatorReverseOrder);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhl, java.util.NavigableSet
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final ur4 descendingIterator() {
        return this.e.o().listIterator(0);
    }

    public final c E(int i, int i2) {
        zzhd zzhdVar = this.e;
        if (i == 0) {
            if (i2 == zzhdVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.c;
        if (i < i2) {
            return new c(zzhdVar.subList(i, i2), comparator);
        }
        if (qw4.a.equals(comparator)) {
            return f;
        }
        ur4 ur4Var = zzhd.b;
        return new c(a.e, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzhq) {
            collection = ((zzhq) collection).zza();
        }
        Comparator comparator = this.c;
        if (!wz2.e0(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        ur4 ur4VarListIterator = this.e.listIterator(0);
        Iterator it = collection.iterator();
        if (ur4VarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = ur4VarListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!ur4VarListIterator.hasNext()) {
                            break;
                        }
                        next2 = ur4VarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    /* JADX INFO: renamed from: d */
    public final zzil iterator() {
        return this.e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhk, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            zzhd zzhdVar = this.e;
            if (zzhdVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.c;
                if (!wz2.e0(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    ur4 ur4VarListIterator = zzhdVar.listIterator(0);
                    while (ur4VarListIterator.hasNext()) {
                        Object next = ur4VarListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    public final Object[] h() {
        return this.e.h();
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    public final int i() {
        return this.e.i();
    }

    @Override // com.google.android.gms.internal.games_v2.zzhl, com.google.android.gms.internal.games_v2.zzhk, com.google.android.gms.internal.games_v2.zzgy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    public final int k() {
        return this.e.k();
    }

    @Override // com.google.android.gms.internal.games_v2.zzgy
    public final int n(Object[] objArr) {
        return this.e.n(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e.size();
    }

    public c(zzhd zzhdVar, Comparator comparator) {
        super(comparator);
        this.e = zzhdVar;
    }

    public final int C(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.e, obj, this.c);
        if (iBinarySearch >= 0) {
            if (z) {
                return iBinarySearch + 1;
            }
            return iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int D(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.e, obj, this.c);
        if (iBinarySearch >= 0) {
            if (z) {
                return iBinarySearch;
            }
            return iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.android.gms.internal.games_v2.zzhl, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.e.get(0);
        }
        d.v();
        return null;
    }

    @Override // com.google.android.gms.internal.games_v2.zzhl, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            zzhd zzhdVar = this.e;
            return zzhdVar.get(zzhdVar.size() - 1);
        }
        d.v();
        return null;
    }

    @Override // com.google.android.gms.internal.games_v2.zzhl
    public final zzhl y(Object obj, boolean z, Object obj2, boolean z2) {
        return z(obj, z).x(obj2, z2);
    }

    @Override // com.google.android.gms.internal.games_v2.zzhl
    public final c z(Object obj, boolean z) {
        return E(D(obj, z), this.e.size());
    }
}
