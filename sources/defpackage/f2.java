package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class f2 extends AbstractCollection {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;

    public /* synthetic */ f2(o1 o1Var, int i) {
        this.a = i;
        this.b = o1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.a;
        o1 o1Var = this.b;
        switch (i) {
            case 0:
                o1Var.g();
                break;
            default:
                o1Var.g();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        o1 o1Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) o1Var.f().get(key);
                return collection != null && collection.contains(value);
            default:
                return o1Var.a(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        o1 o1Var = this.b;
        switch (i) {
            case 0:
                return new r1(o1Var, 1);
            default:
                return new r1(o1Var, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.b.remove(entry.getKey(), entry.getValue());
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.a;
        o1 o1Var = this.b;
        switch (i) {
            case 0:
                break;
        }
        return o1Var.f;
    }
}
