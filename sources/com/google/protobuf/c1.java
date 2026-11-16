package com.google.protobuf;

import defpackage.p03;
import defpackage.uy1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c1 extends e1 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i, long j, Object obj) {
        List listMutableCopyWithCapacity2;
        List list = (List) p03.c.k(j, obj);
        if (list.isEmpty()) {
            if (list instanceof LazyStringList) {
                listMutableCopyWithCapacity2 = new LazyStringArrayList(i);
            } else {
                listMutableCopyWithCapacity2 = ((list instanceof uy1) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i) : new ArrayList(i);
            }
            p03.q(j, obj, listMutableCopyWithCapacity2);
            return listMutableCopyWithCapacity2;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            p03.q(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof UnmodifiableLazyStringList) {
            LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + i);
            lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
            p03.q(j, obj, lazyStringArrayList);
            return lazyStringArrayList;
        }
        if ((list instanceof uy1) && (list instanceof Internal.ProtobufList)) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
            if (!protobufList.isModifiable()) {
                Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i);
                p03.q(j, obj, protobufListMutableCopyWithCapacity2);
                return protobufListMutableCopyWithCapacity2;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.e1
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) p03.c.k(j, obj);
        if (list instanceof LazyStringList) {
            objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof uy1) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    protobufList.makeImmutable();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        p03.q(j, obj, objUnmodifiableList);
    }

    @Override // com.google.protobuf.e1
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) p03.c.k(j, obj2);
        List listD = d(list.size(), j, obj);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        p03.q(j, obj, list);
    }

    @Override // com.google.protobuf.e1
    public final List c(long j, Object obj) {
        return d(10, j, obj);
    }
}
