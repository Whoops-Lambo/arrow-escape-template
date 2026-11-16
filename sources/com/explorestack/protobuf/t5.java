package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class t5 extends v5 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.explorestack.protobuf.v5
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) c9.c.l(j, obj);
        if (list instanceof s5) {
            objUnmodifiableList = ((s5) list).getUnmodifiableView();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof h7) && (list instanceof k5)) {
                e eVar = (e) ((k5) list);
                if (eVar.a) {
                    eVar.a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        c9.r(j, obj, objUnmodifiableList);
    }

    @Override // com.explorestack.protobuf.v5
    public final List b(long j, Object obj) {
        List listMutableCopyWithCapacity;
        List list = (List) c9.c.l(j, obj);
        if (list.isEmpty()) {
            if (list instanceof s5) {
                listMutableCopyWithCapacity = new r5(10);
            } else {
                listMutableCopyWithCapacity = ((list instanceof h7) && (list instanceof k5)) ? ((k5) list).mutableCopyWithCapacity(10) : new ArrayList(10);
            }
            c9.r(j, obj, listMutableCopyWithCapacity);
            return listMutableCopyWithCapacity;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + 10);
            arrayList.addAll(list);
            c9.r(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof x8) {
            x8 x8Var = (x8) list;
            r5 r5Var = new r5(x8Var.a.size() + 10);
            r5Var.addAll(x8Var);
            c9.r(j, obj, r5Var);
            return r5Var;
        }
        if (!(list instanceof h7) || !(list instanceof k5)) {
            return list;
        }
        k5 k5Var = (k5) list;
        if (((e) k5Var).a) {
            return list;
        }
        k5 k5VarMutableCopyWithCapacity = k5Var.mutableCopyWithCapacity(list.size() + 10);
        c9.r(j, obj, k5VarMutableCopyWithCapacity);
        return k5VarMutableCopyWithCapacity;
    }
}
