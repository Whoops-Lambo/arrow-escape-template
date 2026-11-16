package com.explorestack.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class y5 implements q6 {
    public q6[] a;

    @Override // com.explorestack.protobuf.q6
    public final e8 a(Class cls) {
        for (q6 q6Var : this.a) {
            if (q6Var.b(cls)) {
                return q6Var.a(cls);
            }
        }
        defpackage.d.u("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.explorestack.protobuf.q6
    public final boolean b(Class cls) {
        for (q6 q6Var : this.a) {
            if (q6Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
