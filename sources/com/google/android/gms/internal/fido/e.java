package com.google.android.gms.internal.fido;

import defpackage.d14;
import defpackage.j7;
import defpackage.w44;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e extends zzck {
    public static final e g;
    public final transient zzcc f;

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iE = E(obj, true);
        zzcc zzccVar = this.f;
        if (iE == zzccVar.size()) {
            return null;
        }
        return zzccVar.get(iE);
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iD = D(obj, true) - 1;
        if (iD == -1) {
            return null;
        }
        return this.f.get(iD);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iE = E(obj, false);
        zzcc zzccVar = this.f;
        if (iE == zzccVar.size()) {
            return null;
        }
        return zzccVar.get(iE);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iD = D(obj, false) - 1;
        if (iD == -1) {
            return null;
        }
        return this.f.get(iD);
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final e y(Object obj, boolean z) {
        return F(0, D(obj, z));
    }

    static {
        d14 d14Var = zzcc.b;
        g = new e(c.e, w44.a);
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.NavigableSet
    /* JADX INFO: renamed from: C */
    public final d14 descendingIterator() {
        return this.f.n().listIterator(0);
    }

    public final e F(int i, int i2) {
        zzcc zzccVar = this.f;
        if (i == 0) {
            if (i2 == zzccVar.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.d;
        return i < i2 ? new e(zzccVar.subList(i, i2), comparator) : zzck.B(comparator);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int a(Object[] objArr) {
        return this.f.a(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzcp) {
            collection = ((zzcp) collection).zza();
        }
        Comparator comparator = this.d;
        if (!j7.e0(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        d14 d14VarListIterator = this.f.listIterator(0);
        Iterator it = collection.iterator();
        if (d14VarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = d14VarListIterator.next();
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
                        if (!d14VarListIterator.hasNext()) {
                            break;
                        }
                        next2 = d14VarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int d() {
        return this.f.d();
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            zzcc zzccVar = this.f;
            if (zzccVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.d;
                if (!j7.e0(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    d14 d14VarListIterator = zzccVar.listIterator(0);
                    while (d14VarListIterator.hasNext()) {
                        Object next = d14VarListIterator.next();
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

    @Override // com.google.android.gms.internal.fido.zzby
    public final int h() {
        return this.f.h();
    }

    @Override // com.google.android.gms.internal.fido.zzby
    /* JADX INFO: renamed from: i */
    public final zzdc iterator() {
        return this.f.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzck, com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] k() {
        return this.f.k();
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc r() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final e x() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.d);
        return isEmpty() ? zzck.B(comparatorReverseOrder) : new e(this.f.n(), comparatorReverseOrder);
    }

    public e(zzcc zzccVar, Comparator comparator) {
        super(comparator);
        this.f = zzccVar;
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final e A(Object obj, boolean z) {
        return F(E(obj, z), this.f.size());
    }

    public final int D(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f, obj, this.d);
        if (iBinarySearch >= 0) {
            if (z) {
                return iBinarySearch + 1;
            }
            return iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int E(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f, obj, this.d);
        if (iBinarySearch >= 0) {
            if (z) {
                return iBinarySearch;
            }
            return iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f.get(0);
        }
        defpackage.d.v();
        return null;
    }

    @Override // com.google.android.gms.internal.fido.zzck, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            zzcc zzccVar = this.f;
            return zzccVar.get(zzccVar.size() - 1);
        }
        defpackage.d.v();
        return null;
    }

    @Override // com.google.android.gms.internal.fido.zzck
    public final zzck z(Object obj, boolean z, Object obj2, boolean z2) {
        return A(obj, z).y(obj2, z2);
    }
}
