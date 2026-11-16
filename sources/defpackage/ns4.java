package defpackage;

import com.google.android.gms.internal.ads.zzhbk;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ns4 extends zzhbk {
    public final /* synthetic */ Set a;
    public final /* synthetic */ Set b;

    public ns4(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: c */
    public final ms4 iterator() {
        return new ms4(this, this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) && this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection) && this.b.containsAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzhbk
    public final int d() {
        Set set = this.a;
        int iD = set instanceof zzhbk ? ((zzhbk) set).d() : set.size();
        Set set2 = this.b;
        return Math.min(iD, set2 instanceof zzhbk ? ((zzhbk) set2).d() : set2.size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.b, this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.b.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
