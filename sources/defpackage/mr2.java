package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mr2 extends AbstractMap {
    public final Iterable a;
    public final /* synthetic */ or2 b;

    public mr2(or2 or2Var, Collection collection) {
        this.b = or2Var;
        this.a = collection;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        ns1.e(this.a.iterator());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new s1(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof z12)) {
            return null;
        }
        z12 z12Var = (z12) obj;
        nr2 nr2Var = (nr2) this.b.a.get(z12Var.a);
        if (nr2Var == null || !nr2Var.a.equals(z12Var)) {
            return null;
        }
        return nr2Var.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b.a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }
}
