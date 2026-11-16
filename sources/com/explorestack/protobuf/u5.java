package com.explorestack.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class u5 extends v5 {
    @Override // com.explorestack.protobuf.v5
    public final void a(long j, Object obj) {
        ((e) ((k5) c9.c.l(j, obj))).a = false;
    }

    @Override // com.explorestack.protobuf.v5
    public final List b(long j, Object obj) {
        k5 k5Var = (k5) c9.c.l(j, obj);
        if (((e) k5Var).a) {
            return k5Var;
        }
        int size = k5Var.size();
        k5 k5VarMutableCopyWithCapacity = k5Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        c9.r(j, obj, k5VarMutableCopyWithCapacity);
        return k5VarMutableCopyWithCapacity;
    }
}
