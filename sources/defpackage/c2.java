package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class c2 extends AbstractCollection implements List {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable g;

    public c2(as4 as4Var, Object obj, List list, c2 c2Var) {
        this.g = as4Var;
        this.f = as4Var;
        this.b = obj;
        this.c = list;
        this.e = c2Var;
        this.d = c2Var == null ? null : c2Var.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                d();
                boolean zIsEmpty = this.c.isEmpty();
                boolean zAdd = this.c.add(obj);
                if (zAdd) {
                    ((o1) serializable).f++;
                    if (zIsEmpty) {
                        c();
                    }
                }
                return zAdd;
            default:
                zza();
                boolean zIsEmpty2 = this.c.isEmpty();
                boolean zAdd2 = this.c.add(obj);
                if (zAdd2) {
                    ((as4) serializable).e++;
                    if (zIsEmpty2) {
                        h();
                        return true;
                    }
                }
                return zAdd2;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.a;
        Serializable serializable = this.g;
        boolean zAddAll = false;
        switch (i2) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    zAddAll = ((List) this.c).addAll(i, collection);
                    if (zAddAll) {
                        ((o1) serializable).f += this.c.size() - size;
                        if (size == 0) {
                            c();
                        }
                    }
                }
                return zAddAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean zAddAll2 = ((List) this.c).addAll(i, collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                ((as4) serializable).e += this.c.size() - size2;
                if (size2 != 0) {
                    return zAddAll2;
                }
                h();
                return true;
        }
    }

    public void c() {
        c2 c2Var = (c2) this.e;
        if (c2Var != null) {
            c2Var.c();
        } else {
            ((o1) this.f).e.put(this.b, this.c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.c.clear();
                    ((o1) serializable).f -= size;
                    e();
                    break;
                }
                break;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.c.clear();
                    ((as4) serializable).e -= size2;
                    zzb();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                zza();
                break;
        }
        return this.c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                zza();
                break;
        }
        return this.c.containsAll(collection);
    }

    public void d() {
        Collection collection;
        c2 c2Var = (c2) this.e;
        if (c2Var != null) {
            c2Var.d();
            if (c2Var.c == this.d) {
                return;
            }
            d.o();
            return;
        }
        if (!this.c.isEmpty() || (collection = (Collection) ((o1) this.f).e.get(this.b)) == null) {
            return;
        }
        this.c = collection;
    }

    public void e() {
        c2 c2Var = (c2) this.e;
        if (c2Var != null) {
            c2Var.e();
        } else if (this.c.isEmpty()) {
            ((o1) this.f).e.remove(this.b);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                d();
                return this.c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                zza();
                return this.c.equals(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                zza();
                break;
        }
        return ((List) this.c).get(i);
    }

    public void h() {
        c2 c2Var = (c2) this.e;
        if (c2Var != null) {
            c2Var.h();
            return;
        }
        as4 as4Var = (as4) this.f;
        as4Var.d.put(this.b, this.c);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.a) {
            case 0:
                d();
                return this.c.hashCode();
            default:
                zza();
                return this.c.hashCode();
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                zza();
                break;
        }
        return ((List) this.c).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                d();
                return new t1(this);
            default:
                zza();
                return new t1(this, (byte) 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                zza();
                break;
        }
        return ((List) this.c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                d();
                return new b2(this);
            default:
                zza();
                return new mq4(this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.a;
        Serializable serializable = this.g;
        switch (i2) {
            case 0:
                d();
                Object objRemove = ((List) this.c).remove(i);
                ((o1) serializable).f--;
                e();
                return objRemove;
            default:
                zza();
                Object objRemove2 = ((List) this.c).remove(i);
                ((as4) serializable).e--;
                zzb();
                return objRemove2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i = this.a;
        Serializable serializable = this.f;
        boolean zRemoveAll = false;
        switch (i) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    zRemoveAll = this.c.removeAll(collection);
                    if (zRemoveAll) {
                        ((o1) serializable).f += this.c.size() - size;
                        e();
                    }
                }
                break;
            default:
                if (!collection.isEmpty()) {
                    int size2 = size();
                    zRemoveAll = this.c.removeAll(collection);
                    if (zRemoveAll) {
                        ((as4) serializable).e += this.c.size() - size2;
                        zzb();
                    }
                }
                break;
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                int size = size();
                boolean zRetainAll = this.c.retainAll(collection);
                if (zRetainAll) {
                    ((o1) serializable).f += this.c.size() - size;
                    e();
                }
                return zRetainAll;
            default:
                collection.getClass();
                int size2 = size();
                boolean zRetainAll2 = this.c.retainAll(collection);
                if (zRetainAll2) {
                    ((as4) serializable).e += this.c.size() - size2;
                    zzb();
                }
                return zRetainAll2;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                zza();
                break;
        }
        return ((List) this.c).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                zza();
                break;
        }
        return this.c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.a;
        Serializable serializable = this.g;
        Object obj = this.b;
        AbstractCollection abstractCollection = this.e;
        switch (i3) {
            case 0:
                d();
                o1 o1Var = (o1) serializable;
                List listSubList = ((List) this.c).subList(i, i2);
                c2 c2Var = (c2) abstractCollection;
                if (c2Var != null) {
                    this = c2Var;
                }
                return listSubList instanceof RandomAccess ? new y1(o1Var, obj, listSubList, this) : new c2(o1Var, obj, listSubList, this);
            default:
                zza();
                List listSubList2 = ((List) this.c).subList(i, i2);
                c2 c2Var2 = (c2) abstractCollection;
                if (c2Var2 != null) {
                    this = c2Var2;
                }
                as4 as4Var = (as4) serializable;
                as4Var.getClass();
                return listSubList2 instanceof RandomAccess ? new jq4(as4Var, obj, listSubList2, this) : new c2(as4Var, obj, listSubList2, this);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.a) {
            case 0:
                d();
                break;
            default:
                zza();
                break;
        }
        return this.c.toString();
    }

    public void zza() {
        c2 c2Var = (c2) this.e;
        if (c2Var != null) {
            c2Var.zza();
            if (c2Var.c == this.d) {
                return;
            }
            d.o();
            return;
        }
        if (this.c.isEmpty()) {
            as4 as4Var = (as4) this.f;
            Collection collection = (Collection) as4Var.d.get(this.b);
            if (collection != null) {
                this.c = collection;
            }
        }
    }

    public void zzb() {
        c2 c2Var = (c2) this.e;
        if (c2Var != null) {
            c2Var.zzb();
        } else if (this.c.isEmpty()) {
            as4 as4Var = (as4) this.f;
            as4Var.d.remove(this.b);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                d();
                return new b2(this, i);
            default:
                zza();
                return new mq4(this, i);
        }
    }

    public c2(o1 o1Var, Object obj, List list, c2 c2Var) {
        this.g = o1Var;
        this.f = o1Var;
        this.b = obj;
        this.c = list;
        this.e = c2Var;
        this.d = c2Var == null ? null : c2Var.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int i = this.a;
        Serializable serializable = this.f;
        switch (i) {
            case 0:
                d();
                boolean zRemove = this.c.remove(obj);
                if (zRemove) {
                    ((o1) serializable).f--;
                    e();
                }
                return zRemove;
            default:
                zza();
                boolean zRemove2 = this.c.remove(obj);
                if (zRemove2) {
                    ((as4) serializable).e--;
                    zzb();
                }
                return zRemove2;
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.a;
        Serializable serializable = this.g;
        switch (i2) {
            case 0:
                d();
                boolean zIsEmpty = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((o1) serializable).f++;
                if (zIsEmpty) {
                    c();
                }
                break;
            default:
                zza();
                boolean zIsEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((as4) serializable).e++;
                if (zIsEmpty2) {
                    h();
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        int i = this.a;
        Serializable serializable = this.f;
        boolean zAddAll = false;
        switch (i) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    zAddAll = this.c.addAll(collection);
                    if (zAddAll) {
                        ((o1) serializable).f += this.c.size() - size;
                        if (size == 0) {
                            c();
                        }
                    }
                }
                return zAddAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean zAddAll2 = this.c.addAll(collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                ((as4) serializable).e += this.c.size() - size2;
                if (size2 != 0) {
                    return zAddAll2;
                }
                h();
                return true;
        }
    }
}
