package com.explorestack.protobuf;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i5 extends AbstractList {
    public final List a;
    public final h5 b;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.convert(this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    public i5(List list, h5 h5Var) {
        this.a = list;
        this.b = h5Var;
    }
}
