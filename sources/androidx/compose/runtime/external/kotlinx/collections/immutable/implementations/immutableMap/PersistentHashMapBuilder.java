package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import defpackage.i2;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Li2;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PersistentHashMapBuilder<K, V> extends i2 implements PersistentMap.Builder<K, V> {
    public PersistentHashMap a;
    public MutabilityOwnership b;
    public TrieNode c;
    public Object d;
    public int e;
    public int f;

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        this.c = this.c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.d;
    }

    @Override // defpackage.i2
    public final Set a() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override // defpackage.i2
    public final Set b() {
        return new PersistentHashMapBuilderKeys(this);
    }

    @Override // defpackage.i2
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF() {
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = TrieNode.e;
        f(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.i2
    public final Collection d() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final PersistentHashMap build() {
        TrieNode trieNode = this.c;
        PersistentHashMap persistentHashMap = this.a;
        if (trieNode != persistentHashMap.a) {
            this.b = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap(this.c, getF());
        }
        this.a = persistentHashMap;
        return persistentHashMap;
    }

    public final void f(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public PersistentHashMapBuilder(PersistentHashMap persistentHashMap) {
        persistentHashMap.getClass();
        this.a = persistentHashMap;
        this.b = new MutabilityOwnership();
        this.c = persistentHashMap.a;
        this.f = persistentHashMap.getB();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        PersistentHashMap persistentHashMap;
        PersistentHashMapBuilder persistentHashMapBuilder;
        map.getClass();
        PersistentHashMap persistentHashMapBuild = null;
        if (map instanceof PersistentHashMap) {
            persistentHashMap = (PersistentHashMap) map;
        } else {
            persistentHashMap = null;
        }
        if (persistentHashMap == null) {
            if (map instanceof PersistentHashMapBuilder) {
                persistentHashMapBuilder = (PersistentHashMapBuilder) map;
            } else {
                persistentHashMapBuilder = null;
            }
            if (persistentHashMapBuilder != null) {
                persistentHashMapBuild = persistentHashMapBuilder.build();
            }
        } else {
            persistentHashMapBuild = persistentHashMap;
        }
        if (persistentHashMapBuild != null) {
            DeltaCounter deltaCounter = new DeltaCounter();
            int i = this.f;
            this.c = this.c.m(persistentHashMapBuild.a, 0, deltaCounter, this);
            int i2 = (persistentHashMapBuild.b + i) - deltaCounter.a;
            if (i != i2) {
                f(i2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iHashCode;
        int f = getF();
        TrieNode trieNode = this.c;
        if (obj != null) {
            iHashCode = obj.hashCode();
        } else {
            iHashCode = 0;
        }
        TrieNode trieNodeO = trieNode.o(iHashCode, obj, obj2, 0, this);
        if (trieNodeO == null) {
            trieNodeO = TrieNode.e;
        }
        this.c = trieNodeO;
        if (f == getF()) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        this.d = null;
        TrieNode trieNodeN = this.c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (trieNodeN == null) {
            trieNodeN = TrieNode.e;
        }
        this.c = trieNodeN;
        return this.d;
    }
}
