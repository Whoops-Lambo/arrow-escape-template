package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class q1 implements Internal.EnumVerifier {
    public static final q1 a = new q1();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        if (NullValue.forNumber(i) != null) {
            return true;
        }
        return false;
    }
}
