package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import defpackage.d;
import defpackage.j2;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "E", "Lj2;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PersistentHashSetBuilder<E> extends j2 implements PersistentSet.Builder<E> {
    public PersistentHashSet a;
    public MutabilityOwnership b;
    public TrieNode c;
    public int d;
    public int e;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.c = TrieNode.d;
        k(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.c(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.j2
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getE() {
        return this.e;
    }

    public final PersistentHashSet h() {
        TrieNode trieNode = this.c;
        PersistentHashSet persistentHashSet = this.a;
        if (trieNode != persistentHashSet.a) {
            this.b = new MutabilityOwnership();
            persistentHashSet = new PersistentHashSet(getE(), this.c);
        }
        this.a = persistentHashSet;
        return persistentHashSet;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    public final void k(int i) {
        this.e = i;
        this.d++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iHashCode;
        int e = getE();
        TrieNode trieNode = this.c;
        if (obj != null) {
            iHashCode = obj.hashCode();
        } else {
            iHashCode = 0;
        }
        this.c = trieNode.j(iHashCode, obj, 0, this);
        if (e == getE()) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        PersistentHashSet persistentHashSet;
        PersistentHashSetBuilder persistentHashSetBuilder;
        collection.getClass();
        PersistentHashSet persistentHashSetH = null;
        if (collection instanceof PersistentHashSet) {
            persistentHashSet = (PersistentHashSet) collection;
        } else {
            persistentHashSet = null;
        }
        if (persistentHashSet == null) {
            if (collection instanceof PersistentHashSetBuilder) {
                persistentHashSetBuilder = (PersistentHashSetBuilder) collection;
            } else {
                persistentHashSetBuilder = null;
            }
            if (persistentHashSetBuilder != null) {
                persistentHashSetH = persistentHashSetBuilder.h();
            }
        } else {
            persistentHashSetH = persistentHashSet;
        }
        if (persistentHashSetH != null) {
            DeltaCounter deltaCounter = new DeltaCounter();
            int i = this.e;
            TrieNode trieNodeK = this.c.k(persistentHashSetH.a, 0, deltaCounter, this);
            int size = (collection.size() + i) - deltaCounter.a;
            if (i != size) {
                this.c = trieNodeK;
                k(size);
            }
            if (i == this.e) {
                return false;
            }
            return true;
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        if (collection instanceof PersistentHashSet) {
            return this.c.d(0, ((PersistentHashSet) collection).a);
        }
        if (collection instanceof PersistentHashSetBuilder) {
            return this.c.d(0, ((PersistentHashSetBuilder) collection).c);
        }
        return super.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iHashCode;
        int e = getE();
        TrieNode trieNode = this.c;
        if (obj != null) {
            iHashCode = obj.hashCode();
        } else {
            iHashCode = 0;
        }
        this.c = trieNode.l(iHashCode, obj, 0, this);
        if (e == getE()) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        PersistentHashSet persistentHashSet;
        PersistentHashSetBuilder persistentHashSetBuilder;
        collection.getClass();
        PersistentHashSet persistentHashSetH = null;
        if (collection instanceof PersistentHashSet) {
            persistentHashSet = (PersistentHashSet) collection;
        } else {
            persistentHashSet = null;
        }
        if (persistentHashSet == null) {
            if (collection instanceof PersistentHashSetBuilder) {
                persistentHashSetBuilder = (PersistentHashSetBuilder) collection;
            } else {
                persistentHashSetBuilder = null;
            }
            if (persistentHashSetBuilder != null) {
                persistentHashSetH = persistentHashSetBuilder.h();
            }
        } else {
            persistentHashSetH = persistentHashSet;
        }
        if (persistentHashSetH != null) {
            DeltaCounter deltaCounter = new DeltaCounter();
            int i = this.e;
            Object objM = this.c.m(persistentHashSetH.a, 0, deltaCounter, this);
            int i2 = i - deltaCounter.a;
            if (i2 == 0) {
                clear();
            } else if (i2 != i) {
                if (objM != null) {
                    this.c = (TrieNode) objM;
                    k(i2);
                } else {
                    d.w("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                    return false;
                }
            }
            if (i == this.e) {
                return false;
            }
            return true;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        PersistentHashSet persistentHashSet;
        PersistentHashSetBuilder persistentHashSetBuilder;
        collection.getClass();
        PersistentHashSet persistentHashSetH = null;
        if (collection instanceof PersistentHashSet) {
            persistentHashSet = (PersistentHashSet) collection;
        } else {
            persistentHashSet = null;
        }
        if (persistentHashSet == null) {
            if (collection instanceof PersistentHashSetBuilder) {
                persistentHashSetBuilder = (PersistentHashSetBuilder) collection;
            } else {
                persistentHashSetBuilder = null;
            }
            if (persistentHashSetBuilder != null) {
                persistentHashSetH = persistentHashSetBuilder.h();
            }
        } else {
            persistentHashSetH = persistentHashSet;
        }
        if (persistentHashSetH != null) {
            DeltaCounter deltaCounter = new DeltaCounter();
            int i = this.e;
            Object objN = this.c.n(persistentHashSetH.a, 0, deltaCounter, this);
            int i2 = deltaCounter.a;
            if (i2 == 0) {
                clear();
            } else if (i2 != i) {
                if (objN != null) {
                    this.c = (TrieNode) objN;
                    k(i2);
                } else {
                    d.w("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                    return false;
                }
            }
            if (i == this.e) {
                return false;
            }
            return true;
        }
        return super.retainAll(collection);
    }
}
