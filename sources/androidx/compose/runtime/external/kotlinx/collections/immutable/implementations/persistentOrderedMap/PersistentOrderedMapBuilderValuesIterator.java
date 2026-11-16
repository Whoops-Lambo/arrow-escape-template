package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import defpackage.bc1;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderValuesIterator;", "K", "V", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PersistentOrderedMapBuilderValuesIterator<K, V> implements Iterator<V>, bc1 {
    public final PersistentOrderedMapBuilderLinksIterator a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.next().a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }

    public PersistentOrderedMapBuilderValuesIterator(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        persistentOrderedMapBuilder.getClass();
        this.a = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.b, persistentOrderedMapBuilder);
    }
}
