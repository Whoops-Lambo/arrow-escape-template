package defpackage;

import com.google.android.gms.internal.ads.zzgvq;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class af1 extends AbstractList implements RandomAccess, Serializable {
    public final /* synthetic */ int a = 1;
    public final List b;
    public final Object c;

    public af1(List list, zzgvq zzgvqVar) {
        list.getClass();
        this.b = list;
        this.c = zzgvqVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                return ((gs0) this.c).apply(this.b.get(i));
            default:
                return ((zzgvq) this.c).apply(this.b.get(i));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                break;
        }
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new ze1(this, this.b.listIterator(i), 0);
            default:
                return new mr4(this, this.b.listIterator(i), 0);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        switch (this.a) {
            case 0:
                return ((gs0) this.c).apply(this.b.remove(i));
            default:
                return ((zzgvq) this.c).apply(this.b.remove(i));
        }
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        switch (this.a) {
            case 0:
                this.b.subList(i, i2).clear();
                break;
            default:
                this.b.subList(i, i2).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.size();
    }

    public af1(List list, gs0 gs0Var) {
        list.getClass();
        this.b = list;
        this.c = gs0Var;
    }
}
