package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links;
import defpackage.q1;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "K", "V", "Lq1;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Companion", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PersistentHashMap<K, V> extends q1 implements PersistentMap<K, V> {
    public static final PersistentHashMap c = new PersistentHashMap(TrieNode.e, 0);
    public final TrieNode a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap$Companion;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final PersistentHashMap e(Object obj, Links links) {
        TrieNode.ModificationResult modificationResultU = this.a.u(obj != null ? obj.hashCode() : 0, obj, links, 0);
        return modificationResultU == null ? this : new PersistentHashMap(modificationResultU.a, this.b + modificationResultU.b);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.a.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.q1
    public final Set a() {
        return new PersistentHashMapEntries(this);
    }

    @Override // defpackage.q1
    public final Set b() {
        return new PersistentHashMapKeys(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public final PersistentMap.Builder builder() {
        return new PersistentHashMapBuilder(this);
    }

    @Override // defpackage.q1
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // defpackage.q1
    public final Collection d() {
        return new PersistentHashMapValues(this);
    }

    public PersistentHashMap(TrieNode trieNode, int i) {
        trieNode.getClass();
        this.a = trieNode;
        this.b = i;
    }
}
