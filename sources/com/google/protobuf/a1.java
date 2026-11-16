package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a1 implements Iterator {
    public final Iterator a;
    public final /* synthetic */ Internal.MapAdapter b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return new z0(this.b, (Map.Entry) this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }

    public a1(Internal.MapAdapter mapAdapter, Iterator it) {
        this.b = mapAdapter;
        this.a = it;
    }
}
