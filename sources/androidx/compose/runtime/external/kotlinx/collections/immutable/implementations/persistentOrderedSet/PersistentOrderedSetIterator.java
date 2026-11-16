package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import defpackage.bc1;
import defpackage.d;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "E", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class PersistentOrderedSetIterator<E> implements Iterator<E>, bc1 {
    public Object a;
    public final Map b;
    public int c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public PersistentOrderedSetIterator(Object obj, Map map) {
        map.getClass();
        this.a = obj;
        this.b = map;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object obj = this.a;
            this.c++;
            Object obj2 = this.b.get(obj);
            if (obj2 != null) {
                this.a = ((Links) obj2).b;
                return obj;
            }
            throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
        }
        d.v();
        return null;
    }
}
