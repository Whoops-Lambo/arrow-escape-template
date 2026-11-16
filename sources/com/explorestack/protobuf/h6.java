package com.explorestack.protobuf;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class h6 implements Iterator {
    public final k6 a;
    public final Iterator b;

    public final boolean equals(Object obj) {
        return this.b.equals(obj);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.f();
        this.b.remove();
    }

    public final String toString() {
        return this.b.toString();
    }

    public h6(k6 k6Var, Iterator it) {
        this.a = k6Var;
        this.b = it;
    }
}
