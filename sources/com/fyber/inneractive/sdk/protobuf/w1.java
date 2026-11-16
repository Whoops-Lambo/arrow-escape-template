package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class w1 implements b2 {
    public final b2[] a;

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final boolean a(Class cls) {
        for (b2 b2Var : this.a) {
            if (b2Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final r2 b(Class cls) {
        for (b2 b2Var : this.a) {
            if (b2Var.a(cls)) {
                return b2Var.b(cls);
            }
        }
        defpackage.d.u("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public w1(b2... b2VarArr) {
        this.a = b2VarArr;
    }
}
