package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class x8 extends AbstractList implements s5, RandomAccess {
    public final r5 a;

    @Override // com.explorestack.protobuf.s5
    public final s5 getUnmodifiableView() {
        return this;
    }

    @Override // com.explorestack.protobuf.s5
    public final void b(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // com.explorestack.protobuf.s5
    public final ByteString getByteString(int i) {
        return this.a.getByteString(i);
    }

    @Override // com.explorestack.protobuf.s5
    public final Object getRaw(int i) {
        return this.a.b.get(i);
    }

    @Override // com.explorestack.protobuf.s5
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        o5 o5Var = new o5(1);
        o5Var.b = this.a.iterator();
        return o5Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        w8 w8Var = new w8();
        w8Var.a = this.a.listIterator(i);
        return w8Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    public x8(r5 r5Var) {
        this.a = r5Var;
    }
}
