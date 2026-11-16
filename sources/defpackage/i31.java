package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class i31 implements Map, Serializable {
    public transient a42 a;
    public transient b42 b;
    public transient c42 c;

    @Override // java.util.Map
    public abstract Object get(Object obj);

    public static g31 d() {
        return new g31(4);
    }

    public static i31 f(Map map) {
        if ((map instanceof i31) && !(map instanceof SortedMap)) {
            return (i31) map;
        }
        Set setEntrySet = map.entrySet();
        g31 g31Var = new g31(setEntrySet != null ? setEntrySet.size() : 4);
        g31Var.c(setEntrySet);
        return g31Var.a(true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final q31 entrySet() {
        a42 a42Var = this.a;
        if (a42Var != null) {
            return a42Var;
        }
        d42 d42Var = (d42) this;
        a42 a42Var2 = new a42(d42Var, d42Var.e, d42Var.f);
        this.a = a42Var2;
        return a42Var2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final q31 keySet() {
        b42 b42Var = this.b;
        if (b42Var != null) {
            return b42Var;
        }
        d42 d42Var = (d42) this;
        b42 b42Var2 = new b42(d42Var, new c42(d42Var.e, 0, d42Var.f));
        this.b = b42Var2;
        return b42Var2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((d42) this).size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final u21 values() {
        c42 c42Var = this.c;
        if (c42Var != null) {
            return c42Var;
        }
        d42 d42Var = (d42) this;
        c42 c42Var2 = new c42(d42Var.e, 1, d42Var.f);
        this.c = c42Var2;
        return c42Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Object writeReplace() {
        return new h31(this);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return qb5.e(obj, this);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return c71.n(entrySet());
    }

    public final String toString() {
        return qb5.r(this);
    }
}
