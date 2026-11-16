package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class u1 extends AbstractMap {
    public final /* synthetic */ int a = 1;
    public final transient Map b;
    public transient AbstractSet c;
    public transient AbstractCollection d;
    public final /* synthetic */ Serializable e;

    public u1(as4 as4Var, Map map) {
        Objects.requireNonNull(as4Var);
        this.e = as4Var;
        this.b = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        int i = this.a;
        Map map = this.b;
        Serializable serializable = this.e;
        switch (i) {
            case 0:
                o1 o1Var = (o1) serializable;
                if (map != o1Var.e) {
                    ns1.e(new t1(this));
                } else {
                    o1Var.g();
                }
                break;
            default:
                as4 as4Var = (as4) serializable;
                if (map != as4Var.d) {
                    t1 t1Var = new t1(this, (byte) 0);
                    while (t1Var.hasNext()) {
                        t1Var.next();
                        t1Var.remove();
                    }
                } else {
                    as4Var.g();
                }
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.c;
                if (s1Var != null) {
                    return s1Var;
                }
                s1 s1Var2 = new s1(this, 0);
                this.c = s1Var2;
                return s1Var2;
            default:
                fq4 fq4Var = (fq4) this.c;
                if (fq4Var != null) {
                    return fq4Var;
                }
                fq4 fq4Var2 = new fq4(this);
                this.c = fq4Var2;
                return fq4Var2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return this == obj || this.b.equals(obj);
            default:
                return this == obj || this.b.equals(obj);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.a;
        Serializable serializable = this.e;
        Map map = this.b;
        switch (i) {
            case 0:
                map.getClass();
                try {
                    obj2 = map.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                o1 o1Var = (o1) serializable;
                List list = (List) collection;
                return list instanceof RandomAccess ? new y1(o1Var, obj, list, null) : new c2(o1Var, obj, list, (c2) null);
            default:
                map.getClass();
                try {
                    obj3 = map.get(obj);
                    break;
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                as4 as4Var = (as4) serializable;
                as4Var.getClass();
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new jq4(as4Var, obj, list2, null) : new c2(as4Var, obj, list2, (c2) null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case 0:
                return this.b.hashCode();
            default:
                return this.b.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        Set lq4Var;
        int i = this.a;
        Serializable serializable = this.e;
        switch (i) {
            case 0:
                o1 o1Var = (o1) serializable;
                Set set = o1Var.b;
                if (set != null) {
                    return set;
                }
                Set setJ = o1Var.j();
                o1Var.b = setJ;
                return setJ;
            default:
                as4 as4Var = (as4) serializable;
                Set set2 = as4Var.a;
                if (set2 == null) {
                    Map map = as4Var.d;
                    if (map instanceof NavigableMap) {
                        lq4Var = new iq4(as4Var, (NavigableMap) map);
                    } else {
                        lq4Var = map instanceof SortedMap ? new lq4(as4Var, (SortedMap) map) : new gq4(as4Var, map);
                    }
                    set2 = lq4Var;
                    as4Var.a = set2;
                }
                return set2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int i = this.a;
        Serializable serializable = this.e;
        Map map = this.b;
        switch (i) {
            case 0:
                o1 o1Var = (o1) serializable;
                Collection collection = (Collection) map.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection collectionI = o1Var.i();
                collectionI.addAll(collection);
                o1Var.f -= collection.size();
                collection.clear();
                return collectionI;
            default:
                Collection collection2 = (Collection) map.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                as4 as4Var = (as4) serializable;
                List list = (List) as4Var.f.mo1232zza();
                list.addAll(collection2);
                as4Var.e -= collection2.size();
                collection2.clear();
                return list;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                zu zuVar = (zu) this.d;
                if (zuVar != null) {
                    return zuVar;
                }
                zu zuVar2 = new zu(this, 1);
                this.d = zuVar2;
                return zuVar2;
            default:
                zu zuVar3 = (zu) this.d;
                if (zuVar3 != null) {
                    return zuVar3;
                }
                zu zuVar4 = new zu(this, 4);
                this.d = zuVar4;
                return zuVar4;
        }
    }

    public v21 a(Map.Entry entry) {
        Object c2Var;
        Object key = entry.getKey();
        o1 o1Var = (o1) this.e;
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            c2Var = new y1(o1Var, key, list, null);
        } else {
            c2Var = new c2(o1Var, key, list, (c2) null);
        }
        return new v21(key, c2Var);
    }

    public AbstractMap.SimpleImmutableEntry b(Map.Entry entry) {
        Object c2Var;
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        as4 as4Var = (as4) this.e;
        as4Var.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            c2Var = new jq4(as4Var, key, list, null);
        } else {
            c2Var = new c2(as4Var, key, list, (c2) null);
        }
        return new AbstractMap.SimpleImmutableEntry(key, c2Var);
    }

    public u1(o1 o1Var, Map map) {
        this.e = o1Var;
        this.b = map;
    }
}
