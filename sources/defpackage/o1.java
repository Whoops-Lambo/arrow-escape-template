package defpackage;

import com.google.common.collect.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o1 extends a implements ue1, Serializable {
    public transient Map e;
    public transient int f;

    public abstract Collection i();

    @Override // defpackage.so1
    public final Collection d() {
        Collection collection = this.a;
        if (collection != null) {
            return collection;
        }
        f2 f2Var = new f2(this, 0);
        this.a = f2Var;
        return f2Var;
    }

    @Override // defpackage.so1
    public final Map f() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map mapH = h();
        this.d = mapH;
        return mapH;
    }

    public final void g() {
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.e.clear();
        this.f = 0;
    }

    @Override // defpackage.so1
    public final List get(Object obj) {
        Collection collectionI = (Collection) this.e.get(obj);
        if (collectionI == null) {
            collectionI = i();
        }
        List list = (List) collectionI;
        return list instanceof RandomAccess ? new y1(this, obj, list, null) : new c2(this, obj, list, (c2) null);
    }

    public Map h() {
        return new u1(this, this.e);
    }

    public Set j() {
        return new v1(this, this.e);
    }

    public final void k(Map map) {
        this.e = map;
        this.f = 0;
        for (Collection collection : map.values()) {
            fs1.g(!collection.isEmpty());
            this.f = collection.size() + this.f;
        }
    }

    @Override // defpackage.so1
    public final boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f++;
            return true;
        }
        Collection collectionI = i();
        if (!collectionI.add(obj2)) {
            d.p("New Collection violated the Collection spec");
            return false;
        }
        this.f++;
        this.e.put(obj, collectionI);
        return true;
    }

    @Override // defpackage.so1
    public final int size() {
        return this.f;
    }

    @Override // defpackage.so1
    public final Collection values() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        f2 f2Var = new f2(this, 1);
        this.c = f2Var;
        return f2Var;
    }

    public o1(Map map) {
        fs1.g(map.isEmpty());
        this.e = map;
    }
}
