package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class eq4 implements Iterator {
    public final Iterator a;
    public Collection b = null;
    public Iterator c = jr4.a;
    public final /* synthetic */ as4 d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.b = collection;
            this.c = collection.iterator();
        }
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.c.remove();
        Collection collection = this.b;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.a.remove();
        }
        this.d.e--;
    }

    public eq4(as4 as4Var) {
        this.d = as4Var;
        this.a = as4Var.d.entrySet().iterator();
    }
}
