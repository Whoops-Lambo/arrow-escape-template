package com.explorestack.protobuf;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class p4 implements k4 {
    public final Class a;
    public final o4 b;

    @Override // com.explorestack.protobuf.k4
    public final Message.Builder a(g4 g4Var) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // com.explorestack.protobuf.k4
    public Object b(g4 g4Var, int i) {
        return y4.access$1100(this.b.d, g4Var, new Object[]{Integer.valueOf(i)});
    }

    @Override // com.explorestack.protobuf.k4
    public void c(g4 g4Var, Object obj) {
        y4.access$1100(this.b.f, g4Var, new Object[]{obj});
    }

    @Override // com.explorestack.protobuf.k4
    public Object d(int i, y4 y4Var) {
        return y4.access$1100(this.b.c, y4Var, new Object[]{Integer.valueOf(i)});
    }

    @Override // com.explorestack.protobuf.k4
    public final boolean e(y4 y4Var) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.explorestack.protobuf.k4
    public final boolean f(g4 g4Var) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.explorestack.protobuf.k4
    public final int g(y4 y4Var) {
        return ((Integer) y4.access$1100(this.b.g, y4Var, new Object[0])).intValue();
    }

    @Override // com.explorestack.protobuf.k4
    public final void h(g4 g4Var) {
        y4.access$1100(this.b.i, g4Var, new Object[0]);
    }

    @Override // com.explorestack.protobuf.k4
    public Message.Builder i(g4 g4Var, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }

    @Override // com.explorestack.protobuf.k4
    public Object k(y4 y4Var) {
        return y4.access$1100(this.b.a, y4Var, new Object[0]);
    }

    @Override // com.explorestack.protobuf.k4
    public void m(g4 g4Var, int i, Object obj) {
        y4.access$1100(this.b.e, g4Var, new Object[]{Integer.valueOf(i), obj});
    }

    @Override // com.explorestack.protobuf.k4
    public Message.Builder n() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // com.explorestack.protobuf.k4
    public final int o(g4 g4Var) {
        return ((Integer) y4.access$1100(this.b.h, g4Var, new Object[0])).intValue();
    }

    @Override // com.explorestack.protobuf.k4
    public Object p(g4 g4Var) {
        return y4.access$1100(this.b.b, g4Var, new Object[0]);
    }

    public p4(String str, Class cls, Class cls2) {
        o4 o4Var = new o4(str, cls, cls2);
        this.a = o4Var.c.getReturnType();
        this.b = o4Var;
    }

    @Override // com.explorestack.protobuf.k4
    public final void j(g4 g4Var, Object obj) {
        h(g4Var);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            c(g4Var, it.next());
        }
    }

    @Override // com.explorestack.protobuf.k4
    public final Object l(y4 y4Var) {
        return k(y4Var);
    }
}
