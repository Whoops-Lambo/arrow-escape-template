package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import defpackage.d;
import defpackage.ec1;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MutableMapEntry;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/MapEntry;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, ec1 {
    public final PersistentHashMapBuilderEntriesIterator c;
    public Object d;

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    /* JADX INFO: renamed from: getValue */
    public final Object getB() {
        return this.d;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.d;
        this.d = obj;
        PersistentHashMapBuilderBaseIterator persistentHashMapBuilderBaseIterator = this.c.a;
        PersistentHashMapBuilder persistentHashMapBuilder = persistentHashMapBuilderBaseIterator.d;
        Object obj3 = this.a;
        if (!persistentHashMapBuilder.containsKey(obj3)) {
            return obj2;
        }
        boolean z = persistentHashMapBuilderBaseIterator.c;
        if (!z) {
            persistentHashMapBuilder.put(obj3, obj);
        } else {
            if (!z) {
                d.v();
                return null;
            }
            TrieNodeBaseIterator trieNodeBaseIterator = persistentHashMapBuilderBaseIterator.a[persistentHashMapBuilderBaseIterator.b];
            Object obj4 = trieNodeBaseIterator.a[trieNodeBaseIterator.c];
            persistentHashMapBuilder.put(obj3, obj);
            persistentHashMapBuilderBaseIterator.c(obj4 != null ? obj4.hashCode() : 0, persistentHashMapBuilder.c, obj4, 0);
        }
        persistentHashMapBuilderBaseIterator.g = persistentHashMapBuilder.e;
        return obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMapEntry(PersistentHashMapBuilderEntriesIterator persistentHashMapBuilderEntriesIterator, Object obj, Object obj2) {
        super(obj, obj2);
        persistentHashMapBuilderEntriesIterator.getClass();
        this.c = persistentHashMapBuilderEntriesIterator;
        this.d = obj2;
    }
}
