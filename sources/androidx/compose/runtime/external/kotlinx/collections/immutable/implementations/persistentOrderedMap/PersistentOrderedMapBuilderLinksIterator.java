package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import defpackage.bc1;
import defpackage.d;
import defpackage.jc1;
import defpackage.os2;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, bc1 {
    public Object a;
    public final PersistentOrderedMapBuilder b;
    public Object c;
    public boolean d;
    public int e;
    public int f;

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LinkedValue next() {
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = this.b;
        if (persistentOrderedMapBuilder.d.e != this.e) {
            d.o();
            return null;
        }
        if (!hasNext()) {
            d.v();
            return null;
        }
        Object obj = this.a;
        this.c = obj;
        this.d = true;
        this.f++;
        V v = persistentOrderedMapBuilder.d.get(obj);
        if (v == null) {
            throw new ConcurrentModificationException(jc1.p(new StringBuilder("Hash code of a key ("), this.a, ") has changed after it was added to the persistent map."));
        }
        LinkedValue linkedValue = (LinkedValue) v;
        this.a = linkedValue.c;
        return linkedValue;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.b.getF();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            y.b();
            return;
        }
        Object obj = this.c;
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = this.b;
        os2.h(persistentOrderedMapBuilder).remove(obj);
        this.c = null;
        this.d = false;
        this.e = persistentOrderedMapBuilder.d.e;
        this.f--;
    }

    public PersistentOrderedMapBuilderLinksIterator(Object obj, PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        persistentOrderedMapBuilder.getClass();
        this.a = obj;
        this.b = persistentOrderedMapBuilder;
        this.c = EndOfChain.a;
        this.e = persistentOrderedMapBuilder.d.e;
    }
}
