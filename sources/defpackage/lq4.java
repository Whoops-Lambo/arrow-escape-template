package defpackage;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class lq4 extends gq4 implements SortedSet {
    public final /* synthetic */ as4 d;

    public SortedMap c() {
        return (SortedMap) this.b;
    }

    public SortedSet headSet(Object obj) {
        return new lq4(this.d, c().headMap(obj));
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new lq4(this.d, c().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new lq4(this.d, c().tailMap(obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq4(as4 as4Var, SortedMap sortedMap) {
        super(as4Var, sortedMap);
        Objects.requireNonNull(as4Var);
        this.d = as4Var;
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
