package com.google.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b1 extends AbstractSet {
    public final Set a;
    public final /* synthetic */ Internal.MapAdapter b;

    public b1(Internal.MapAdapter mapAdapter, Set set) {
        this.b = mapAdapter;
        this.a = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a1(this.b, this.a.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
