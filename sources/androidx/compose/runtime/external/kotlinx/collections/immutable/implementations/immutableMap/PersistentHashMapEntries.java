package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import defpackage.l2;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapEntries;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "Ll2;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PersistentHashMapEntries<K, V> extends l2 implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {
    public final PersistentHashMap a;

    @Override // defpackage.i0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        PersistentHashMap persistentHashMap = this.a;
        Object obj2 = persistentHashMap.get(key);
        if (obj2 != null) {
            return obj2.equals(entry.getValue());
        }
        return entry.getValue() == null && persistentHashMap.containsKey(entry.getKey());
    }

    @Override // defpackage.i0
    /* JADX INFO: renamed from: getSize */
    public final int getB() {
        return this.a.b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        TrieNode trieNode = this.a.a;
        trieNode.getClass();
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i = 0; i < 8; i++) {
            trieNodeBaseIteratorArr[i] = new TrieNodeEntriesIterator();
        }
        return new PersistentHashMapEntriesIterator(trieNode, trieNodeBaseIteratorArr);
    }

    public PersistentHashMapEntries(PersistentHashMap persistentHashMap) {
        this.a = persistentHashMap;
    }
}
