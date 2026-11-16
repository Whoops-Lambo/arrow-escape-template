package com.explorestack.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class o8 {
    public final boolean a(Object obj, k7 k7Var) throws InvalidProtocolBufferException {
        int tag = k7Var.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return false;
                        }
                        if (i2 == 5) {
                            ((t8) obj).b(5 | (i << 3), Integer.valueOf(k7Var.C()));
                            return true;
                        }
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    t8 t8VarA = t8.a();
                    int i3 = i << 3;
                    int i4 = i3 | 4;
                    while (k7Var.m() != Integer.MAX_VALUE && a(t8VarA, k7Var)) {
                    }
                    if (i4 == k7Var.getTag()) {
                        t8VarA.d = false;
                        ((t8) obj).b(i3 | 3, t8VarA);
                        return true;
                    }
                    throw InvalidProtocolBufferException.invalidEndTag();
                }
                ((t8) obj).b((i << 3) | 2, k7Var.g());
                return true;
            }
            ((t8) obj).b((i << 3) | 1, Long.valueOf(k7Var.s()));
            return true;
        }
        ((t8) obj).b(i << 3, Long.valueOf(k7Var.r()));
        return true;
    }
}
