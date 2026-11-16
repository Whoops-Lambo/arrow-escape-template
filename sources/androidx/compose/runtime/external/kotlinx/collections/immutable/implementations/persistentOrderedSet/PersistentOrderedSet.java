package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import defpackage.l2;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "E", "Ll2;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Companion", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PersistentOrderedSet<E> extends l2 implements PersistentSet<E> {
    public static final PersistentOrderedSet d;
    public final Object a;
    public final Object b;
    public final PersistentHashMap c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet$Companion;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        EndOfChain endOfChain = EndOfChain.a;
        d = new PersistentOrderedSet(endOfChain, endOfChain, PersistentHashMap.c);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet add(Object obj) {
        PersistentHashMap persistentHashMap = this.c;
        if (persistentHashMap.containsKey(obj)) {
            return this;
        }
        boolean zIsEmpty = isEmpty();
        EndOfChain endOfChain = EndOfChain.a;
        if (zIsEmpty) {
            return new PersistentOrderedSet(obj, obj, persistentHashMap.e(obj, new Links(endOfChain, endOfChain)));
        }
        Object obj2 = this.b;
        Object obj3 = persistentHashMap.get(obj2);
        obj3.getClass();
        return new PersistentOrderedSet(this.a, obj, persistentHashMap.e(obj2, new Links(((Links) obj3).a, obj)).e(obj, new Links(obj2, endOfChain)));
    }

    @Override // defpackage.i0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // defpackage.i0
    /* JADX INFO: renamed from: getSize */
    public final int getB() {
        return this.c.getB();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentOrderedSetIterator(this.a, this.c);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet remove(Object obj) {
        PersistentHashMap persistentHashMapE = this.c;
        Links links = (Links) persistentHashMapE.get(obj);
        if (links == null) {
            return this;
        }
        Object obj2 = links.a;
        Object obj3 = links.b;
        TrieNode trieNode = persistentHashMapE.a;
        TrieNode trieNodeV = trieNode.v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (trieNode != trieNodeV) {
            persistentHashMapE = trieNodeV == null ? PersistentHashMap.c : new PersistentHashMap(trieNodeV, persistentHashMapE.b - 1);
        }
        EndOfChain endOfChain = EndOfChain.a;
        if (obj2 != endOfChain) {
            Object obj4 = persistentHashMapE.get(obj2);
            obj4.getClass();
            persistentHashMapE = persistentHashMapE.e(obj2, new Links(((Links) obj4).a, obj3));
        }
        if (obj3 != endOfChain) {
            Object obj5 = persistentHashMapE.get(obj3);
            obj5.getClass();
            persistentHashMapE = persistentHashMapE.e(obj3, new Links(obj2, ((Links) obj5).b));
        }
        Object obj6 = obj2 != endOfChain ? this.a : obj3;
        if (obj3 != endOfChain) {
            obj2 = this.b;
        }
        return new PersistentOrderedSet(obj6, obj2, persistentHashMapE);
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        persistentHashMap.getClass();
        this.a = obj;
        this.b = obj2;
        this.c = persistentHashMap;
    }
}
