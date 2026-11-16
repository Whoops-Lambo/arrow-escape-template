package com.fyber.inneractive.sdk.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class s1 extends t1 {
    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(long j, Object obj, Object obj2) {
        k1 k1VarB = (k1) x3.e(obj, j);
        k1 k1Var = (k1) x3.e(obj2, j);
        int size = k1VarB.size();
        int size2 = k1Var.size();
        if (size > 0 && size2 > 0) {
            if (!((c) k1VarB).a) {
                k1VarB = k1VarB.b(size2 + size);
            }
            k1VarB.addAll(k1Var);
        }
        if (size > 0) {
            k1Var = k1VarB;
        }
        x3.a(j, obj, k1Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final List b(Object obj, long j) {
        int i;
        k1 k1Var = (k1) x3.e(obj, j);
        if (!((c) k1Var).a) {
            int size = k1Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            k1 k1VarB = k1Var.b(i);
            x3.a(j, obj, k1VarB);
            return k1VarB;
        }
        return k1Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(Object obj, long j) {
        ((c) ((k1) x3.e(obj, j))).a = false;
    }
}
