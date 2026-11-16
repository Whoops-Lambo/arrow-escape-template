package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class a2 extends v1 implements SortedSet {
    public final /* synthetic */ vo1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(vo1 vo1Var, SortedMap sortedMap) {
        super(vo1Var, sortedMap);
        this.d = vo1Var;
    }

    public SortedMap c() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return new a2(this.d, c().headMap(obj));
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return new a2(this.d, c().subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return new a2(this.d, c().tailMap(obj));
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return c().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return c().firstKey();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return c().lastKey();
    }
}
