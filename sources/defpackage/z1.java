package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class z1 extends u1 implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ vo1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(vo1 vo1Var, SortedMap sortedMap) {
        super(vo1Var, sortedMap);
        this.g = vo1Var;
    }

    public SortedSet c() {
        return new a2(this.g, e());
    }

    @Override // defpackage.u1, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetC = c();
        this.f = sortedSetC;
        return sortedSetC;
    }

    public SortedMap e() {
        return (SortedMap) this.b;
    }

    public SortedMap headMap(Object obj) {
        return new z1(this.g, e().headMap(obj));
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new z1(this.g, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new z1(this.g, e().tailMap(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }
}
