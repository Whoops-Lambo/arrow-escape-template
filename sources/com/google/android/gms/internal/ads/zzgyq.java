package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzgyq extends zzgys implements Collection {
    @Override // com.google.android.gms.internal.ads.zzgys
    public /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    public abstract Collection d();

    public boolean add(Object obj) {
        return d().add(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return d().addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        d().clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return d().contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return d().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return d().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return d().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return d().remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return d().removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return d().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return d().size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return d().toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d().toArray(objArr);
    }
}
