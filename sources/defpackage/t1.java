package defpackage;

import com.google.android.gms.internal.ads.zzgvz;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class t1 implements Iterator {
    public final /* synthetic */ int a;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public t1(c2 c2Var, byte b) {
        this.a = 5;
        this.d = c2Var;
        Collection collection = c2Var.c;
        this.c = collection;
        this.b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        c2 c2Var = (c2) this.d;
        c2Var.d();
        if (c2Var.c == ((Collection) this.c)) {
            return;
        }
        d.o();
    }

    public void b() {
        c2 c2Var = (c2) this.d;
        c2Var.zza();
        if (c2Var.c == ((Collection) this.c)) {
            return;
        }
        d.o();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                a();
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                b();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.c = (Collection) entry.getValue();
                return ((u1) obj).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return it.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) it.next();
                this.c = (Collection) entry3.getValue();
                return ((u1) obj).b(entry3);
            case 4:
                Map.Entry entry4 = (Map.Entry) it.next();
                this.c = entry4;
                return entry4.getKey();
            default:
                b();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        Object obj = this.d;
        Iterator it = this.b;
        switch (i) {
            case 0:
                fs1.n("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                it.remove();
                ((o1) ((u1) obj).e).f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                fs1.n("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((v1) obj).c.f -= collection.size();
                collection.clear();
                this.c = null;
                break;
            case 2:
                it.remove();
                c2 c2Var = (c2) obj;
                ((o1) c2Var.f).f--;
                c2Var.e();
                break;
            case 3:
                zzgvz.g("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                it.remove();
                ((as4) ((u1) obj).e).e -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 4:
                zzgvz.g("no calls to next() since the last call to remove()", ((Map.Entry) this.c) != null);
                Collection collection2 = (Collection) ((Map.Entry) this.c).getValue();
                it.remove();
                ((gq4) obj).c.e -= collection2.size();
                collection2.clear();
                this.c = null;
                break;
            default:
                it.remove();
                c2 c2Var2 = (c2) obj;
                ((as4) c2Var2.f).e--;
                c2Var2.zzb();
                break;
        }
    }

    public t1(u1 u1Var, byte b) {
        this.a = 3;
        Objects.requireNonNull(u1Var);
        this.d = u1Var;
        this.b = u1Var.b.entrySet().iterator();
    }

    public /* synthetic */ t1(AbstractSet abstractSet, Iterator it, int i) {
        this.a = i;
        this.b = it;
        this.d = abstractSet;
    }

    public t1(c2 c2Var, ListIterator listIterator, byte b) {
        this.a = 5;
        this.d = c2Var;
        this.c = c2Var.c;
        this.b = listIterator;
    }

    public t1(c2 c2Var) {
        Iterator it;
        this.a = 2;
        this.d = c2Var;
        Collection collection = c2Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public t1(c2 c2Var, ListIterator listIterator) {
        this.a = 2;
        this.d = c2Var;
        this.c = c2Var.c;
        this.b = listIterator;
    }

    public t1(u1 u1Var) {
        this.a = 0;
        this.d = u1Var;
        this.b = u1Var.b.entrySet().iterator();
    }
}
