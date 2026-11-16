package androidx.collection;

import defpackage.cc1;
import defpackage.wx;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u001f\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$values$1", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableScatterMap$MutableMapWrapper$values$1 implements Collection<Object>, cc1 {
    @Override // java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw null;
    }

    @Override // java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new MutableScatterMap$MutableMapWrapper$values$1$iterator$1();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends Object> collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (!collection2.isEmpty()) {
            Iterator it = collection2.iterator();
            if (!it.hasNext()) {
                return true;
            }
            it.next();
            throw null;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        throw null;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        throw null;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return wx.s(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return wx.r(this);
    }
}
