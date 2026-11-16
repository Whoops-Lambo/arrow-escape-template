package com.explorestack.protobuf;

import defpackage.m93;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class o6 implements m6 {
    @Override // com.explorestack.protobuf.m6
    public final Object c(Object obj) {
        ((l6) obj).a = false;
        return obj;
    }

    @Override // com.explorestack.protobuf.m6
    public final Object a(Object obj, Object obj2) {
        l6 l6Var;
        l6 l6Var2 = (l6) obj;
        l6 l6Var3 = (l6) obj2;
        if (!l6Var3.isEmpty()) {
            if (!l6Var2.a) {
                if (l6Var2.isEmpty()) {
                    l6Var = new l6();
                } else {
                    l6Var = new l6(l6Var2);
                    l6Var.a = true;
                }
                l6Var2 = l6Var;
            }
            l6Var2.f();
            if (!l6Var3.isEmpty()) {
                l6Var2.putAll(l6Var3);
            }
        }
        return l6Var2;
    }

    @Override // com.explorestack.protobuf.m6
    public final int d(int i, Object obj, Object obj2) {
        l6 l6Var = (l6) obj;
        if (obj2 != null) {
            m93.b();
            return 0;
        }
        if (!l6Var.isEmpty()) {
            Iterator it = l6Var.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
        return 0;
    }

    @Override // com.explorestack.protobuf.m6
    public final Map e(Object obj) {
        return (l6) obj;
    }

    @Override // com.explorestack.protobuf.m6
    public final boolean f(Object obj) {
        return !((l6) obj).a;
    }

    @Override // com.explorestack.protobuf.m6
    public final Object g(Object obj) {
        l6 l6Var = l6.b;
        if (l6Var.isEmpty()) {
            return new l6();
        }
        l6 l6Var2 = new l6(l6Var);
        l6Var2.a = true;
        return l6Var2;
    }

    @Override // com.explorestack.protobuf.m6
    public final e6 b(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }
}
