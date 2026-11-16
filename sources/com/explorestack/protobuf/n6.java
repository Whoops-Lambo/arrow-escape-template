package com.explorestack.protobuf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class n6 implements m6 {
    @Override // com.explorestack.protobuf.m6
    public final Object c(Object obj) {
        ((k6) obj).a = false;
        return obj;
    }

    @Override // com.explorestack.protobuf.m6
    public final int d(int i, Object obj, Object obj2) {
        int iU = 0;
        if (obj != null) {
            Map mapH = ((k6) obj).h();
            d6 d6Var = (d6) obj2;
            if (!mapH.isEmpty()) {
                for (Map.Entry entry : mapH.entrySet()) {
                    int iS = w.s(i);
                    c6 c6Var = d6Var.c;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    int iG = y3.g(c6Var.c, 2, value) + y3.g(c6Var.a, 1, key);
                    iU += w.u(iG) + iG + iS;
                }
                return iU;
            }
        }
        return 0;
    }

    @Override // com.explorestack.protobuf.m6
    public final Object a(Object obj, Object obj2) {
        k6 k6Var = (k6) obj;
        k6 k6Var2 = (k6) obj2;
        if (!k6Var.a) {
            k6Var.d();
        }
        k6Var.k(k6Var2);
        return k6Var;
    }

    @Override // com.explorestack.protobuf.m6
    public final e6 b(Object obj) {
        return ((d6) obj).c;
    }

    @Override // com.explorestack.protobuf.m6
    public final Map e(Object obj) {
        return ((k6) obj).j();
    }

    @Override // com.explorestack.protobuf.m6
    public final boolean f(Object obj) {
        return !((k6) obj).a;
    }

    @Override // com.explorestack.protobuf.m6
    public final Object g(Object obj) {
        return k6.l((d6) obj);
    }
}
