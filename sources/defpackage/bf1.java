package defpackage;

import com.google.android.gms.internal.ads.zzgvq;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bf1 extends AbstractSequentialList implements Serializable {
    public final /* synthetic */ int a = 1;
    public final List b;
    public final Object c;

    public bf1(List list, zzgvq zzgvqVar) {
        list.getClass();
        this.b = list;
        this.c = zzgvqVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new ze1(this, this.b.listIterator(i), 1);
            default:
                return new mr4(this, this.b.listIterator(i), 1);
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

    public bf1(List list, gs0 gs0Var) {
        list.getClass();
        this.b = list;
        this.c = gs0Var;
    }
}
