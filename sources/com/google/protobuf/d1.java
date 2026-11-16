package com.google.protobuf;

import defpackage.o03;
import defpackage.p03;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d1 extends e1 {
    @Override // com.google.protobuf.e1
    public final void a(long j, Object obj) {
        ((Internal.ProtobufList) p03.c.k(j, obj)).makeImmutable();
    }

    @Override // com.google.protobuf.e1
    public final void b(long j, Object obj, Object obj2) {
        o03 o03Var = p03.c;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) o03Var.k(j, obj);
        Internal.ProtobufList protobufList = (Internal.ProtobufList) o03Var.k(j, obj2);
        int size = protobufListMutableCopyWithCapacity2.size();
        int size2 = protobufList.size();
        if (size > 0 && size2 > 0) {
            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size2 + size);
            }
            protobufListMutableCopyWithCapacity2.addAll(protobufList);
        }
        if (size > 0) {
            protobufList = protobufListMutableCopyWithCapacity2;
        }
        p03.q(j, obj, protobufList);
    }

    @Override // com.google.protobuf.e1
    public final List c(long j, Object obj) {
        Internal.ProtobufList protobufList = (Internal.ProtobufList) p03.c.k(j, obj);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        p03.q(j, obj, protobufListMutableCopyWithCapacity2);
        return protobufListMutableCopyWithCapacity2;
    }
}
