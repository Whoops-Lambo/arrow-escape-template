package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import defpackage.i2;
import defpackage.s71;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "K", "V", "Li2;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PersistentOrderedMapBuilder<K, V> extends i2 implements PersistentMap.Builder<K, V> {
    public PersistentOrderedMap a;
    public Object b;
    public Object c;
    public final PersistentHashMapBuilder d;

    @Override // defpackage.i2
    public final Set a() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    @Override // defpackage.i2
    public final Set b() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public final PersistentMap build() {
        PersistentHashMap persistentHashMapBuild = this.d.build();
        PersistentOrderedMap persistentOrderedMap = this.a;
        if (persistentHashMapBuild == persistentOrderedMap.c) {
            Object obj = persistentOrderedMap.a;
            Object obj2 = persistentOrderedMap.b;
        } else {
            persistentOrderedMap = new PersistentOrderedMap(this.b, this.c, persistentHashMapBuild);
        }
        this.a = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // defpackage.i2
    /* JADX INFO: renamed from: c */
    public final int getF() {
        return this.d.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.d.clear();
        EndOfChain endOfChain = EndOfChain.a;
        this.b = endOfChain;
        this.c = endOfChain;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.i2
    public final Collection d() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        LinkedValue linkedValue = (LinkedValue) this.d.get(obj);
        if (linkedValue != null) {
            return linkedValue.a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.d;
        LinkedValue linkedValue = (LinkedValue) persistentHashMapBuilder.get(obj);
        if (linkedValue != null) {
            Object obj3 = linkedValue.a;
            if (obj3 == obj2) {
                return obj2;
            }
            persistentHashMapBuilder.put(obj, new LinkedValue(obj2, linkedValue.b, linkedValue.c));
            return obj3;
        }
        boolean zIsEmpty = isEmpty();
        EndOfChain endOfChain = EndOfChain.a;
        if (zIsEmpty) {
            this.b = obj;
            this.c = obj;
            persistentHashMapBuilder.put(obj, new LinkedValue(obj2, endOfChain, endOfChain));
            return null;
        }
        Object obj4 = this.c;
        Object obj5 = persistentHashMapBuilder.get(obj4);
        obj5.getClass();
        LinkedValue linkedValue2 = (LinkedValue) obj5;
        persistentHashMapBuilder.put(obj4, new LinkedValue(linkedValue2.a, linkedValue2.b, obj));
        persistentHashMapBuilder.put(obj, new LinkedValue(obj2, obj4, endOfChain));
        this.c = obj;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.d;
        LinkedValue linkedValue = (LinkedValue) persistentHashMapBuilder.remove(obj);
        if (linkedValue == null) {
            return null;
        }
        Object obj2 = linkedValue.c;
        Object obj3 = linkedValue.b;
        EndOfChain endOfChain = EndOfChain.a;
        if (obj3 != endOfChain) {
            Object obj4 = persistentHashMapBuilder.get(obj3);
            obj4.getClass();
            LinkedValue linkedValue2 = (LinkedValue) obj4;
            persistentHashMapBuilder.put(obj3, new LinkedValue(linkedValue2.a, linkedValue2.b, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 != endOfChain) {
            Object obj5 = persistentHashMapBuilder.get(obj2);
            obj5.getClass();
            LinkedValue linkedValue3 = (LinkedValue) obj5;
            persistentHashMapBuilder.put(obj2, new LinkedValue(linkedValue3.a, obj3, linkedValue3.c));
        } else {
            this.c = obj3;
        }
        return linkedValue.a;
    }

    public PersistentOrderedMapBuilder(PersistentOrderedMap persistentOrderedMap) {
        this.a = persistentOrderedMap;
        this.b = persistentOrderedMap.a;
        this.c = persistentOrderedMap.b;
        PersistentHashMap persistentHashMap = persistentOrderedMap.c;
        persistentHashMap.getClass();
        this.d = new PersistentHashMapBuilder(persistentHashMap);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        LinkedValue linkedValue = (LinkedValue) this.d.get(obj);
        if (linkedValue == null || !s71.b(linkedValue.a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
