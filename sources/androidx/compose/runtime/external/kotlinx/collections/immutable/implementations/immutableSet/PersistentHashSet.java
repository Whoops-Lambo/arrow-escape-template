package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import defpackage.l2;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "E", "Ll2;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Companion", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PersistentHashSet<E> extends l2 implements PersistentSet<E> {
    public final TrieNode a;
    public final int b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet$Companion;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet add(Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        TrieNode trieNode = this.a;
        TrieNode trieNodeA = trieNode.a(iHashCode, 0, obj);
        return trieNode == trieNodeA ? this : new PersistentHashSet(size() + 1, trieNodeA);
    }

    @Override // defpackage.i0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.a.c(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet remove(Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        TrieNode trieNode = this.a;
        TrieNode trieNodeQ = trieNode.q(iHashCode, 0, obj);
        return trieNode == trieNodeQ ? this : new PersistentHashSet(size() - 1, trieNodeQ);
    }

    static {
        new PersistentHashSet(0, TrieNode.d);
    }

    @Override // defpackage.i0
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int getB() {
        return this.b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentHashSetIterator(this.a);
    }

    public PersistentHashSet(int i, TrieNode trieNode) {
        trieNode.getClass();
        this.a = trieNode;
        this.b = i;
    }

    @Override // defpackage.i0, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        boolean z = collection instanceof PersistentHashSet;
        TrieNode trieNode = this.a;
        if (z) {
            return trieNode.d(0, ((PersistentHashSet) collection).a);
        }
        if (collection instanceof PersistentHashSetBuilder) {
            return trieNode.d(0, ((PersistentHashSetBuilder) collection).c);
        }
        return super.containsAll(collection);
    }
}
