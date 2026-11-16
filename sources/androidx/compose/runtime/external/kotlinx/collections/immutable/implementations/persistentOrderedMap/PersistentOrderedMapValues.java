package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import defpackage.i0;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapValues;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "Li0;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PersistentOrderedMapValues<K, V> extends i0 implements ImmutableCollection<V> {
    public final PersistentOrderedMap a;

    @Override // defpackage.i0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // defpackage.i0
    /* JADX INFO: renamed from: getSize */
    public final int getB() {
        return this.a.c.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new PersistentOrderedMapValuesIterator(this.a);
    }

    public PersistentOrderedMapValues(PersistentOrderedMap persistentOrderedMap) {
        this.a = persistentOrderedMap;
    }
}
