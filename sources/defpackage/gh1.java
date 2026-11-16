package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gh1 extends j2 {
    public final /* synthetic */ int a;
    public final fh1 b;

    public /* synthetic */ gh1(fh1 fh1Var, int i) {
        this.a = i;
        this.b = fh1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.a;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        fh1 fh1Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                fh1Var.getClass();
                int iK = fh1Var.k(entry.getKey());
                if (iK < 0) {
                    return false;
                }
                Object[] objArr = fh1Var.b;
                objArr.getClass();
                return s71.b(objArr[iK], entry.getValue());
            default:
                return fh1Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                return this.b.h(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // defpackage.j2
    /* JADX INFO: renamed from: d */
    public final int getE() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        fh1 fh1Var = this.b;
        switch (i) {
            case 0:
                fh1Var.getClass();
                return new dh1(fh1Var, 0);
            default:
                fh1Var.getClass();
                return new dh1(fh1Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        fh1 fh1Var = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    fh1Var.getClass();
                    fh1Var.f();
                    int iK = fh1Var.k(entry.getKey());
                    if (iK >= 0) {
                        Object[] objArr = fh1Var.b;
                        objArr.getClass();
                        if (s71.b(objArr[iK], entry.getValue())) {
                            fh1Var.r(iK);
                            return true;
                        }
                    }
                }
                return false;
            default:
                fh1Var.f();
                int iK2 = fh1Var.k(obj);
                if (iK2 < 0) {
                    return false;
                }
                fh1Var.r(iK2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.a;
        fh1 fh1Var = this.b;
        collection.getClass();
        switch (i) {
            case 0:
                fh1Var.f();
                break;
            default:
                fh1Var.f();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.a;
        fh1 fh1Var = this.b;
        collection.getClass();
        switch (i) {
            case 0:
                fh1Var.f();
                break;
            default:
                fh1Var.f();
                break;
        }
        return super.retainAll(collection);
    }
}
